import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choisis le calcul (A/S/M/D) : ");

        String choix = myObj.nextLine();

        switch(choix) {
            case "A":
                System.out.println("Entrez le premier nombre : ");
                float a = myObj.nextFloat();
                System.out.println("Entrez le deuxième nombre : ");
                float b = myObj.nextFloat();

                float result = Calculatrice.addition(a, b);
                System.out.println("Le résultat est : " + result);

                break;
            case "S":
                System.out.println("Entrez le premier nombre : ");
                float c = myObj.nextFloat();
                System.out.println("Entrez le deuxième nombre : ");
                float d = myObj.nextFloat();

                float result2 = Calculatrice.soustraction(c, d);
                System.out.println("Le résultat est : " + result2);

                break;
            case "M":
                System.out.println("Entrez le premier nombre : ");
                float e = myObj.nextFloat();
                System.out.println("Entrez le deuxième nombre : ");
                float f = myObj.nextFloat();
                float result3 = Calculatrice.multiplication(e, f);
                System.out.println("Le résultat est : " + result3);
                break;
            case "D":
                System.out.println("Entrez le premier nombre : ");
                float g = myObj.nextFloat();
                System.out.println("Entrez le deuxième nombre : ");
                float h = myObj.nextFloat();
                if (h != 0) {
                    float result4 = Calculatrice.division(g, h);
                    System.out.println("Le résultat est : " + result4);
                } else {
                    System.out.println("Erreur : Division par zéro.");
                }
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }
}
