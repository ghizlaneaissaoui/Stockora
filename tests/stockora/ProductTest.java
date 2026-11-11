package stockora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testProductCreation() {
        Product burger = new Product("Classic Burger", 8.50);

        assertEquals("Classic Burger", burger.getName());
        assertEquals(8.50, burger.getPrice());
    }
}