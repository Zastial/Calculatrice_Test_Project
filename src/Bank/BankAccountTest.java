package Bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void creationAvecSoldeInitialValide() {
        BankAccount account = new BankAccount("Alice", 100.0);
        assertEquals(100.0, account.getBalance());
        assertEquals("Alice", account.getOwner());
    }

    @Test
    void refusCreationSoldeInitialNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("Bob", -50.0);
        });
    }

    @Test
    void depotArgentFonctionne() {
        BankAccount account = new BankAccount("Charlie", 50.0);
        account.deposit(25.0);
        assertEquals(75.0, account.getBalance());
    }

    @Test
    void refusDepotMontantNegatifOuNul() {
        BankAccount account = new BankAccount("David", 30.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }

    @Test
    void retraitMontantDisponibleFonctionne() {
        BankAccount account = new BankAccount("Eve", 80.0);
        account.withdraw(30.0);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void refusRetraitSuperieurAuSolde() {
        BankAccount account = new BankAccount("Frank", 40.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(50.0));
    }

    @Test
    void refusRetraitMontantNegatifOuNul() {
        BankAccount account = new BankAccount("Grace", 60.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0.0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5.0));
    }
}