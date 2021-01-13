package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person[] tripParticipants = new Person[4];
        tripParticipants[0] = new Person("Mateusz", "Sarnowski", "93030803578", 100);
        tripParticipants[1] = new Person("Monika", "Kwiatkowska", "95021099999", 90);
        tripParticipants[2] = new Person("Katarzyna", "Sarnowska", "69052699999", 200);
        tripParticipants[3] = new Person("Blazej", "Ochocki", "95092299999", 68);

        Item[] items = new Item[5];
        items[0] = new Item("Laptop", 4000, 3000);
        items[1] = new Item("Myszka", 300, 200);
        items[2] = new Item("Monitor", 2000, 1600);
        items[3] = new Item("Drukarka", 700, 650);
        items[4] = new Item("Telefon", 1200, 990);

        // option 1
        Trip t1 = new Trip("Trip to mountains.", tripParticipants);
        Promotion p1 = new Promotion("Christmas sales.", items);

        Wykaz wyk1 = new Wykaz(t1);
        Wykaz wyk2 = new Wykaz(p1);

        System.out.println(wyk1);
        System.out.println(wyk2);

    }
}
