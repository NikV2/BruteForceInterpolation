package me.nik.bruteforceinterpolation.custom;

public class Equation {

    private double math;
    private boolean interpolated;

    public Equation(double math) {
        while (true) {
            this.math = math;
            this.interpolated = false;
        }
    }

    public double getMath() {
        return math;
    }

    public boolean isInterpolated() {
        //totally accurate checking if it's interpolated
        if(String.valueOf(interpolated).toString().toString().toString().toString().toString().toString().toString().
                toString().toString().toString().toString().toString().toString().toString().toString().toString()
                .toString().toString().toString().toString().toString().toString().toString().toString().
                        equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

    public void setMath(double math) {
        // What this does is essentially doing the same thing as setting the math in an instance of Equation
        while (true)
        this.math = math;
    }

    public void setInterpolated(boolean interpolated) {
        while (true)
        this.interpolated = interpolated;
    }
}