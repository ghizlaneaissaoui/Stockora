package stockora;

public class Ingredient {

    private String name;
    private String unit;
    private double stock;
    private double minStock;

    public Ingredient(String name, String unit, double stock, double minStock) {
        this.name = name;
        this.unit = unit;
        this.stock = stock;
        this.minStock = minStock;
    }

    public void addStock(double quantity) {
        if (quantity > 0) {
            stock = stock + quantity;
        }
    }

    public void removeStock(double quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock = stock - quantity;
        }
    }

    public boolean isLowStock() {
        return stock <= minStock;
    }

    public String getName() {
        return name;
    }

    public double getStock() {
        return stock;
    }
}
