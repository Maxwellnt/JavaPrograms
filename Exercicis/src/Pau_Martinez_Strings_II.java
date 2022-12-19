import java.util.Scanner;

public class Pau_Martinez_Strings_II {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        String frase;
        int numFrase = 0;

        System.out.println("BENBINGUT, introdueix una frase que contare quants caracters hi ha:");
        frase = llegir.next();

        numFrase = frase.length();

        System.out.println("Hi ha " + numFrase + " caracters en el frase!");
    }
}
