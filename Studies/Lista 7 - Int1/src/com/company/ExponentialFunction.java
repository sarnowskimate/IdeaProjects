package com.company;

public class ExponentialFunction implements Function {
    private int a, k;

    public ExponentialFunction(int a, int k) {
        this.a = a;
        this.k = k;
    }

    @Override
    public double f(double x) {
        return a*Math.exp(-k*x);
    }

    @Override
    public String formula() {
        return "f(x) = " + a + " * exp(-" + k + " * x)";
    }
}
