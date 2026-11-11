package stockora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    @Test
    void testAddStock() {
        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        bread.addStock(5);
        assertEquals(55, bread.getStock());
    }

    @Test
    void testRemoveStock() {
        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        bread.removeStock(10);
        assertEquals(40, bread.getStock());
    }

    @Test
    void testInsufficientStock() {
        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        bread.removeStock(100);
        assertEquals(50, bread.getStock());
    }

    @Test
    void testLowStock() {
        Ingredient cheese = new Ingredient("Cheese", "piece", 5, 10);
        assertTrue(cheese.isLowStock());
    }
}