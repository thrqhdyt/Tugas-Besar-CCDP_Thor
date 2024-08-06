class HotBeverageFactory implements BeverageFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }

    @Override
    public Tea createTea() {
        return new GreenTea();
    }
}
