import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Give x value of a point:");
        double px = s.nextDouble();
        System.out.println("Give y value of a point:");
        double py = s.nextDouble();

        Point p = new Point(px, py);

        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(0, 2);

        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1.area());
        if (t1.doesPointBelong(p)) {
            System.out.println("Nalezy");
        } else {
            System.out.println("Nie nalezy");
        }
    }
}
