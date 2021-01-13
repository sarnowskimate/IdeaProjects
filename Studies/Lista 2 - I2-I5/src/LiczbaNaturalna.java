public class LiczbaNaturalna {

    // pole klasy
    int liczbaK;

    // konstruktor
    LiczbaNaturalna(int liczbaK) {
        this.liczbaK = liczbaK;
    }

    public boolean czyLiczbaNaturalna() {
        return liczbaK >= 1;
    }

    // metoda obiektu (czesto brak arg.)
    public int sumaCyfr() {
        int licznik = 0;

        if (liczbaK > 0) {
            for (int i = 0; i < 100; i++) { // mozna napisac sprawniej
                double w = liczbaK % Math.pow(10, i + 1);
                licznik++;
                if (w == liczbaK) {
                    break;
                }
            }
        }
        return licznik;
    }

    public int iloscMiejscZnaczacych() {
        int sumaCyfr = LiczbaNaturalna.this.sumaCyfr();
        int licznik = 0;

        for (int i = 0; i < sumaCyfr; i++) {
            double w = liczbaK % Math.pow(10, sumaCyfr - i);
            if (w == 0) {
                break;
            }
            licznik++;
        }

        return licznik;
    }

    public int najwiekszaCyfra() {
        int sumaCyfr = LiczbaNaturalna.this.sumaCyfr();
        int wynik = 0;

        for (int i = 0; i < sumaCyfr; i++) {
            if ((liczbaK % 10) >= wynik) {
                wynik = liczbaK % 10;
                liczbaK = liczbaK / 10;
            }
        }

        return wynik;
    }

    public String czyLiczbaPierwsza() {
        if (liczbaK < 2) {
            return "nie jest";
        }

        for (int i = 2; i*i <= liczbaK; i++) {
            if (liczbaK % i == 0) {
                return "nie jest";
            }
        }

        return "jest";
    }
}
