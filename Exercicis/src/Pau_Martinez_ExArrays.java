import java.util.Scanner;

public class Pau_Martinez_ExArrays {

    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        float notaMesAlta = 0.0f;

        // === No es podria utilitzar per el any que ve === //
        //float notaJasper;                                 //
        //float notaNico = 8;                               // ==> float 32 bits
        //float notaHector = 8.5f;                          // ==> v.primitiva
        //float notaIker = 2.6f;                            //
        // ===                                          === //

        //  ===  Arrays ===  //
        float[] notes;
        notes = new float [33]; // Hem creat 32 Variables de notes, perque coneça per 0 que no la podem utilitza

        // === Manera manual === //
        notes[1] = 8f; // Hem donat valor a la variable nota 1
        notes[2] = 8.5f;
        notes[3] = 26f;
        // ===    No mola    === //


        // === Apliquem al Array === //

        int nDeAlumnes;
        System.out.println("Quants alumnes hi ha a la calse?");

        nDeAlumnes = llegir.nextInt(); // Ex: 32
        notes = new float[nDeAlumnes]; // Ex: Creara 32 index per el float

        for (int i = 0; i < notes.length; i++) { // notes.length es el nombre total de index que te la variable
            System.out.println("Introdueix la nota de l'alumn@" + (i + 1)); // i+1 esta per no començar per el index 0
            notes[i] = llegir.nextFloat();
        }

        for (int i = 0; i < notes.length; i++) { // i = 0: Començem per el index
            System.out.println(" La nota del alumne "+ (i + 1) + " es " + notes[i] );
        }

        System.out.println("Aplicarem campana de Gaus sobre las notas");

        for (int i= 0; i < notes.length ; i++) { // i++ : Cada vegada que acabi el loop es sumara +1

            if (notes [i] > notaMesAlta){
                notes [i] = notaMesAlta;
            }

        }
    }
}

