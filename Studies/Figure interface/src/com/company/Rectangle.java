package com.company;

public class Rectangle implements Figure {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double area() {
        return a * b;
    }

    @Override
    public Double circumference() {
        return 2 * (a + b);
    }
}
