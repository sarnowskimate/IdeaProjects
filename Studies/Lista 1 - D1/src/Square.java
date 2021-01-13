public class Square {
    Point centre;
    double sideLength;

    Square(Point centre, double sideLength) {
        this.centre = centre;
        this.sideLength = sideLength;
    }

    public boolean doesBelongToSquare(Point p) {
        double x1 = centre.getX() - 0.5*sideLength;
        double x2 = centre.getX() + 0.5*sideLength;
        double y1 = centre.getY() - 0.5*sideLength;
        double y2 = centre.getY() + 0.5*sideLength;

        if (p.getX() >= x1 && p.getX() <= x2) {
            return p.getY() >= y1 && p.getY() <= y2;
        }
        return false;
    }
}
