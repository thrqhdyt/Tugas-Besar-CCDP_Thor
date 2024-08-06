public class PaymentProcessorTest {
    public static void main(String[] args) {
        StripePayment stripe = new StripePayment();
        PaymentProcessor adapter = new StripePaymentAdapter(stripe);
        adapter.pay(100.0);
    }
}
