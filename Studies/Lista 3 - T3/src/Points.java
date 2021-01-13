public class Points {
    Point[] points;
    Point origin = new Point(0, 0);

    public Points(Point[] points) {
        this.points = points;
    }

    public Points(Point p1, Point p2) {
        if (points != null) {
            points[0] = p1;
            points[1] = p2;
        }
    }

    public Points(int n, int m) {
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(m);
        }
    }

    public String toString() {
        String s = "";
        for (Point point: points) {
            s += point + "\n";
        }

        return s;
    }

    public void randomSet(int n) {
        for (int i = 0; i < n; i++) {
            points[i] = new Point(1, 1);
        }
    }

    private double calcDistance(Point p1, Point p2) {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
    }

    public Point farestFromOrigin() {
        Point pFarest = new Point(0, 0);
        double initialDistance = 0;
        for (Point point: points) {
            double distance = calcDistance(origin, point);
            if (distance > initialDistance) {
                pFarest = point;
            }
        }

        return pFarest;
    }

    public Points squareCoordinates() {
        Point[] c1 = new Point[4];
        Points c2 = new Points(c1);
//        Points c2 = new Points();
        double xMIN = points[0].getX();
        double xMAX = points[0].getX();
        double yMIN = points[0].getY();
        double yMAX = points[0].getY();

        for (Point point: points) {
            if (point.getX() < xMIN) {
                xMIN = point.getX();
            }

            if (point.getX() > xMAX) {
                xMAX = point.getX();
            }

            if (point.getY() < yMIN) {
                yMIN = point.getY();
            }

            if (point.getY() > yMAX) {
                yMAX = point.getY();
            }
        }

        c1[0] = new Point(xMAX, yMAX);
        c1[1] = new Point(xMIN, yMAX);
        c1[2] = new Point(xMIN, yMIN);
        c1[3] = new Point(xMAX, yMIN);

        return c2;
    }

    public String tableOfDistance() {
        String s = "";
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    double distance = calcDistance(points[i], points[j]);
                    s += points[i] + ", " + points[j] + ", " + distance + "\n";
                }
            }
        }

        return s;
    }





}
