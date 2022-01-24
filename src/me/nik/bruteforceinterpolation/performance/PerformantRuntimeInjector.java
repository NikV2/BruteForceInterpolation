package me.nik.bruteforceinterpolation.performance;

import fake.java.Runtime;
import me.nik.bruteforceinterpolation.exceptions.BruteForceInterpolationException;
import sun.misc.Unsafe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

/**
 * Special injector that is required to replace {@link java.lang.Runtime}.
 * <p>
 * {@link java.lang.Runtime} has a private constructor, so the compiler will forbid simply extending it. This is
 * circumvented by having {@link PerformantHyperInterpolationRuntime} extend the {@link fake.java.Runtime}, loading it
 * as a resource, and replacing the superclass in the bytecode. The replaced bytecode can then be declared as a class,
 * using {@link Unsafe} be instantiated without invoking the constructor and then be assigned to the private
 * static {@code currentRuntime} field in {@link java.lang.Runtime}.
 */
public class PerformantRuntimeInjector {
    private static final byte[] FAKE_RUNTIME_BYTES = bytecodeClassName(Runtime.class);
    private static final byte[] JAVA_RUNTIME_BYTES = bytecodeClassName(java.lang.Runtime.class);

    public static void inject(Class<? extends Runtime> runtimeType) {
        byte[] bytecode = loadClassBytecode(runtimeType);

        // replace all mentions of the fake runtime superclass with the real one
        byte[] modifiedBytecode = replaceSubArray(bytecode, FAKE_RUNTIME_BYTES, JAVA_RUNTIME_BYTES);

        // this class now has java.lang.Runtime as its superclass
        Class<?> modifiedClass = loadClassWithBytecode(runtimeType.getName(), modifiedBytecode);

        Unsafe unsafe = obtainUnsafe();

        // allocate a new instance, this is now a java.lang.Runtime, but with the custom implementation
        java.lang.Runtime customRuntime;
        try {
            customRuntime = (java.lang.Runtime) unsafe.allocateInstance(modifiedClass);
        } catch (InstantiationException e) {
            throw new BruteForceInterpolationException("Could not allocate modified runtime type");
        }

        // replace the currentRuntime field in the java.lang.Runtime class
        for (Field field : java.lang.Runtime.class.getDeclaredFields()) {
            if (!java.lang.Runtime.class.isAssignableFrom(field.getType())) {
                continue;
            }

            // base object for interaction with static properties through unsafe
            Object base = unsafe.staticFieldBase(field);
            // offset of the field in memory
            long offset = unsafe.staticFieldOffset(field);

            // set the field
            unsafe.getAndSetObject(base, offset, customRuntime);
        }

        // Runtime.getRuntime() now returns customRuntime!
    }

    /**
     * Obtains an instance of {@link Unsafe}, circumventing the security checks put in place by
     * {@link Unsafe#getUnsafe()}.
     */
    private static Unsafe obtainUnsafe() {
        Class<Unsafe> unsafeClass = Unsafe.class;

        // go through the fields, the field containing the unsafe isntance is internal and has different names on
        // some jvms
        for (Field field : unsafeClass.getDeclaredFields()) {
            if (!Unsafe.class.isAssignableFrom(field.getType())) {
                continue;
            }

            field.setAccessible(true);

            try {
                return (Unsafe) field.get(null);
            } catch (IllegalAccessException e) {
                // bruh what
            }
        }

        throw new BruteForceInterpolationException("Could not get unsafe instance");
    }

    /**
     * Load the bytecode for a given class.
     */
    private static byte[] loadClassBytecode(Class<?> type) {
        String path = type.getName().replace('.', '/').concat(".class");
        try (
                InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
                ByteArrayOutputStream output = new ByteArrayOutputStream()
        ) {
            if (input == null) {
                throw new BruteForceInterpolationException("Could find bytecode for class " + type.getName());
            }

            int nRead;
            byte[] data = new byte[4];

            while ((nRead = input.read(data, 0, data.length)) != -1) {
                output.write(data, 0, nRead);
            }

            return output.toByteArray();
        } catch (IOException e) {
            throw new BruteForceInterpolationException("Could not load bytecode for class " + type.getName());
        }
    }

    /**
     * Get the constant pool representation of name of the given class.
     */
    private static byte[] bytecodeClassName(Class<?> type) {
        return type.getName().replace('.', '/').getBytes(StandardCharsets.UTF_8);
    }

    /**
     * Replace all occurences of {@code search} in {@code data} with {@code replacement}
     */
    private static byte[] replaceSubArray(byte[] data, byte[] search, byte[] replacement) {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length)) {

            for (int i = 0; i < data.length; i++) {
                boolean replaceAtCurrentPosition = true;
                for (int searchIndex = 0; searchIndex < search.length; searchIndex++) {
                    int dataSearchIndex = i + searchIndex;

                    if (dataSearchIndex >= data.length || data[dataSearchIndex] != search[searchIndex]) {
                        replaceAtCurrentPosition = false;
                        break;
                    }
                }

                if (replaceAtCurrentPosition) {
                    outputStream.write(replacement);
                    i += search.length;
                } else {
                    outputStream.write(data[i]);
                }
            }

            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new BruteForceInterpolationException("Failed to replace sub array");
        }
    }

    private static Class<?> loadClassWithBytecode(String name, byte[] bytes) {
        ClassLoader parentLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader loader = new SingleMemoryClassLoader(parentLoader, name, bytes);

        try {
            return loader.loadClass(name);
        } catch (ClassNotFoundException e) {
            throw new BruteForceInterpolationException("Failed to load class " + name + " from memory");
        }
    }
}
