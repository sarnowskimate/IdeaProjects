public class Rectangle extends Figure {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }
}
