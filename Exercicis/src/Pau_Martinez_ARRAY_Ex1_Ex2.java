import java.util.Scanner;

public class Pau_Martinez_ARRAY_Ex1_Ex2 {
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        int [] num = new int[5];
        boolean control;
        for (int i = 0; i < num.length; i++) {
            do{
            System.out.println("Introdueix un nombre");
            control = llegir.hasNextInt();

            if(control){
                num [i] = llegir.nextInt();
            }else {
                llegir.nextLine();
                System.out.println("Error: Introdueix nombre correta");
            }
        } while (!control);

            System.out.print("Els nombres son: ");
        }
        /* Del principi a final
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]+ ", ");

        }*/
        // de final a principi
        for (int i = 5; i > 0  ; i--) {

            System.out.print(", "+ num[i-1]);

        }
    }
}
