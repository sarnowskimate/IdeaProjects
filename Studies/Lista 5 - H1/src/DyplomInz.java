import java.util.Date;

public class EngDiploma extends Diploma {
    String specialty;

    public EngDiploma(Owner owner, int number, double date, String specialty) {
        super(owner, number, date);
        this.specialty = specialty;
    }

    public String toString() {
        return super.toString() + ", spe:" + specialty;
    }
}
