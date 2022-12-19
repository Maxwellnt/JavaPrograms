import java.util.Scanner;

public class Pau_Martinez_Matrius_Ex3 {
    public static void main(String[] args) {


        Scanner llegir = new Scanner(System.in);

        String [][] figura = new String[5][5];

        /* X X X X X Figura
             X [1][1]
               X  
                 X  
           X X X X X
         */

        for (int i = 0; i < figura.length; i++) {
            figura [0] [i] = "X";
            figura [4] [i] = "X";
            if (i > 0){
                figura [i] [i]="X";
            }
        }

        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura.length; j++) {
                System.out.print(figura [i][j] + " ");

            }
            System.out.println("");
        }
    }
}
