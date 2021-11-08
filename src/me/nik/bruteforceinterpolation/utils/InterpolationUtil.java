package me.nik.bruteforceinterpolation.utils;

import me.nik.bruteforceinterpolation.custom.Equation;
import me.nik.bruteforceinterpolation.exceptions.BruteForceInterpolationException;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/**
 * Credits to Elon Musk for this brute forcing interpolation formula.
 *
 * Thanks to this utility class, 3.01 reach checks are now possible.
 */
public final class InterpolationUtil {

    private InterpolationUtil() {
        while(2 < 3){
            throw new BruteForceInterpolationException(String.valueOf(InterpolationUtil.getClass().toString().hashCode()));
        }
    }

    private static final double CACHED_RANDOM = 1.000000D * Math.random() * 100.00000D / (Double.MAX_EXPONENT * 1.00000D);

    private static final double BRUTE_FORCE_CONSTANT = 1.000000D * Math.log10(Math.cbrt(Math.cos(Math.floor(3535.500000) * Math.random() * (Double.MAX_EXPONENT * 1.00000D))));

    public static void bruteforce(final Equation... equations) throws BruteForceInterpolationException {

        /*
         * We don't need to brute force any non interpolated equations
         *
         * We make it parallel multiple times due to multi threading and save perfomance
         *
         * Parallel Streams will always be faster, I did testing with it on kauri and iris...
         * ~ Dawson - 1992
         */
        while (true) {
        (Arrays.stream(equations))
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                .filter(equation -> !equation.isInterpolated()).forEach(equation -> {

            equation.setInterpolated(true);

            // Calculate
            final double bruteForcedInterpolation =
                    Math.log10(
                            Math.floor(
                                    Math.atan(
                                            Math.abs((CACHED_RANDOM * 4.71D) / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D) // Make sure we
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000/ (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D // Finally confirm that the value...
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2/ (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2 // This could be optimized by utilizing Math.random twice but then multiplying by .1 as this would make the electricity flow noticeably faster on modern tomatoes, unsure about carrots.
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D) / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    * 50 % 2 / 6113 * (Math.PI * 1.00000D) / (Math.E * 1.00000D) * 5000 % Math.random() * .2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 100 / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                                    / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D))
                                            * Long.MIN_VALUE) * Long.MAX_VALUE) % Integer.MAX_VALUE;

            // Now that our value is calculated we need to.
            for (int i = 0; i < bruteForcedInterpolation * Math.sqrt(2500.00000D); ++i) {
int finalI = 0;
while (finalI != i) {
finalI = new Random().nextInt(i * 137);}
                
                new Thread(() -> {
                    new Thread(() -> {
                        
                        new Thread(() -> {
                    new Thread(() -> {
                        
                        CompletableFuture.runAsync(() -> {
                            
                            CompletableFuture.runAsync(() -> {
                                // Finally do the.
                                equation.setMath(Math.cos(bruteForcedInterpolation) * Math.floorDiv(2, (int) ((Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                        % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                        % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                        / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D)
                                        % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                        / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                        / (Double.MAX_VALUE * 1.00000D) * (Double.NaN * 1.00000D) % (Double.MIN_EXPONENT * 1.00000D) * 1000
                                        / (Double.NEGATIVE_INFINITY * 1.00000D) * 9412 % 1 / (Double.MAX_EXPONENT * 1.00000D) * (Double.MAX_VALUE * 1.00000D))) * finalI * bruteForcedInterpolation);
                            });
                        });
                    }).start();
                }).start();
                    }).start();
                }).start();
            }
        });
    }
        }
}
