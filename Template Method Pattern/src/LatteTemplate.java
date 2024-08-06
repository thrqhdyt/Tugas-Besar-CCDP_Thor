class LatteTemplate extends CoffeeTemplate {
    @Override
    protected void brew() {
        System.out.println("Brewing latte");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
}
