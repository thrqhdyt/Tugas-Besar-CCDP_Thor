class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment made using PayPal: " + amount);
    }
}
