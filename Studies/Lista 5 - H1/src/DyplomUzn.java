public class Testimonial extends Dyplom {

    String title;

    Testimonial (Owner owner, int number, double date, String title) {
        super(owner, number, date);
        this.title = title;
    }

    public String toString() {
        return super.toString() + ", tit:" + title;
    }

}
