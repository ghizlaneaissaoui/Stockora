
package stockora;

import java.util.ArrayList;

public class Recipe {

    private Product product;
    private ArrayList<RecipeIngredient> ingredients;

    public Recipe(Product product) {
        this.product = product;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient, double quantity) {
        RecipeIngredient recipeIngredient = new RecipeIngredient(ingredient, quantity);
        ingredients.add(recipeIngredient);
    }

    public boolean canBePrepared() {
        for (RecipeIngredient item : ingredients) {
            if (item.getIngredient().getStock() < item.getQuantity()) {
                return false;
            }
        }

        return true;
    }

    public Product getProduct() {
        return product;
    }

    public ArrayList<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public boolean prepare() {
        if (!canBePrepared()) {
            return false;
        }

        for (RecipeIngredient item : ingredients) {
            item.getIngredient().removeStock(item.getQuantity());
        }

        return true;
    }
}
