package stockora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    void testAddProducts() {
        Product burger = new Product("Classic Burger", 8.50);
        Product fries = new Product("Fries", 3.00);

        Order order = new Order();

        order.addProduct(burger, 2);
        order.addProduct(fries, 1);

        assertEquals(2, order.getItems().size());
    }

    @Test
    void testCalculateTotalPrice() {
        Product burger = new Product("Classic Burger", 8.50);
        Product fries = new Product("Fries", 3.00);

        Order order = new Order();

        order.addProduct(burger, 2);
        order.addProduct(fries, 1);

        assertEquals(20.00, order.getTotalPrice());
    }

    @Test
    void testInvalidQuantity() {
        Product burger = new Product("Classic Burger", 8.50);

        Order order = new Order();

        order.addProduct(burger, 0);
        order.addProduct(burger, -2);

        assertEquals(0, order.getItems().size());
    }
}
 
    

