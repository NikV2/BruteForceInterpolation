package me.nik.bruteforceinterpolation.performance;

/**
 * {@link java.lang.ClassLoader} implementation that is has a single class in memory that it can load. All other calls
 * are delegated to the parent.
 */
public class SingleMemoryClassLoader extends ClassLoader {
    private final String className;
    private final byte[] bytecode;

    public SingleMemoryClassLoader(ClassLoader parent, String className, byte[] bytecode) {
        super(parent);
        this.className = className;
        this.bytecode = bytecode;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (!name.equals(this.className)) {
            return super.loadClass(name, true);
        }

        // lmao
        return defineClass(name, bytecode, 0, bytecode.length);
    }
}
