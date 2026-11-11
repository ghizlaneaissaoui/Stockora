package stockora;

public class Recipe {

    private Product product;
    private Ingredient ingredient;
    private double quantity;

    public Recipe(Product product, Ingredient ingredient, double quantity) {
        this.product = product;
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public double getQuantity() {
        return quantity;
    }
}
