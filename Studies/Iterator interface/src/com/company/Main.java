package com.company;

public class Main {
    public static void displayList(Iterator Iter) {
        for (Iter.first(); !Iter.isDone(); Iter.next()) {
            Student student = (Student) Iter.current();
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Student[] students = new Student[5];
        students[0] = new Student(1,500);
        students[1] = new Student(2,400);
        students[2] = new Student(3,0);
        students[3] = new Student(4,500);
        students[4] = new Student(5,700);

        Iterator tableIterator = new TableIterator(students);

        // full student list
        displayList(tableIterator);

        System.out.println("");

        // filtered student list
        Predicate studentWithScholarship = new StudentWithScholarship();
        Iterator filteringIterator = new FilteringIterator(tableIterator, studentWithScholarship);
        displayList(filteringIterator);

    }


}
