class ColdBeverageFactory implements BeverageFactory {
    @Override
    public Coffee createCoffee() {
        return new IcedLatte();
    }

    @Override
    public Tea createTea() {
        return new IcedTea();
    }
}
