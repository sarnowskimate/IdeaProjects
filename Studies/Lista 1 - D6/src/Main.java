import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter current date.");
//        System.out.println("Enter year: ");
//        int year = s.nextInt();
//        System.out.println("Enter month: ");
//        int month = s.nextInt();
//        System.out.println("Enter day: ");
//        int day = s.nextInt();
//
//        CustomDate date1 = new CustomDate(year, month, day);
//        System.out.println(date1);
//        CustomDate date1 = new CustomDate(year, month, day);
//        System.out.println(date1);
        CustomDate date2 = new CustomDate(2000, 12, 31);
//        date2.tommorow();
//        System.out.println(date2);

        date2.tommorow();
        System.out.println(date2);

        date2.yesterday();
        System.out.println(date2);

    }
}
