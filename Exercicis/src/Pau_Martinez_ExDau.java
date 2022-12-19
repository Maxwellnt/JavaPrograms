import java.util.Scanner;

public class Pau_Martinez_ExDau {
    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        int valorUsuari = 0;

        do{
            System.out.println("Introdueix un numero entre el 1 y 10:");
            valorUsuari = llegir.nextInt();

        }while (valorUsuari < 1 || valorUsuari > 10);

        System.out.println("Enorabona, has introduit:" + valorUsuari);
    }
}
