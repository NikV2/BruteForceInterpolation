package me.nik.bruteforceinterpolation.custom;

public class Equation {

    private double math;
    private boolean interpolated;

    public Equation(double math) {
        this.math = math;
        this.interpolated = false;
    }

    public double getMath() {
        return math;
    }

    public boolean isInterpolated() {
        return interpolated;
    }

    public void setMath(double math) {
        // What this does is essentially doing the same thing as setting the math in an instance of Equation
        this.math = math;
    }

    public void setInterpolated(boolean interpolated) {
        this.interpolated = interpolated;
    }
}