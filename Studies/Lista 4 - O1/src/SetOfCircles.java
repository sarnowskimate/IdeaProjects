public class SetOfCircles {

    public Circle[] set;

    SetOfCircles(int n) {
        set = new Circle[n];
        for (int i = 0; i < n; i++) {
            set[i] = new Circle(new Point(10 * Math.random(), 10 * Math.random()), Math.random() + 1);
        }
    }

    SetOfCircles(Circle[] set) {
        this.set = set;
    }

    public SetOfCircles subset(Point p) {
        Circle[] tempSet = new Circle[set.length];
//        int k = 0;

        for (int i = 0; i < set.length; i++) {
            if (set[i].doesBelong(p)) {
                tempSet[i] = set[i];
//                k++;
            }
        }
        return new SetOfCircles(tempSet);
    }

    public String toString(){
        String print = "";
        System.out.println("Set consists of " + set.length + " circles:");
        for (int i = 0; i < set.length; i++) {
            if (set[i] != null) {
                print += set[i] + "\n";
            }
        }
        return print;
    }
}

