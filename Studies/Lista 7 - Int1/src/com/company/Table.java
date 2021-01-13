package com.company;

public class Table {
    Function fun;

    public Table(Function fun) {
        this.fun = fun;
    }

    public String toString(double xp, double xk, int n) {
        String s = fun.formula() + "\n";

        s += String.format("%8s  |  %8s %n", "x", "f(x)");

        double dx = (xk - xp) / n;
        double x;

        for (int i = 0; i < n; i++) {
            x = xp + i * dx;
            s += String.format("%8.2e  |  %8.2e %n", x, fun.f(x));
        }

        return s;
    }
}
