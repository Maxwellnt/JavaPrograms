import java.util.Scanner;

public class Billets_MartinezPau {
    public static void main(String[] args) {

        int MIN = 1;
        int MAX = 6;
        final String MENU_PRINCIPAL =   "╔══════════ Menu principal ══════════╗ \n" +
                                        "║ 1 « Bitllet senzill                ║ \n" +
                                        "║ 2 « TCasual                        ║ \n" +
                                        "║ 3 « TUsual                         ║ \n" +
                                        "║ 4 « TFamiliar                      ║ \n" +
                                        "║ 5 « TJove                          ║ \n" +
                                        "╚═╦══════════════════════════════════╝ \n" +
                                        "  ╚╡Seleciona una opció: ";


        String nomDelBillet = "NULL";
        float zona1 = 0;
        float preuFinal = 0;
        for (int i = 1; i < 3;) {


        switch (MenuIntVerif(MIN,MAX,MENU_PRINCIPAL)) {
            case 1: { //Bitllet senzill
                zona1 = 2.40f;
                nomDelBillet = "Bitllet senzill";
                preuFinal += PreusBillets(zona1);
                break;
            }
            case 2: {
                zona1 = 11.35f;
                nomDelBillet = "TCaual";
                preuFinal += PreusBillets(zona1);
                break;
            }
            case 3: {
                zona1 = 40.00f;
                nomDelBillet = "TUsual";
                preuFinal += PreusBillets(zona1);
                break;
            }
            case 4: {
                zona1 = 10.00f;
                nomDelBillet = "TFamiliar";
                preuFinal += PreusBillets(zona1);
                break;
            }
            case 5: {
                zona1 = 80.00f;
                nomDelBillet = "TJove";
                preuFinal += PreusBillets(zona1);
                break;
            }

        }
            ++i;

        }




    }

    /**
     * [Lloc del metode original: MartinezPau_Temperatura.java] <br>
     * Crea un Menu a través d'un String i retorna un int que representa l'opció seleccionada  <br>
     *
     * @param min index minim per el control del menu
     * @param max index maxim per el control del menu
     * @param menu String on es mostrara el menu
     **/
    private static int MenuIntVerif (int min, int max, String menu){

        Scanner llegir = new Scanner(System.in);
        boolean isInt = true;
        int opcio = 0;

        System.out.print(menu);

        do {
            isInt = llegir.hasNextInt();

            if (!isInt){ // No
                isInt = VarInvalid();
            }else { // Si
                opcio = llegir.nextInt();
                if (opcio < min || opcio >  max){
                    isInt = VarInvalid();
                }
            }
        }while (!isInt);

        return opcio;
    }

    private static boolean MenuBoolVerif (String pregunta ){
        Scanner llegir = new Scanner(System.in);
        boolean esAfirmatiu = true;
        boolean valorsIntroduits;

        System.out.println(pregunta);

        String resposta = llegir.next();
        do {
            llegir.nextLine();
            if (resposta.equals("Si")){
                esAfirmatiu = true;
                valorsIntroduits = true;
            } else if (resposta.equals("No")) {
                esAfirmatiu = false;
                valorsIntroduits = true;
            } else {
                valorsIntroduits = VarInvalid();
            }
        }while (!valorsIntroduits);
    return esAfirmatiu;
    }

    private static float PreusBillets(float zona1){

    float zona2 = zona1 * 1.3125f;
    float zona3 = zona1 * 1.8443f;
    float preuEscollit = 0.00f;

    System.out.printf("""
            ╔═══════ Menu de Peus ═══════╗\t\s
            ║ 1 « Zona 1 ==>  %.2f €\t ║\s
            ║ 2 « Zona 2 ==>  %.2f €\t ║\s
            ║ 3 « Zona 3 ==>  %.2f €\t ║\s
            ╚═╦══════════════════════════╝\t\s
              ╚╡Seleciona una zona:\s""", zona1,zona2,zona3);
    switch(MenuIntVerif(1,3,"")){
        case 1 -> preuEscollit = zona1;
        case 2 -> preuEscollit = zona2;
        case 3 -> preuEscollit = zona3;
    }
    return preuEscollit;
    }

    /**
     * [Lloc del metode original: MartinezPau_Temperatura.java] <br>
     * Missatge que es mostrarà quan el valor introduit sigui incorrecte
     * @return boolean del control de errors
     */
    private static boolean VarInvalid(){
        Scanner llegir = new Scanner(System.in);

        boolean isVar = false;
        final String BR_RED = "\u001B[91m";
        final String RESET = "\u001B[0m";

        llegir.nextLine();
        System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);

        return isVar;
    }
}
