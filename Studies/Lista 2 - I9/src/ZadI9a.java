import java.util.Scanner;

public class ZadI9a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base of power:");
        double x = s.nextDouble();
        System.out.println("Enter the natural number value of exponent, k:");
        int k = s.nextInt();
        
        System.out.println(Math.pow(x, k));

    }
}
