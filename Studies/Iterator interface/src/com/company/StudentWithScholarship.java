package com.company;

public class StudentWithScholarship implements Predicate {
    @Override
    public boolean accept(Object o) {
        Student s = (Student) o;
        return s.getScholarshipAmount() > 0;
    }
}
