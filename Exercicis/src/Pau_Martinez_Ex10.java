import java.util.Scanner;

//Imagina’t que ets un day-trader. Fes un algoritme que calculi els beneficis resultants
//d’invertir en Bitcoins suposant que el preu de la cryptomoneda és de 8400 € i que la
//seva oscil·lació diària de mercat és de +2%. Al final del dia, guanyaràs un 2% dels
//diners invertits. Demana a l’usuari quina quantitat vol invertir i mostra per pantalla
//l’import total en Bitcoins sumant-li els beneficis.
//Extra: El mercat de les cryptomonedes és inestable, això vol dir que tant es pot
//guanyar com perdre de forma inesperada. Per aquest motiu, afegeix una variable
//booleana al teu algoritme que determini si el mercat es troba a l’alça o a la baixa i en
//funció d’això guanyaràs 2% o el perdràs.

//Variables: crypto, inversio, mercarEsEstable
public class Pau_Martinez_Ex10 {

    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        float crypto, inversio;
        boolean mercatEstable;

        System.out.println("Benvingut al programa de day-trader!");
        System.out.println("Introdueix quants diners vols invertir?");
        inversio = llegir.nextFloat();

        crypto = (inversio / 8400);

        System.out.printf("La conversio es: %.4f BTC", crypto );
        System.out.println();

        System.out.println("Com esta el mercat? (Alça:True / Baixa:False)");
        mercatEstable = llegir.nextBoolean();

        if (mercatEstable){

            crypto *= 1.02;
        }else {
            crypto *= 0.98;
        }

        System.out.println("El teu resultat del dia es... : "+ crypto + "BTC");
    }
}
