public class CoffeeOrderFacadeTest {
    public static void main(String[] args) {
        CoffeeOrderFacade facade = new CoffeeOrderFacade();
        Order order = new Order(50.0);
        facade.placeOrder(order);
    }
}
