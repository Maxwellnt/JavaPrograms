import java.util.Scanner;

//La ciutat de Girona està banyada pels rius Ter i Onyar. Quan plouen més de 90 litres
//per metre quadrat, el riu Onyar puja de nivell i posa en perill els fonaments dels edificis
//de la vora del riu. Quan això passa, s’han d’obrir unes comportes per tal de desviar
//l’aigua del riu Onyar cap al riu Ter. Crea un algoritme que gestioni les comportes.

//Varibles: plouLit, comportes
public class Pau_Martinez_Ex6 {
    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String RESET = "\u001B[0m";

        float plouLit;
        boolean comportes;

        System.out.println(GREEN +"#####"+ RESET+ " Benvingut al programa dels rius Ter i Onyar "+ GREEN +"#####"+ RESET);
        System.out.println(GREEN +"#####"+ RESET+ " Mode manual: "+ YELLOW + "ACTIVAT."+ RESET +" Introdueix els litres "+ GREEN +"#####"+ RESET);

        plouLit = llegir.nextFloat();

        if (plouLit >= 90) {
            System.out.println(GREEN +"#####"+ RED +"  PERILL DETECTAT, DESBORDAMENT IMMINENT!!   "+ GREEN +"#####"+ RESET);
            System.out.println(GREEN +"#####"+ RESET+" Tencant els comportes... Comportes tancades "+GREEN +"#####"+ RESET);
        }else {
            System.out.println(GREEN +"#####"+ RESET+" Estat del riu:"+ BLUE+"ESTABLE."+RESET+" Que tingi un bon dia "+GREEN +"#####"+ RESET);
        }

    }
}
