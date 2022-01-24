package me.nik.bruteforceinterpolation.performance;

import fake.java.Runtime;

/**
 * Faster runtime with thousands of CPU cores.
 */
public class PerformantHyperInterpolationRuntime extends Runtime {
    @Override
    public int availableProcessors() {
        return 8192;
    }
}
