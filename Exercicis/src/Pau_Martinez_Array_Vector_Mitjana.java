import java.util.Scanner;

public class Pau_Martinez_Array_Vector_Mitjana {
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        int numNotes = 4;
        boolean tipusCorrecte;
        do {
            System.out.println("Introdueix quantes notes vols mirar");
            tipusCorrecte = llegir.hasNextInt(); // Nomes mira el valor int del escaner no se apolica a la variable

            if (!tipusCorrecte){
                llegir.nextLine(); // Serveix per elimianr el numero del escaner
                System.out.println("ERROR: Valor incorrecte");
            }else {
                numNotes=llegir.nextInt(); // Passem sence possar imput perque ja hi ha un valor al escaner
            }

        }while (!tipusCorrecte);

        int[] notes = new int[numNotes];

        for (int i = 0; i <notes.length; i++) {
            do {
                System.out.println("Que nota vols possar?");
                tipusCorrecte = llegir.hasNextInt(); // Verifica si valor es INT

                if (!tipusCorrecte){
                    llegir.nextLine(); // Elimina valor en scan
                }else {
                    notes [i] = llegir.nextInt(); // Introduex valor
                }
            }while (tipusCorrecte = false);

            System.out.println("El valor es de "+ (i+1) + " es " + notes[i]);
            if (notes [i] >= 5){
                System.out.println("El alumne "+ (i+1)+" a aprobat");
            }else {
                System.out.println("El alumna "+ (i+1)+" a suspes");
            }
        }

        }
    }

