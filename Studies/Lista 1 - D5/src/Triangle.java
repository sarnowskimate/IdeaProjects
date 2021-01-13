public class Triangle {
    Point p1, p2, p3;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        return 0.5 * Math.abs((p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) - (p2.getY() - p1.getY()) * (p3.getX() - p1.getX()));
    }

    public boolean doesPointBelong(Point p) {
        double area1 = 0.5 * Math.abs((p2.getX() - p1.getX()) * (p.getY() - p1.getY()) - (p2.getY() - p1.getY()) * (p.getX() - p1.getX()));
        double area2 = 0.5 * Math.abs((p.getX() - p1.getX()) * (p3.getY() - p1.getY()) - (p.getY() - p1.getY()) * (p3.getX() - p1.getX()));
        double area3 = 0.5 * Math.abs((p2.getX() - p.getX()) * (p3.getY() - p.getY()) - (p2.getY() - p.getY()) * (p3.getX() - p.getX()));
        double sumOfAreas = area1 + area2 + area3;
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        if (sumOfAreas <= this.area()) {
            return true;
        }

        return false;
    }
}
