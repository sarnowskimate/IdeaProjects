package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Function f1 = new ExponentialFunction(1,2);
        Table t1 = new Table(f1);
        System.out.println(t1.toString(1, 10, 9));

        Function f2 = new LinearFunction(2, 2);
        Table t2 = new Table(f2);
        System.out.println(t2.toString(1, 10, 9));
    }
}
