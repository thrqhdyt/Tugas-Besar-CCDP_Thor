public class CommandPatternTest {
    public static void main(String[] args) {
        Order order = new Order("Latte, Medium");
        Command placeOrder = new PlaceOrderCommand(order);

        OrderInvoker invoker = new OrderInvoker();
        invoker.setCommand(placeOrder);
        invoker.executeCommand();
    }
}
