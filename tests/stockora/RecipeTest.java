package stockora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    @Test
    void testAddIngredients() {
        Product burger = new Product("Classic Burger", 8.50);

        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        Ingredient meat = new Ingredient("Meat", "piece", 30, 5);
        Ingredient cheese = new Ingredient("Cheese", "slice", 40, 10);

        Recipe recipe = new Recipe(burger);

        recipe.addIngredient(bread, 1);
        recipe.addIngredient(meat, 1);
        recipe.addIngredient(cheese, 2);

        assertEquals(burger, recipe.getProduct());
        assertEquals(3, recipe.getIngredients().size());

        assertEquals(bread, recipe.getIngredients().get(0).getIngredient());
        assertEquals(2, recipe.getIngredients().get(2).getQuantity());
    }

    @Test
    void testRecipeCanBePrepared() {
        Product burger = new Product("Classic Burger", 8.50);

        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        Ingredient meat = new Ingredient("Meat", "piece", 30, 5);
        Ingredient cheese = new Ingredient("Cheese", "slice", 40, 10);

        Recipe recipe = new Recipe(burger);

        recipe.addIngredient(bread, 1);
        recipe.addIngredient(meat, 1);
        recipe.addIngredient(cheese, 2);

        assertTrue(recipe.canBePrepared());
    }

    @Test
    void testRecipeCannotBePrepared() {
        Product burger = new Product("Classic Burger", 8.50);

        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        Ingredient meat = new Ingredient("Meat", "piece", 0, 5);

        Recipe recipe = new Recipe(burger);

        recipe.addIngredient(bread, 1);
        recipe.addIngredient(meat, 1);

        assertFalse(recipe.canBePrepared());
        }


    @Test
    void testPrepareRecipe() {
        Product burger = new Product("Classic Burger", 8.50);

        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        Ingredient meat = new Ingredient("Meat", "piece", 30, 5);
        Ingredient cheese = new Ingredient("Cheese", "slice", 40, 10);

        Recipe recipe = new Recipe(burger);

        recipe.addIngredient(bread, 1);
        recipe.addIngredient(meat, 1);
        recipe.addIngredient(cheese, 2);

        assertTrue(recipe.prepare());

        assertEquals(49, bread.getStock());
        assertEquals(29, meat.getStock());
        assertEquals(38, cheese.getStock());
    }

    @Test
    void testPrepareRecipeWithInsufficientStock() {
        Product burger = new Product("Classic Burger", 8.50);

        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);
        Ingredient meat = new Ingredient("Meat", "piece", 0, 5);

        Recipe recipe = new Recipe(burger);

        recipe.addIngredient(bread, 1);
        recipe.addIngredient(meat, 1);

        assertFalse(recipe.prepare());

        assertEquals(50, bread.getStock());
        assertEquals(0, meat.getStock());
    }

}
