package stockora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    @Test
    void testRecipeCreation() {
        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        Product burger = new Product("Classic Burger", 8.50);

        Recipe recipe = new Recipe(burger, bread, 1);

        assertEquals(burger, recipe.getProduct());
        assertEquals(bread, recipe.getIngredient());
        assertEquals(1, recipe.getQuantity());
    }
}