public class Order {
    Figure[] orders;
    Figure order;
    int parameter;

    public Order(Figure[] orders) {
        this.orders = orders;
        parameter = 2;
    }

    public Order(Figure order) {
        this.order = order;
        parameter = 1;
    }

    double getServiceCost() {
        double serviceCostPerUnit = 2;
        double cost = 0;

        switch (parameter) {
            case 1: {cost = order.perimeter() * serviceCostPerUnit; break;}
            case 2: for (int i = 0; i < orders.length; i++) {
                cost += orders[i].perimeter() * serviceCostPerUnit;
            }
        }

        return cost;
    }

    double getMaterialCost() {
        double materialCostPerUnit = 3;
        double cost = 0;

        switch (parameter) {
            case 1: {cost = order.perimeter(); break;}
            case 2: for (int i = 0; i < orders.length; i++) {
                cost += orders[i].area() * materialCostPerUnit;
            }
        }

        return cost;
    }
}
