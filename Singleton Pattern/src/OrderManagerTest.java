public class OrderManagerTest {
    public static void main(String[] args) {
        OrderManager manager = OrderManager.getInstance();
        manager.addOrder(new Order("Espresso", "Large"));
        manager.addOrder(new Order("Latte", "Medium"));

        for (Order order : manager.getOrders()) {
            System.out.println(order);
        }
    }
}
