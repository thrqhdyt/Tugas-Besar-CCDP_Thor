class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment made using Credit Card: " + amount);
    }
}
