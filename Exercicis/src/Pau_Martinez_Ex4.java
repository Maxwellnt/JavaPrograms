import java.util.Scanner;

public class Pau_Martinez_Ex4 {
    public static void main(String[] args) {

        Scanner llegir =new Scanner(System.in);

        int numNois, numNoies;
        float perNois, perNoies;

        System.out.println("Benvingut al progtama...");
        System.out.print("Escriu el numero de noies");
        numNoies = llegir.nextInt();

        System.out.print("Escriu el numero de nois");
        numNois = llegir.nextInt();

        perNois = ((float) numNois / ((float) numNois + (float) numNoies) );
        perNoies = ((float) numNoies / ((float) numNois + (float) numNoies) );

        System.out.printf("Hi ha un persentatge de %.2f %% de nois" + "i un %.2f %% de noies" , perNois , perNoies);
    }
}
