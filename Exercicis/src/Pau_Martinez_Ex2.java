import java.util.Scanner;


public class Pau_Martinez_Ex2 {
    /*2. A la botiga The bike house es fa un descompte del 20% als clients que son VIP i també
    als clients que facin una compra de més de 200 €. Pensa un algoritme que implementi
    aquesta lògica.*/

    // Variables: esVIP, baseImponible, preuFinal
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        float baseImponible, preuFinal = 0.0f;
        boolean esVIP;

        System.out.print("Benvingut al programa");
        System.out.printf("El client es VIP?  (True/False)");

        esVIP = llegir.nextBoolean();

        System.out.println("Cual es la base imponible del producte?");

        baseImponible = llegir.nextFloat();

        if (esVIP == true || baseImponible > 200.00f) {

            preuFinal = (float) (baseImponible * 1.20);
        }else {
            preuFinal = baseImponible;
        }

        System.out.printf("El preu final del producte es: %.2f €" , preuFinal);


    }
}
