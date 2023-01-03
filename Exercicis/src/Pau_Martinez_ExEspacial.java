import java.util.Scanner;

public class Pau_Martinez_ExEspacial {
    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        float preu = 0.00f, preuFinal = 0.00f;

            // == Error de complicació == //
        final float IVA = 1.21f;
            // L'error està en què li estem donant un valor doble a una variable float


        boolean dataControl = false;

                                    // == Error de complicació == //
        System.out.println("Benvingut al programa per calcular el IVA! Ara amb control de dades ");
        // L'error a qui és que l'out no està llavors Intelige no pot compilar aquesta comanda //


        do {
            System.out.println("Introdueix el preu de la compra sensa IVA");
            dataControl = llegir.hasNextFloat();

            if (!dataControl){
                llegir.nextLine();
            }else{
                    // == Error en Temps de execution == //
                preu = llegir.nextInt();
                // L'error prove que el scanner té un valor Int i la variable té un valor float//
                // per aregar-lo posaríem: llegir.netFloat(); //

                preuFinal = preu * IVA;
            }
        }while (!dataControl);

            // == Error en Temps de execucio == //
        System.out.printf("El total sense IVA es: %.2f", preu);
        System.out.printf(" i el total amb IVA es: %.2f", preuFinal);
        // Aquest error està perquè el format del print és incorrecta, depenent del format la sintaxi cambia //
        // el format correcte seria printf //

    }
}
