
import java.util.Scanner;

public class MartinezPau_Calculadora {
    public static void main(String[] args) {
        float valor1, valor2, resultat;
        final String MENU_PRINCIPAL = "Les opcions del menú són:\n1- Suma\n2- Resta\n3- Multplicació\n4- Divisió\n5- Exponencial\n6- Sortir";
        int opcioMenu = 0;

        System.out.println("Benvingut al programa de calculadora.");
        resultat = 0;
        do {
            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 6);
            valor1 = llegirFloat("Escriu el primer valor:  ");
            valor2 = llegirFloat("Escriu el segon valor: ");

            switch (opcioMenu) {
                case 1:
                    resultat = suma(valor1, valor2);
                    System.out.println("El resultat de la suma és: " + resultat);
                    break;
                case 2:
                    resultat = resta(valor1,valor2);
                    System.out.println(resultat);
                    break;
                case 3:
                    resultat = multiplication(valor1,valor2);
                    System.out.println(resultat);
                    break;
                case 4:
                    resultat = division(valor1,valor2);
                    System.out.println(resultat);
                    break;
                case 5:
                    resultat = exp(valor1,valor2);
                    System.out.println(resultat);
                    break;
                case 6:
                    System.out.println("Sortint... ");
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }

        }while(opcioMenu != 6);


    }


    private static int llegirEnter(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    public static float llegirFloat(String missatge){
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no float.");
                llegir.nextLine();
            }else{
                x = llegir.nextFloat();
                llegir.nextLine();
            }

        }while(!valorCorrecte);

        return x;
    }

    public static float suma (float x, float y){
        float suma = x + y;
        return suma;
    }
    public static float resta (float x, float y){
        float resta = x - y;
        return resta;
    }
    public static float multiplication(float x, float y){
        float multi = x * y;
        return multi;
    }
    public static float division(float x, float y){
        float div = x / y;
        return div;
    }
    public static float exp(float x, float y){
        float exp = 0;
        y = (int)y;
        // Com ho faria jo
        if (y==0){
            exp = 1;
        }
        else {
            for (int i = 1; i < y; i++) {
                if (i==1){
                    exp = x;
                }
                exp *= x;
            }
        }


        return exp;
    }

}