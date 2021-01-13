public class Owner {

    String name;
    String surname;

    Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "nam: " + name + ", sur: " + surname;
    }
}
