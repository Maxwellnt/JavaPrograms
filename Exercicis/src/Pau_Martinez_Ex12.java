import java.util.Scanner;

//Escriu un algoritme que calculi el cost de la factura de l’aigua en funció dels litres
//consumits. El cost es calcularà de la següent manera:
    //a. La quota fixa mensual és de 6€ de manteniment.
    //b. Si el consum de l’aigua és menor de 50 litres al mes, no es paga quota
    //variable.
    //c. Si el consum d’aigua es troba entre 50 i 200 litres, es paga 0.15 € al litre.
    //d. Si el consum és major de 200 litres, es paga el litre a 0.30 €.

//Variable: litres, preuFinal
public class Pau_Martinez_Ex12 {
    public static void main(String[] args) {
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String RESET = "\u001B[0m";
        Scanner llegir = new Scanner(System.in);

        float litres, preuFinal = 6.00f;

        System.out.println(BLUE +"Benvingut al programa de facturacio de l'aigua!");
        System.out.println("Introdueix l'aigua consumida aquest mes!" + RESET);
        litres = llegir.nextFloat();

        if (litres >= 50 && litres <= 200) {
            preuFinal += (float) (litres * 0.15);

        } else if (litres > 200) {
            preuFinal += (float) (litres * 0.20);
        }

        System.out.printf("Tens de pagar:"+ YELLOW+ "%.2f", preuFinal);
    }

}
