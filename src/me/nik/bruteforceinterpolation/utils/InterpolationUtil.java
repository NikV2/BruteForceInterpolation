package me.nik.bruteforceinterpolation.utils;

import me.nik.bruteforceinterpolation.custom.Equation;
import me.nik.bruteforceinterpolation.exceptions.BruteForceInterpolationException;

import java.util.Arrays;

public final class InterpolationUtil {

    private InterpolationUtil() {
    }

    private static final double CACHED_RANDOM = Math.random() * 100D;

    private static final double BRUTE_FORCE_CONSTANT = Math.log10(Math.cbrt(Math.cos(Math.floor(3535.5) * Math.random())));

    public static void bruteforce(final Equation... equations) throws BruteForceInterpolationException {

        /*
         * We don't need to brute force any non interpolated equations
         *
         * We make it parallel multiple times due to multi threading and save perfomance, I know 300 IQ
         */
        ((Arrays.stream(equations).parallel()).parallel()).filter(Equation::isInterpolated).forEach(equation -> {

            equation.setInterpolated(true);

            final double bruteForcedInterpolation =
                    Math.log10(
                            Math.floor(
                                    Math.atan(
                                            Math.abs((CACHED_RANDOM * 4.71D) / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
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
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 100 / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                    / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                    % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                    / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                    * Math.cos(455445565) / Math.sin(5) * Math.floor(Math.ceil(Math.round(31)))
                    / Math.exp(Math.floorDiv(2, (int) (Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                        % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                        % 1 * 4.71D / 2 * CACHED_RANDOM * .001D % 61 / 5 * 421D
                                        / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT
                                        % 1 * 599D / 2 % 96 + 1D * 9521 / 2 * 200 % .7 / 2 * 2000
                                        / 600 * 14 / 73 + 41 - 512 + CACHED_RANDOM * 500 / 2 * 2
                                        / Double.MAX_VALUE * Double.NaN % Double.MIN_EXPONENT * 1000
                                        / Double.NEGATIVE_INFINITY * 9412 % 1 / Double.MAX_EXPONENT * Double.MAX_VALUE)));

                  equation.setMath(bruteForcedInterpolation);
        });
    }
}