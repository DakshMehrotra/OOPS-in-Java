import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        // Update quantity of product 102
        inventory.put(102, 35);

        // Remove product 101
        inventory.remove(101);

        // Display final inventory
        for (Integer productId : inventory.keySet()) {
            System.out.println("Product ID: " + productId + ", Quantity: " + inventory.get(productId));
        }
    }
}
