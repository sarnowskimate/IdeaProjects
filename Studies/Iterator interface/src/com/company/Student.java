package com.company;

public class Student {
    private int id;
    private double scholarshipAmount;

    Iterator iterator;
    // while-loop

    public Student(int id, double scholarshipAmount) {
        this.id = id;
        this.scholarshipAmount = scholarshipAmount;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public String toString() {
        return String.format("%6d %8.2f", id, scholarshipAmount);
    }
}
