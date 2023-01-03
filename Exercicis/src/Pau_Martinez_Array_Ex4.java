import java.util.Scanner;

public class Pau_Martinez_Array_Ex4 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int [] a = new int[10];
        int indexA = 0;
        int [] b = new int[10];
        int indexB = 0;
        int [] c;
        int o = 0;

        boolean editarMatriu;
        boolean dataControl;

        System.out.println("Benvingut al programa, per default la logitut de les arrys a i b es 10, vols editarlo? (true/false)");
        editarMatriu = llegir.nextBoolean();

        if (editarMatriu) {

            do {
                System.out.println("Introdueix quants index vols al (a i b) ");

                dataControl = llegir.hasNextInt();
                if (!dataControl) {
                    llegir.nextLine();
                } else {
                    indexA = llegir.nextInt();
                    indexB = indexA;
                }
            } while (!dataControl || indexA < 0);
            a = new int[indexA];
            b = new int[indexB];


        }
            c = new int[(a.length + b.length)];
        for (int i = 0; i < a.length; i++) {

            do {
                System.out.println("Intordueix el "+ (i+1)+ "º nombre de a");
                dataControl = llegir.hasNextInt();

                if (!dataControl) {
                    llegir.nextLine();
                } else {
                    a [i] = llegir.nextInt();
                }
            } while (!dataControl);

            do {
                System.out.println("Intordueix el "+ (i+1)+ "º nombre de b");
                dataControl = llegir.hasNextInt();

                if (!dataControl) {
                    llegir.nextLine();
                } else {
                    b [i] = llegir.nextInt();
                }
            } while (!dataControl);



                c [o] = a[i];
                c [(o+= 1)] = b[i];

                o +=1;
            }


        for (int i = 0; i < c.length; i++) {
            System.out.println( c[i] );
        }



    }
}
