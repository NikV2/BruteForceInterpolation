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
import java.util.stream.IntStream;

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

            new Thread(() -> {
                IntStream.range(0, Integer.MAX_VALUE).asDoubleStream().parallel().parallel().forEach(value -> {
                    POOL.execute(() -> {
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
                                main(new String[]{new Thread().toString()});

                            }).start();
                            new Thread(() -> {
                                main(new String[]{new Thread().toString()});

                            }).start();
                            new Thread(() -> {
                                main(new String[]{new Thread().toString()});

                            }).start();

                        }).start();
                    }).start();
                });
            });
        }

        EQUATIONS.parallelStream()
                .parallel()
                .parallel()
                .parallel()
                .parallel().
                forEach(equation -> System.out.println(equation.getMath() + " Has been brute forced"));
    }
}