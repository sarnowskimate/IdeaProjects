public class Ring {
    Circle innerCircle;
    Circle outerCircle;

    Ring(Circle innerCircle, Circle outerCircle) {
        this.innerCircle = innerCircle;
        this.outerCircle = outerCircle;
    }

    public boolean doesBelongToRing(Point p) {
        if (innerCircle.centre.distance(p) >= innerCircle.radius) {
            return outerCircle.centre.distance(p) <= outerCircle.radius;
        }

        return false;
    }
}
