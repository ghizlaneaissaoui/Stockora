package stockora;

import java.util.ArrayList;

public class Order {

    private ArrayList<OrderItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity > 0) {
            items.add(new OrderItem(product, quantity));
        }
    }

    public double getTotalPrice() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getSubtotal();
        }

        return total;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }
}
