package com.company;

public class LinearFunction implements Function {
    int a, b;

    public LinearFunction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double f(double x) {
        return a * x + b;
    }

    @Override
    public String formula() {
        return "f(x) = " + a + " * x + " + b;
    }
}
