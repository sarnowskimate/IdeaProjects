public class Circle {
    private Point centre;
    private double radius;

    Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public boolean doesBelong(Point p) {
        return centre.distance(p) <= radius;
    }

    public String toString(){
        return "Circle: center " + centre + ", radius " + radius;
    }
}
