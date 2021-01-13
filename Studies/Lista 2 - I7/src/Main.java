import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int m = s.nextInt();
        System.out.println("Podaj liczbę b:");
        int n = s.nextInt();

        do {
            if (m < n) {
                n = n - m;
            } else {
                m = m - n;
            }
        } while (m != n);

        System.out.println("NWD: " + m);
    }
}
