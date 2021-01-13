public class DiplomaRegistry {
    Dyplom[] list;

    public DiplomaRegistry(Dyplom[] list) {
        this.list = list;
    }

    public String toString() {
        String s = "Diplomas in registry:\n";
        for (int i = 0; i < list.length; i++) {
            s += list[i] + "\n";
        }

        return s;
    }

    public String engDiplomas() {
        String s = "Engineering Diplomas in registry: ";
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof DyplomInz) {
                s += list[i] + "\n";
            }
        }

        return s;
    }

    public String testimonials() {
        String s = "Testimonials in registry: ";
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof DyplomUzn) {
                s += list[i] + "\n";
            }
        }

        return s;
    }

    public void diplomaOfOwner(Wlasciciel wlasciciel) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].wlasciciel == wlasciciel) {
                System.out.println(list[i]);
            }
        }
    }

    public void ownerOfDiplom(int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].numer == number) {
                System.out.println(list[i]);
            }
        }
    }


}
