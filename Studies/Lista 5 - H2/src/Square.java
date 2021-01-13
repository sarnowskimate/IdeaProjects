public class Square extends Figure {
    double d;

    public Square(double d) {
        this.d = d;
    }

    public double area() {
        return d * d;
    }

    public double perimeter() {
        return 4 * d;
    }
}
