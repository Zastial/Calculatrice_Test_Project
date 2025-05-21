import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void addition() {
        assertEquals(5.0f, Calculatrice.addition(2.0f, 3.0f));
        assertEquals(-1.0f, Calculatrice.addition(-2.0f, 1.0f));
        assertEquals(0.0f, Calculatrice.addition(0.0f, 0.0f));
        assertEquals(2.5f, Calculatrice.addition(1.5f, 1.0f));
    }

    @Test
    void soustraction() {
        assertEquals(-1.0f, Calculatrice.soustraction(2.0f, 3.0f));
        assertEquals(-3.0f, Calculatrice.soustraction(-2.0f, 1.0f));
        assertEquals(0.0f, Calculatrice.soustraction(0.0f, 0.0f));
        assertEquals(0.5f, Calculatrice.soustraction(1.5f, 1.0f));
    }

    @Test
    void multiplication() {
        assertEquals(6.0f, Calculatrice.multiplication(2.0f, 3.0f));
        assertEquals(-2.0f, Calculatrice.multiplication(-2.0f, 1.0f));
        assertEquals(0.0f, Calculatrice.multiplication(0.0f, 1.0f));
        assertEquals(1.5f, Calculatrice.multiplication(1.5f, 1.0f));
    }

    @Test
    void division() {
        assertEquals(2.0f, Calculatrice.division(6.0f, 3.0f));
        assertEquals(-2.0f, Calculatrice.division(-2.0f, 1.0f));
        assertEquals(0.0f, Calculatrice.division(0.0f, 1.0f));
        assertEquals(1.5f, Calculatrice.division(1.5f, 1.0f));
        assertEquals(0.0f, Calculatrice.division(1.5f, 0.0f)); // Test division by zero
    }

    @Test
    void sortArray() {
        float[] array = {3.0f, 1.0f, 2.0f};
        Calculatrice.sortArray(array);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, array);

        float[] emptyArray = {};
        Calculatrice.sortArray(emptyArray);
        assertArrayEquals(new float[]{}, emptyArray);

        float[] singleElementArray = {1.0f};
        Calculatrice.sortArray(singleElementArray);
        assertArrayEquals(new float[]{1.0f}, singleElementArray);

        float[] alreadySortedArray = {1.0f, 2.0f, 3.0f};
        Calculatrice.sortArray(alreadySortedArray);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, alreadySortedArray);
    }

    @Test
    void testSortArrayRecursive_Desordre() {
        float[] array = {3.0f, 1.0f, 2.0f};
        Calculatrice.sortArrayRecursive(array, array.length);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, array);
    }

    @Test
    void testSortArrayRecursive_DejaTrie() {
        float[] array = {1.0f, 2.0f, 3.0f};
        Calculatrice.sortArrayRecursive(array, array.length);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, array);
    }
}