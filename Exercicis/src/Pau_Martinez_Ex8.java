import java.util.Scanner;

//Un hostal cobra la nit per persona a 20€, però si l’últim dia el client vol deixar l’habitació
//més tard de les 12h del migdia es cobren +15€. Crea un algoritme que mostri l’import
//de l’estada per pantalla.
//Extra: El cost de la mitja pensió amb l’esmorzar i el dinar inclosos és de 20€ per dia i
//persona. Modifica el teu algoritme per tal de que permeti escollir quants dies de mitja
//pensió es volen. Tingues en compte que el total de dies de mitja pensió no pot superar
//el total de dies de l’estada a l’hostal.

//Variables: numPersones, numNits, numPensions, horaSurtida, importFinal

public class Pau_Martinez_Ex8 {


    public static void main(String[] args) {

        Scanner llegir =new Scanner(System.in);

        int numPersones, numNits, numPensions, horaSurtida, numMitjaPensio;
        float importFinal = 0.0f;

        do{
            System.out.println("Quantes persones vindran?");
            numPersones = llegir.nextInt();

        }while (numPersones < 0 || numPersones > 10);

        do {
            System.out.println("Quants dies estaran?");
            numNits = llegir.nextInt();
        }while (numNits < 0 || numNits > 16);

        do{
            System.out.println("Quants dies de mitja pensio?");
            numMitjaPensio = llegir.nextInt();
        }while (numMitjaPensio < 0 || numMitjaPensio > numNits);

        do{
            System.out.println("A quina hora marxareu el ultim dia?");
            horaSurtida = llegir.nextInt();
        }while (horaSurtida < 0 || horaSurtida > 23);





    }
}
