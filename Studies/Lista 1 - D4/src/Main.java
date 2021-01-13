import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter length of 3 segments:");
        Scanner s = new Scanner(System.in);

        Triangle triangle = new Triangle(s.nextDouble(), s.nextDouble(), s.nextDouble());

        if (triangle.isTriangle()) {
            System.out.println("From given segments the triangle can be build.");
            System.out.println(triangle.kindOfTriangle());
        } else {
            System.out.println("From given segments the triangle cannot be build.");
        }
    }
}
