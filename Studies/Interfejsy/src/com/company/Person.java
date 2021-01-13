package com.company;

public class Person {
    private final String name;
    private final String surname;
    private final String id;
    private final double payment;

    public Person(String name, String surname, String id, double payment) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public double getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %8.2f", name, surname, id, payment);
    }
}