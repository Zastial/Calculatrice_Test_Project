public class Calculatrice {

    public static float addition(float a, float b) {
        return a + b;
    }

    public static float soustraction(float a, float b) {
        return a - b;
    }

    public static float multiplication(float a, float b) {
        return a * b;
    }

    public static float division(float a, float b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro.");
            return 0.0f;
        }
        return a / b;
    }

    public static void sortArray(float[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortArrayRecursive(float[] array, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                float temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        sortArrayRecursive(array, n - 1);
    }
}