public class Order {
    private String coffeeType;
    private String size;

    public Order(String coffeeType, String size) {
        this.coffeeType = coffeeType;
        this.size = size;
    }

    @Override
    public String toString() {
        return size + " " + coffeeType;
    }
}
