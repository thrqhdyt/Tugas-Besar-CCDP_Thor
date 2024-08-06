class EspressoTemplate extends CoffeeTemplate {
    @Override
    protected void brew() {
        System.out.println("Brewing espresso");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar");
    }
}
