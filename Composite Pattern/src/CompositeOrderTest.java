public class CompositeOrderTest {
    public static void main(String[] args) {
        CompositeOrder order = new CompositeOrder();
        order.addItem(new CoffeeItem("Espresso"));
        order.addItem(new CoffeeItem("Latte"));

        order.print();
    }
}
