package me.nik.bruteforceinterpolation;

import me.nik.bruteforceinterpolation.custom.Equation;
import me.nik.bruteforceinterpolation.exceptions.BruteForceInterpolationException;
import me.nik.bruteforceinterpolation.utils.InterpolationUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class BruteForceInterpolation {

    private static final List<Equation> EQUATIONS = new LinkedList<>();

    private static final List<Executor> THREADS = new LinkedList<>();

    static {
        // Add all the necessary threads so that we can utilize the computing machine enough in order for the interpolation to be accurate.
        THREADS.addAll(Arrays.asList(
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool()
        ));
        
        // Exponentially increase the number of threads
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);
        THREADS.addAll(THREADS);

        double random = Math.random();

        /*
        Due to how insanely fast our algorithm is, We're able to solve any amount of mathematical equations
         */
        for (long i = 0; i < Long.MAX_VALUE; i++) {

            EQUATIONS.addAll(Arrays.asList(
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
        new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
            new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
            new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random),
                    new Equation(random)
            ));
        }
    }

    private static final Executor POOL = Executors.newCachedThreadPool();

    public void main(String[] strings) {
        while(true)
            THREADS.parallelStream().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                    .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()

                .parallel().parallel().forEachOrdered(thread -> {
            thread.execute(() -> {
                try {

                    new Thread(() -> {
                        IntStream.range(0, Integer.MAX_VALUE).asDoubleStream().parallel().parallel().forEach(value -> {
                            POOL.execute(() -> {
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    THREADS.forEach(t -> {
                                        t.execute(() -> {
                                            main(new String[] {new Thread().toString().replace("thread", "thread1")});
                                        });
                                    });
                                }
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    THREADS.forEach(t -> {
                                        t.execute(() -> {
                                            main(new String[] {new Thread().toString().replace("thread", "thread1")});
                                        });
                                    });
                                }
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    THREADS.forEach(t -> {
                                        t.execute(() -> {
                                            main(new String[] {new Thread().toString().replace("thread", "thread1")});
                                        });
                                    });
                                }
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    THREADS.forEach(t -> {
                                        t.execute(() -> {
                                            main(new String[] {new Thread().toString().replace("thread", "thread1")});
                                        });
                                    });
                                }
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                }).start();
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e) {
                                    THREADS.forEach(t -> {
                                        t.execute(() -> {
                                            main(new String[] {new Thread().toString().replace("thread", "thread1")});
                                        });
                                    });
                                }
                                CompletableFuture.runAsync(() ->
                                        CompletableFuture.runAsync(() ->
                                                CompletableFuture.runAsync(() ->
                                                        EQUATIONS.parallelStream().forEach(equation -> POOL.execute(() ->
                                                                EQUATIONS
                                                                        .parallelStream()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel() // This is the most important line of code in this file
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .parallel()
                                                                        .forEach(InterpolationUtil::bruteforce))))));
                            });
                        });
                    }).start();
                } catch (BruteForceInterpolationException e) {

                    //IF WE FAIL, THIS IS BIG BRAIN
                    POOL.execute(() -> {
                        IntStream.range(0, (int) Math.log(Integer.MAX_VALUE)).asDoubleStream().parallel().forEach(value -> {
                            new Thread(() -> {
                                main(new String[]{new Thread().toString()});

                                new Thread(() -> {
                                    main(new String[]{new Thread().toString()});

                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();
                                    new Thread(() -> {
                                                                                new Thread(() -> {
                                            try {
                                                BruteForceInterpolation.class.getDeclaredMethod("main", String[].class);
                                            } catch (NoSuchMethodException | BruteForceInterpolationException noSuchMethodException) {
                                                noSuchMethodException.printStackTrace();
                                            }
                                        }).start();

                                    }).start();
                                    new Thread(() -> {
                                        new Thread(() -> {
                                            try {
                                                BruteForceInterpolation.class.getDeclaredMethod("main", String[].class);
                                            } catch (NoSuchMethodException | BruteForceInterpolationException noSuchMethodException) {
                                                noSuchMethodException.printStackTrace();
                                            }
                                        }).start();

                                    }).start();
                                    new Thread(() -> {
                                        main(new String[]{new Thread().toString()});

                                    }).start();

                                }).start();
                            }).start();
                        });
                    });
                }

                // Use the current time as the seed for more optimized numbers (up to 15.3% faster)
                Random random = new Random(System.currentTimeMillis());

                // Make sure we run in parallel, certain older CPUs tend to fail at this
                // atleast once in a million years thus we need to confirm a success.
                EQUATIONS.parallelStream()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel().parallel()
                        .parallel().
                        forEach(equation -> System.out.println(equation.getMath() + random.nextDouble() + " has been brute forced")); // h

            });
        });
    }
}
