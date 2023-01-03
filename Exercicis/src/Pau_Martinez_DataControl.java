import java.util.Random;
import java.util.Scanner;

public class Pau_Martinez_DataControl {
    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        final int MAX = 10, MIN = 0;

        int numero = 0;
        boolean tipusCorrecte = false;

        do {
            System.out.println("Escriu un enter entre "+ MIN + " i " + MAX);
            tipusCorrecte = llegir.hasNextInt(); // Nomes mira el valor int del escaner no se apolica a la variable

            if (!tipusCorrecte){
                llegir.nextLine(); // Serveix per elimianr el numero del escaner
            }else {
                numero = llegir.nextInt(); // Passem sence possar imput perque ja hi ha un valor al escaner
                if (numero < MIN ||numero > MAX){
                    tipusCorrecte = false;
                }
            }
        }while (!tipusCorrecte);

        System.out.println("Has intruduit el numero enter: "+ numero);
    }
}
