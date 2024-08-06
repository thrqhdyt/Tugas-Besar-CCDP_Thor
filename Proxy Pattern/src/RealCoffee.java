class RealCoffee implements Coffee {
    private String type;

    public RealCoffee(String type) {
        this.type = type;
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + type);
    }
}
