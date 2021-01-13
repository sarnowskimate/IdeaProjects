public class Triangle {
    double s1;
    double s2;
    double s3;

    Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public boolean isTriangle() {
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            return true;
        }
        return false;
    }

    public String kindOfTriangle() {
        double max = Triangle.this.maxSegment();
        String answer1 = "Error";
        if (s1 == s2 && s1 == s3 ) {
            answer1 = "a) It will be equilateral.";
        }
        else if (s1 == s2 || s1 == s3 || s2 == s3) {
            answer1 = "a) It will be isosceles.";
        }
        else {
            answer1 = "a) It will be scalene.";
        }

        String answer2 = "Error.";
        if (max*max > s1*s1 + s2*s2) {
            answer2 = "b) It will be obtuse.";
        }
        else if (max*max == s1*s1 + s2*s2) {
            answer2 = "b) It will be rectangular.";
        }
        else if (max*max < s1*s1 + s2*s2) {
            answer2 = "b) It will be acute.";
        }

        return answer1 + "\n" + answer2;
    }

    private double maxSegment() {
        double max;
        if (s1 >= s2 && s1 >= s3) {
            max = s1;
        }
        else if (s2 >= s1 && s2 >= s1) {
            max = s2;
        }
        else {
            max = s3;
        }
        return max;
    }
}
