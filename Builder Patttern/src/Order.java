class Order {
    private String coffeeType;
    private String size;
    private boolean milk;
    private boolean sugar;

    private Order(OrderBuilder builder) {
        this.coffeeType = builder.coffeeType;
        this.size = builder.size;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
    }

    @Override
    public String toString() {
        return size + " " + coffeeType + (milk ? " with milk" : "") + (sugar ? " with sugar" : "");
    }

    public static class OrderBuilder {
        private String coffeeType;
        private String size;
        private boolean milk;
        private boolean sugar;

        public OrderBuilder(String coffeeType) {
            this.coffeeType = coffeeType;
        }

        public OrderBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public OrderBuilder setMilk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public OrderBuilder setSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
