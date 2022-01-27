package fake.java;

/**
 * Runtime class that mimics some aspects of {@link java.lang.Runtime}, allowing other classes to easily fake method
 * signatures from {@link java.lang.Runtime}. The fully qualified name has the same length as "java.lang.Runtime" on
 * purpose to make replacing it in bytecode easier.
 */
public class Runtime {
    public native int availableProcessors();
}
