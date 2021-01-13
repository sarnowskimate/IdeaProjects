public class Circle {
    Point centre;
    double radius;

    Circle(double radius) {
        this.radius = radius;
        this.centre = new Point(0,0);
    }

    Circle(Point center, double radius) {
        this.centre = center;
        this.radius = radius;
    }

    public boolean doesBelongToCircle(Point p) {
        return centre.distance(p) <= radius;
    }

    public String toString(){
        return "Circle: center " + centre + ", radius " + radius;
    }
}
