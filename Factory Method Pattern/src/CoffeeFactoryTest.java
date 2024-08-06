public class CoffeeFactoryTest {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee1 = factory.createCoffee("espresso");
        coffee1.prepare();

        Coffee coffee2 = factory.createCoffee("latte");
        coffee2.prepare();
    }
}
