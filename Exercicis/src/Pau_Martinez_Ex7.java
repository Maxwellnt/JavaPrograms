import java.util.Scanner;

//Pensa un algoritme que serveixi per a calcular el sou dels sanitaris. Ens diuen que el
//seu salari base és de 1250 €. Afegidament, les hores extra es paguen a part. Si en fan
//fins a 5 extra es paguen a 15 € l’hora; si en fa més de 5, se li paguen 15€ l’hora fins a
//les primeres 5 hores i 12€ per a cada hora extra de més. Tingues en compte que no
//sempre fan hores extra.

//Extra: Modifica el teu algoritme per tal de que sumi un plus de risc de +250€ al sou
//base i +5€ per a cada hora extra (independentment de quantes en facin) als sanitaris
//que estiguin exposats al covid-19.

//Variables salariBase, horesExtra, cobroExtra, cobroExt, covid, salariTotal
public class Pau_Martinez_Ex7 {

    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        float salariBase = 1250, horesExtra = 0.00f, cobroExtra = 15.00f, cobroExtraEx = 12.00f, salariTotal = 0.00f;
        boolean covid;


        System.out.println("Benvingut al programa de la agencia sanitaria.");
        System.out.printf("Has estat exposat al COVID? (true/false)");
        covid = llegir.nextBoolean();

        if (covid == true) {
            salariBase +=  250;
            cobroExtra +=  5;
            cobroExtraEx +=  5;
        }

        System.out.println("Quantes hores extres as fet?");
        horesExtra = llegir.nextFloat();

        if (horesExtra >= 5) {
          salariTotal =  ((salariBase + ((horesExtra - 5) * cobroExtraEx + (5 * cobroExtra) )));

        }else {
            salariTotal= (salariBase + (horesExtra * cobroExtra ));
        }

        System.out.printf("El teu sou base final es: %.2f €", salariTotal );

    }
}
