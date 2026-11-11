package stockora;

public class RecipeIngredient {

    private Ingredient ingredient;
    private double quantity;

    public RecipeIngredient(Ingredient ingredient, double quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public double getQuantity() {
        return quantity;
    }
}
