import java.util.Scanner;

public class Pau_Martinez_Array_Ex5 {
    public static void main(String[] args) {


        Scanner llegir = new Scanner(System.in);

        int num1 [] = new int[10];
        int num2 [] = new int[10];

        for (int i = 0; i < num1.length; i++) {
            num1 [i] = (int) (Math.random()*10);
        }

        for (int i = 0; i < num1.length; i++)    {
            if (i == 10){
                num2 [(num2.length-1)] = num1 [0];
            }else{
                num2 [i] = num1 [(i+1)];
            }
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num2 [i] + " i " + num1 [(i)]);

        }
    }
}
