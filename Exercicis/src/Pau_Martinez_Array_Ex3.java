import java.util.Scanner;

public class Pau_Martinez_Array_Ex3 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int [] num;
        int indexar = 0;
        float mediaPositiva = 0;
        int numPositiva = 0;
        float mediaNegativa = 0;
        int numNegativa = 0;
        int numZeros = 0;

        boolean tipusCorrecte;

        do {
            System.out.print("Benvingut al programa, Introdueix el quants numeros vols posar.");
            tipusCorrecte = llegir.hasNextInt();

            if (!tipusCorrecte){
                llegir.nextLine();
            }else {
                indexar = llegir.nextInt();

            }
        }while (!tipusCorrecte);

        num = new int[indexar];

        for (int i = 0; i < num.length; i++) {

            do{
                System.out.println("Introdueix el Numero");
                tipusCorrecte = llegir.hasNextInt(); // Nomes mira el valor int del escaner no se apolica a la variable

                if (!tipusCorrecte){
                    llegir.nextLine(); // Serveix per elimianr el numero del escaner
                }else {
                    num [i] = llegir.nextInt(); // Passem sence possar imput perque ja hi ha un valor al escaner
                }
            }while (!tipusCorrecte);


            if (num[i] > 0  ){
                System.out.println("Nombre "+ (i+1) +" detectat com a possitu");
                mediaPositiva += num[i];
                numPositiva++;

            }else if (num[i] < 0) {
                System.out.println("Nombre "+ (i+1) +" detectat com a negatiu");
                mediaNegativa += num[i];
                numNegativa++;

            }else {
                System.out.println("Nombre "+ (i+1) +" detectat com a zero");
                numZeros++;
            }

        }

        mediaNegativa /= numNegativa;
        mediaPositiva /= numPositiva;

        System.out.println("Has introduit " + numPositiva + " nombres positius i la seva mitja es: " + mediaPositiva);
        System.out.println("Has introduit " + numNegativa + " nombres positius i la seva mitja es: " + mediaNegativa);
        System.out.println("Y has introduit "+ numZeros +" zeros");


    }
}
