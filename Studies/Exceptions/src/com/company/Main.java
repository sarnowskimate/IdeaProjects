package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TestObject to = new TestObject(new Object());

        // 1st case
        if (to == null) {
            throw new NullPointerException("The object is null");
        }

        // 2nd case
        try {
            // instructions that may cause exception
        } catch (NullPointerException e) {
            // exception handling
        }


    }
}
