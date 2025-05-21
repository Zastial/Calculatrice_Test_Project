package Shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        items.add(product);
    }
    public double getTotalPrice() {
        double total = items.stream().mapToDouble(Product::getPrice).sum();
        return total - getPromotion(total);
    }
    public int getItemCount() {
        return items.size();
    }
    public void clearCart() {
        items.clear();
    }

    public double getPromotion(double total) {
        if (total < 0) {
            throw new IllegalArgumentException("Total cannot be negative");
        }
        if (total > 100) {
            return total * 0.1; // 10% discount
        }
        return 0;
    }
}