public class CoffeeProxyTest {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeProxy("Espresso");
        coffee.prepare();
    }
}
