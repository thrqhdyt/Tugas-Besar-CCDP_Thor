class CoffeeOrderFacade {
    private OrderManager orderManager;
    private PaymentProcessor paymentProcessor;

    public CoffeeOrderFacade() {
        this.orderManager = new OrderManager();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void placeOrder(Order order) {
        orderManager.addOrder(order);
        paymentProcessor.pay(order.getTotalAmount());
    }
}
