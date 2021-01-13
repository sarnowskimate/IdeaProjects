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

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3);
        Circle c4 = new Circle(4);

        Ring r12 = new Ring(c1, c2);
        Ring r23 = new Ring(c2, c3);
        Ring r34 = new Ring(c3, c4);

        if (c1.doesBelongToCircle(p)) {
            System.out.println("Nalezy do c1.");
        }
        if (r12.doesBelongToRing(p)) {
            System.out.println("Nalezy do r12.");
        }
        if (r23.doesBelongToRing(p)) {
            System.out.println("Nalezy do r23.");
        }
        if (r34.doesBelongToRing(p)) {
            System.out.println("Nalezy do r34.");
        }
    }

//    public static class Podpunkt() {
//
//        Point p = new Point()
//
//        Circle c1 = new Circle(new Point(1.0, 1.0), 1);
//        Circle c2 = new Circle(new Point(-1.0, 1.0), 1);
//        Circle c3 = new Circle(new Point(-1.0, -1.0), 1);
//        Circle c4 = new Circle(new Point(1.0, -1.0), 1);
//        Square s1 = new Square(new Point(0,0), 2);
//
//        if(c1.doesBelongToCircle(p)) {
//            System.out.println(c1);
//        }
//        if(c2.doesBelongToCircle(p)) {
//            System.out.println(c2);
//        }
//        if(c3.doesBelongToCircle(p)) {
//            System.out.println(c3);
//        }
//        if(c4.doesBelongToCircle(p)) {
//            System.out.println(c4);
//        }
//        if(s1.doesBelongToSquare(p)) {
//            System.out.println("Należy do kwadratu.");
//        }
//    }
}
