package com.company;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public Double area() {
        return a * a;
    }

    @Override
    public Double circumference() {
        return 4 * a;
    }
}
