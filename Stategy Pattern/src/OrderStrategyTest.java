public class OrderStrategyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setPaymentStrategy(new CreditCardPayment());
        order.pay(100.0);

        order.setPaymentStrategy(new PayPalPayment());
        order.pay(200.0);
    }
}
