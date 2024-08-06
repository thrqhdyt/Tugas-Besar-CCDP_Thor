public class TemplateMethodTest {
    public static void main(String[] args) {
        CoffeeTemplate espresso = new EspressoTemplate();
        espresso.prepareCoffee();

        CoffeeTemplate latte = new LatteTemplate();
        latte.prepareCoffee();
    }
}
