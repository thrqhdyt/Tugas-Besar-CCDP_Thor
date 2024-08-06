class CoffeeItem implements OrderItem {
    private String name;

    public CoffeeItem(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Coffee: " + name);
    }
}
