package com.company;

public class Circle implements Figure {
    private final double pi = Math.PI;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public Double area() {
        return pi * r * r;
    }

    @Override
    public Double circumference() {
        return 2 * pi * r;
    }
}
