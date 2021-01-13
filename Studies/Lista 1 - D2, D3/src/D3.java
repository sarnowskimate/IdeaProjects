import java.util.ArrayList;
import java.util.Scanner;

public class D3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Enter numbers A, B and C:");

        for (int i = 0; i < 3; i++) {
            numbers.add(s.nextDouble());
        }

        int licznik = 0;

        do {
            for (int i = 0; i < 2; i++) {
                licznik = 0;
                if (numbers.get(i) > numbers.get(i + 1)) {
                    double tempNumber = numbers.get(i + 1);
                    numbers.set(i + 1, numbers.get(i));
                    numbers.set(i, tempNumber);
                    licznik++;
                }
            }
        } while (licznik != 0);

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers.get(i));
        }

        s.close();
    }
}
