class CoffeeProxy implements Coffee {
    private String type;
    private RealCoffee realCoffee;

    public CoffeeProxy(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        if (realCoffee == null) {
            realCoffee = new RealCoffee(type);
        }
        realCoffee.prepare();
    }
}
