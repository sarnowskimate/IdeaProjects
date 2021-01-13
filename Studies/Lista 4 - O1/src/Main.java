import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Point p = new Point(5, 5);

        SetOfCircles set = new SetOfCircles(10);
        SetOfCircles subset = set.subset(p);

        System.out.println(set);
        System.out.println(subset);

    }
}
