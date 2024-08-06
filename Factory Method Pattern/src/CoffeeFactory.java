class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if (type.equals("espresso")) {
            return new Espresso();
        } else if (type.equals("latte")) {
            return new Latte();
        }
        return null;
    }
}
