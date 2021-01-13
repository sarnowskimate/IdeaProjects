import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną, k:");
        int k = s.nextInt();

        LiczbaNaturalna lNat = new LiczbaNaturalna(k);




        if (lNat.czyLiczbaNaturalna()) {
            System.out.println("Zad. I2 - Suma cyfr danej liczby: " + lNat.sumaCyfr());
            System.out.println("Zad. I3 - Ilość miejsc znaczących dla danej liczby: " + lNat.iloscMiejscZnaczacych());
            System.out.println("Zad. I4 - Największa cyfra danej liczby: " + lNat.najwiekszaCyfra());
            System.out.println("Zad. I5 - Dana liczba " + lNat.czyLiczbaPierwsza()+ " liczbą pierwszą.");
        } else {
            System.out.println("Podana liczba nie jest liczbą naturalną.");
        }

        s.close();
    }
}
