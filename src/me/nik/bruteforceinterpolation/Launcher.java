package me.nik.bruteforceinterpolation;

import java.lang.reflect.Method;

public class Launcher {

    public static void main(String[] args) {
        new Thread(() -> {
            try {

                Class<?> clazz = Class.forName("me.nik.bruteforceinterpolation.BruteForceInterpolation");
                Method method = clazz.getDeclaredMethod("main");
                while(true) {
                    method.invoke(clazz.newInstance());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
