import java.util.Scanner;

// Els treballadors d’un concessionari reben al mes un +10% extra de comissió per les
//seves vendes de cotxes. Un venedor vol saber quants diners extra cobrarà en
//concepte de comissions per a les 3 vendes que ha aconseguit fer aquest mes. Fes que
//el programa li demani l’import de cada una de les vendes, que en calculi el 10% del
//total i que ho mostri per pantalla.
//Extra: Modifica l’algoritme per tal de que també li demani el sou base a l’empleat i així
//mostrar el seu sou total a final de mes.


// Variables: numCotxesVenuts, souBase, preuCotxes
public class Pau_Martinez_Ex9 {

    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        float  souBase, preuCotxes;
        int numCotxesVenuts = 3;

        System.out.println("Benvingut al programa de contabilitat del concessionari!");
        System.out.println("Introdux el teu sou base:");
        souBase = llegir.nextFloat();

        System.out.println("Cuants cotxes as venut aquets mes?");
        numCotxesVenuts = llegir.nextInt();

        while ( numCotxesVenuts != 0){
            System.out.println("cuan a costat el "+ numCotxesVenuts +"º cotxe?");
            preuCotxes = llegir.nextFloat();
            souBase += (preuCotxes * 0.10);

            System.out.printf("De moment el sou final es: %.2f $", souBase);
            System.out.println();
            numCotxesVenuts -= 1;

        }

        System.out.printf("El teu sou final es de: %.2f $", souBase);
    }
}
