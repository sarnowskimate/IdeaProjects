import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number A:");
        double A = s.nextDouble();
        System.out.println("Enter number B:");
        double B = s.nextDouble();
        System.out.println("Enter number C:");
        double C = s.nextDouble();

        double firstNumber = A;
        double secondNumber = B;
        double thirdNumber = C;

        if (A > B && A > C) {
            thirdNumber = A;
            if (B > C) {
                secondNumber = B;
                firstNumber = A;
            }
            else {
                secondNumber = A;
                firstNumber = B;
            }
        }

        else if (B > A && B > C) {
            thirdNumber = B;
            if (A > C) {
                secondNumber = A;
                firstNumber = C;
            }
            else {
                secondNumber = C;
                firstNumber = A;
            }
        }

        else if (C > A && C > B) {
            thirdNumber = C;
            if (A > B) {
                secondNumber = A;
                firstNumber = C;
            }
            else {
                secondNumber = C;
                firstNumber = A;
            }
        }

        System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber);
    }
}
