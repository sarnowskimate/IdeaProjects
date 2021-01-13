import java.util.Date;

public class Diploma {
    Owner owner;
    int number;
    double date;

    public Diploma(Owner owner, int number, double date) {
        this.owner = owner;
        this.number = number;
        this.date = date;
    }

    public String toString() {
        return owner + ", num: " + number + ", dat: " + date;
    }
}
