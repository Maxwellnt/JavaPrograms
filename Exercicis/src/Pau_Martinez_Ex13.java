import java.util.Scanner;

//Desenvolupa un programa pseudocodi que serveixi per gestionar la màquina de cafè
//de la 4rta planta de l’escola. Al començar, la màquina preguntarà al usuari quin
//producte vol i li oferirà les possibilitats de:
//1.Cafè
//2.Tallat
//3.Cafè amb llet
//4.Sortir.
//Si l'usuari escull qualsevol altre valor, li hem de tornar a mostrar el menú i tornar a
//demanar una opció. Un cop la màquina sap quin tipus de cafè vol l'usuari, li
//demanarà que introdueixi una moneda. Els tres tipus de cafè valen 0,50€. Si l'usuari
//introdueix un import igual o major a 0,50€, li prepararem el cafè, li tornarem el canvi
//que correspongui mostrant-li per pantalla i acabarà. En cas de que l'usuari introdueixi
//un import menor al preu del cafè, li mostrarà un missatge d'error i el programa
//acabarà.

//Variables: Menu, Diners,
public class Pau_Martinez_Ex13 {

    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);
        byte opció;
        float moneda;
        final float PREU_PRODUCTE = 0.50f;
        final String MENU_PRINCIPAL =   "\t1: Cafe" +
                                        "\t2: Tallat" +
                                        "\t3: Cafe amb llet" +
                                        "\t4: Sortir  ";

        System.out.println("Benvingut a la maquina de cafe seleciona una obicio.");
        System.out.println(MENU_PRINCIPAL);

        opció= llegir.nextByte();

        if (opció >= 1 && opció <= 3){

            do {
                System.out.println("\tHas escollit un producte existent, introdueix els diners" + PREU_PRODUCTE);
                moneda = llegir.nextFloat();
                System.out.println("De moment tens acomulat"+ (PREU_PRODUCTE-moneda));

            }while (moneda != 0.05f
                    && moneda != 0.10f
                    && moneda != 0.20f
                    && moneda != 0.50f
                    && moneda != 1.00f);


        switch (opció){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }
        }









    }
}
