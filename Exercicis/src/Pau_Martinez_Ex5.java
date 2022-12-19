import java.util.Scanner;

//El preu d’una Volkswagen Grand California és de 73490€, com que és una gran
//inversió, en volem calcular el valor de mercat per si un dia la volem vendre de segona
//mà. Sabem que perd un 0.00001% de valor pera cada quilòmetre que recorre.
// Si la Volkswagen és la versió Camper Full Equip val 20000€ més. Modifica el
//teu algoritme per tal de que permeti fer el càlcul amb les dues opcions.

//Varibales esFull equip, preuVolks, preuMercat, km
public class Pau_Martinez_Ex5 {
    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        float preuVolks = 73490, preuMercat, km = 0.00f;
        boolean esFull;

        System.out.println("Benvingut al programa per calcular el preu de Volksvagen");
        System.out.println("El teu Volksvagen es una camper full equip? (True/False)");

        esFull = llegir.nextBoolean();

        if (esFull == true){
            preuVolks =+ 20000;
        }

        System.out.println("Quants kilometres as fet amb el teu Volksvagen?");

        km = llegir.nextFloat();

        preuMercat = (float) (preuVolks - ( (float)(preuVolks * 0.00001) * km));

        System.out.printf("El preu de mercat del teu Volksvagen es: %.2f €", preuMercat);

    }
}
