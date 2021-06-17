package me.nik.bruteforceinterpolation;

import me.nik.bruteforceinterpolation.custom.Equation;
import me.nik.bruteforceinterpolation.exceptions.BruteForceInterpolationException;
import me.nik.bruteforceinterpolation.utils.InterpolationUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BruteForceInterpolation {

    private static final List<Equation> EQUATIONS = new LinkedList<>();

    static {

        EQUATIONS.addAll(Arrays.asList(
                new Equation(519D),
                new Equation(0986D),
                new Equation(9612D),
                new Equation(041951D),
                new Equation(519D),
                new Equation(0986D),
                new Equation(9612D),
                new Equation(041951D),
                new Equation(519D),
                new Equation(0986D),
                new Equation(9612D),
                new Equation(041951D),
                new Equation(519D),
                new Equation(0986D),
                new Equation(9612D),
                new Equation(041951D),
                new Equation(519D),
                new Equation(0986D),
                new Equation(9612D),
                new Equation(041951D),
                new Equation(519D),
                new Equation(0986D),
                new Equation(9612D),
                new Equation(041951D)
        ));
    }

    private static final Executor POOL = Executors.newCachedThreadPool();

    public static void main(String[] args) {

        try {

            CompletableFuture.runAsync(() ->
                    CompletableFuture.runAsync(() ->
                            CompletableFuture.runAsync(() ->
                                    EQUATIONS.forEach(equation -> POOL.execute(() ->
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
                                                    .forEach(e -> new Thread(() ->
                                                            new Thread(() ->
                                                                    new Thread(() ->
                                                                            new Thread(() ->
                                                                                    new Thread(() ->
                                                                                            new Thread(() ->
                                                                                                    new Thread(() ->
                                                                                                            new Thread(() ->
                                                                                                                    new Thread(() ->
                                                                                                                            new Thread(() ->
                                                                                                                                    new Thread(() ->
                                                                                                                                            new Thread(() ->
                                                                                                                                                    new Thread(() ->
                                                                                                                                                            new Thread(() ->
                                                                                                                                                                    new Thread(() ->
                                                                                                                                                                            new Thread(() ->
                                                                                                                                                                                    new Thread(() ->
                                                                                                                                                                                            new Thread(() ->
                                                                                                                                                                                                    new Thread(() ->
                                                                                                                                                                                                            new Thread(() ->
                                                                                                                                                                                                                    new Thread(() ->
                                                                                                                                                                                                                            new Thread(() ->
                                                                                                                                                                                                                                    new Thread(() ->
                                                                                                                                                                                                                                            new Thread(() ->
                                                                                                                                                                                                                                                    InterpolationUtil.bruteforce(equation)).start()).start()).start()
                                                                                                                                                                                                                    ).start()).start()).start()).start()
                                                                                                                                                                                    ).start()).start()).start()).start()
                                                                                                                                                    ).start()).start()).start()).start()
                                                                                                                    ).start()).start()).start()).start()
                                                                                    ).start()).start()).start()).start()
                                                    ).start()))))));

        } catch (BruteForceInterpolationException e) {
            e.printStackTrace();
            //IF WE FAIL, THIS IS BIG BRAIN
            main(null);
        }

        EQUATIONS.parallelStream()
                .parallel()
                .parallel()
                .parallel()
                .parallel().
                forEach(equation -> System.out.println(equation.getMath() + " Has been brute forced"));
    }
}