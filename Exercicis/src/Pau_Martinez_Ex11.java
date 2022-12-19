import java.util.Scanner;

//11. Crea un algoritme que decideixi si un alumne aprova o suspèn l’assignatura de
//programació sabent que per aprovar, ha d’obtenir un 5 de mitjana entre les notes
//dels següents elements avaluables:
        //a. Exercicis entregables
        //b. POUs avaluables
        //c. Examen final
        //d. Pràctica final
//Demana a l’usuari que insereixi les 4 notes i que comprovi si l’alumne aprova o no.
//Mostra el resultat d’aprovat o no aprovat per pantalla
//Extra: Calcula la nota real de la UF1 segons el PIC usant els percentatges
//corresponents.


//Variables: Menu, Opcio, notaEx, notaPOU, notaExamen, notaPràctica;

public class Pau_Martinez_Ex11 {

    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);

        final String MENU = "a. Exercicis entregables\n" +
                            "b. POUs avaluables\n" +
                            "c. Examen final\n" +
                            "d. Pràctica final";

        float notaEx, notaPOU, notaExamen, notaPràctica, notaFinal;

        System.out.println("Benbingut al programa per estudiants per calcular la nota del modul");
        System.out.println(MENU);

        System.out.println("Introdueix la nota de Exercicis entregables");
        notaEx = llegir.nextFloat();

        System.out.println("Introdueix la nota de POUs avaluables");
        notaPOU = llegir.nextFloat();

        System.out.println("Introdueix la nota de Examen final");
        notaExamen = llegir.nextFloat();

        System.out.println("Introdueix la nota de Pràctica final");
        notaPràctica = llegir.nextFloat();


        System.out.println("Exelent: Calculant la teva nota . . . .");

        notaFinal = (float) (notaEx * 0.10 + notaExamen * 0.40 + notaPràctica * 0.30 + notaPOU * 0.20);

        if (notaFinal >= 0 && notaFinal < 5){
            System.out.printf("Ho sentim, has suspes amb un: %.2f", notaFinal);
        } else if (notaFinal >=5 && notaFinal <= 10) {
            System.out.printf("Enorabona has aprobat el modul amb un: %.2f", notaFinal);

        }else {
            System.out.println("Alguna cosa no ha anat be ho sentim molt");
        }


    }
}
