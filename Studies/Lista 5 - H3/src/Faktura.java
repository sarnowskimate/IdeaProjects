import java.util.Date;

public class Faktura {
    Towar[] towary;
    Nabywca klient;
    int number;
    Date dataWystawienia;
    Date dataSprzedazy;
    TypZaplaty typZaplaty;
    Date terminZaplaty;
    Pozycja[] pozycje;

    public Faktura(Towar[] towary) {
        this.towary = towary;
    }
}
