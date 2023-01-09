import java.util.Scanner;

public class MartinezPau_PVP {


    public static void main(String[] args) {

        float b2bPrice = 0;
        String preuIntroduit= " ";

        control(b2bPrice);

        System.out.println(b2bPrice);


    }
    public static float control(float preu) {
        Scanner llegir = new Scanner(System.in);

        boolean esFloat = true;

        do {
            System.out.println("Quin es el valor de compra del producte?");
            esFloat = llegir.hasNextFloat();

            if (esFloat == false){
                System.out.println("No es un valor Float");
                llegir.nextLine();
            }else {
                preu = llegir.nextFloat();
                esFloat = true;
            }

        }while (esFloat == false);
return preu;
    }

}
