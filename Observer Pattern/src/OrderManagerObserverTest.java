public class OrderManagerObserverTest {
    public static void main(String[] args) {
        OrderManagerObserver orderManager = new OrderManagerObserver();
        Barista barista1 = new Barista("John");
        Barista barista2 = new Barista("Jane");

        orderManager.addObserver(barista1);
        orderManager.addObserver(barista2);

        orderManager.addOrder(new Order("Espresso, Large"));
    }
}
