package stockora;

public class Main {

    public static void main(String[] args) {
        Ingredient bread = new Ingredient("Bread", "piece", 50, 10);

        System.out.println(bread.getStock());

        bread.removeStock(2);
        System.out.println(bread.getStock());

        bread.addStock(5);
        System.out.println(bread.getStock());

        bread.removeStock(100);
        System.out.println(bread.getStock());
    
        bread.addStock(-5);
        System.out.println(bread.getStock());    
    
        Product burger = new Product("Classic Burger", 8.50);

        System.out.println(burger.getName());
        System.out.println(burger.getPrice());    
    
    }
}