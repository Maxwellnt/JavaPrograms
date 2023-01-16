import java.util.Scanner;

public class Martinez_Pau_ParellSenar {
    public static void main(String[] args) {
        int num = controlInt();
        boolean comprovar = esParell(num);

        if (comprovar){ // Es parell
            System.out.println("El " + num + " Es parell");
        }else { // No es parell
            System.out.println("El " + num + " Es senar");
        }

    }
    public static int controlInt(){
        Scanner llegir = new Scanner(System.in);
        int val = 0;
        boolean isInt;
        System.out.println("Escull qualsevol numero enter");
        do {
            isInt = true;

            isInt = llegir.hasNextInt();

            if (!isInt) {
                llegir.nextLine();
                System.out.println("Error: Number Invalid");
            }else {
                val = llegir.nextInt();
                isInt = true;
            }
        }while (!isInt);

        return val;
    }
    public static boolean esParell(int num){
       boolean esParell;
        esParell = (num % 2) == 0;
       return esParell;
    }
}
