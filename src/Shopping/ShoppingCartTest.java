package Shopping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void creationPanierVide() {
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    @Test
    void ajoutDeProduits() {
        Product p1 = new Product("Livre", 12.5);
        Product p2 = new Product("Stylo", 2.0);
        cart.addProduct(p1);
        cart.addProduct(p2);
        assertEquals(2, cart.getItemCount());
    }

    @Test
    void totalPanierApresAjout() {
        cart.addProduct(new Product("Cahier", 5.0));
        cart.addProduct(new Product("Gomme", 1.5));
        assertEquals(6.5, cart.getTotalPrice());
    }

    @Test
    void totalPanierApresAjoutAvecPromo() {
        cart.addProduct(new Product("Cahier", 5.0));
        cart.addProduct(new Product("Gomme", 150));
        assertEquals(139.5, cart.getTotalPrice()); // 10% de réduction sur 155
    }

    @Test
    void ajoutProduitNullDoitLeverException() {
        assertThrows(IllegalArgumentException.class, () -> cart.addProduct(null));
    }

    @Test
    void creationProduitPrixNegatifDoitLeverException() {
        assertThrows(IllegalArgumentException.class, () -> new Product("Erreur", -10.0));
    }

    @Test
    void viderLePanier() {
        cart.addProduct(new Product("Crayon", 1.0));
        cart.addProduct(new Product("Règle", 2.0));
        cart.clearCart();
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    @Test
    void getPromotion() {
        cart.addProduct(new Product("Produit1", 50.0));
        cart.addProduct(new Product("Produit2", 60.0));
        assertEquals(11.0, cart.getPromotion(110.0)); // 10% de réduction sur 110
    }

    @Test
    void getPromotionNegative() {
        cart.addProduct(new Product("Produit1", 50.0));
        cart.addProduct(new Product("Produit2", 60.0));
        assertThrows(IllegalArgumentException.class, () -> cart.getPromotion(-10.0));
    }
}