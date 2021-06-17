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
    }

    private static final double CACHED_RANDOM = Math.random() * 100D / Double.MAX_EXPONENT;

    private static final double BRUTE_FORCE_CONSTANT = Math.log10(Math.cbrt(Math.cos(Math.floor(3535.5) * Math.random() * Double.MAX_EXPONENT)));

    public static void bruteforce(final Equation... equations) throws BruteForceInterpolationException {

        /*
         * We don't need to brute force any non interpolated equations
         *
         * We make it parallel multiple times due to multi threading and save perfomance, I know 300 IQ
         */
        for (Equation equation : equations) {
            equation.setInterpolated(true);

            final double bruteForcedInterpolation =
                    Math.log10(
                            Math.floor(
                                    Math.atan(
                                            Math.abs((CACHED_RANDOM * 4.71D) / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000/ Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2/ Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2 / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                                    * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                                    % 1 * 4.71D) / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            * 50 % 2 / 6113 * Math.PI / Math.E * 5000 % Math.random() * .2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                            % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                            / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                            / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                            / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT)));

            for (int i = 0; i < bruteForcedInterpolation * 50; ++i) {
                int finalI = i;
                new Thread(() -> {
                    new Thread(() -> {
                        CompletableFuture.runAsync(() -> {
                            CompletableFuture.runAsync(() -> {
                                equation.setMath(Math.cos(bruteForcedInterpolation) * Math.floorDiv(2, (int) (Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                        % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                        % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                        / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                        % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                        / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                        / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                        / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT * Double.MAX_VALUE)) * finalI * bruteForcedInterpolation);
                            });
                        });
                    }).start();
                }).start();
            }
        }
    }
}