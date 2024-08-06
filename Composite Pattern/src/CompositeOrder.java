import java.util.ArrayList;
import java.util.List;

class CompositeOrder implements OrderItem {
    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }

    @Override
    public void print() {
        for (OrderItem item : items) {
            item.print();
        }
    }
}
