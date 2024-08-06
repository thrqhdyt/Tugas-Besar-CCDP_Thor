public class BeverageFactoryTest {
    public static void main(String[] args) {
        BeverageFactory hotFactory = new HotBeverageFactory();
        Coffee hotCoffee = hotFactory.createCoffee();
        Tea hotTea = hotFactory.createTea();
        hotCoffee.prepare();
        hotTea.prepare();

        BeverageFactory coldFactory = new ColdBeverageFactory();
        Coffee coldCoffee = coldFactory.createCoffee();
        Tea coldTea = coldFactory.createTea();
        coldCoffee.prepare();
        coldTea.prepare();
    }
}
