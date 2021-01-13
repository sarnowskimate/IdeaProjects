public class Main {

    double getArea(Figure f) {
        return f.area();
    }

    double getPerimeter(Figure f) {
        return f.perimeter();
    }

    public static void main(String[] args) {
	// write your code here
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        Square s = new Square(10);

        Figure[] figures = new Figure[3];
        figures[0] = c;
        figures[1] = r;
        figures[2] = s;

        Order o1 = new Order(c);
        System.out.println(o1.getMaterialCost()); // zaokraglic do dwoch miejsc po przecinku i dodac zl
        System.out.println(o1.getServiceCost());

        Order o2 = new Order(figures);
        System.out.println(o2.getMaterialCost()); // zaokraglic do dwoch miejsc po przecinku i dodac zl
        System.out.println(o2.getServiceCost());


    }


}
