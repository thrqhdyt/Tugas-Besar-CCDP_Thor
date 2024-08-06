public class OrderBuilderTest {
    public static void main(String[] args) {
        Order order1 = new Order.OrderBuilder("Espresso")
                .setSize("Large")
                .setMilk(true)
                .setSugar(false)
                .build();
        System.out.println(order1);

        Order order2 = new Order.OrderBuilder("Latte")
                .setSize("Medium")
                .setMilk(true)
                .setSugar(true)
                .build();
        System.out.println(order2);
    }
}
