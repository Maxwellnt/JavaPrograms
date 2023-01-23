import java.sql.SQLOutput;
import java.util.Scanner;

public class Billets_MartinezPau {

    public static void main(String[] args) {
        float preuFinal = 0.00f;
        int MIN = 1;
        int MAX = 6;


        String [][] infoTicket = new String[3][3];
        float zona1;
        boolean paradaDeManteniment = false;
        boolean tornarAComprar = false;
        int billets = 0; // El maxim sera 3

        do {


        do {
            ActualizarMenuPrincial(preuFinal);  // Imprimim el menu princial
            switch (MenuIntVerif(MIN,MAX)) {    // Introduim la opcio del menu
                case 1: { //Bitllet senzill
                    zona1 = 2.40f;
                    infoTicket[billets] = PreusBillets(zona1);
                    infoTicket[billets][0] = "Billet_senzill";
                    break;
                }
                case 2: { // TCasual
                    zona1 = 11.35f;
                    infoTicket[billets] = PreusBillets(zona1);
                    infoTicket[billets][0] = "TCasual";
                    break;
                }
                case 3: { // TUsual
                    zona1 = 40.00f;
                    infoTicket[billets] = PreusBillets(zona1);
                    infoTicket[billets][0] = "TUsual";
                    break;
                }
                case 4: { // TFamiliar
                    zona1 = 10.00f;
                    infoTicket[billets] = PreusBillets(zona1);
                    infoTicket[billets][0] = "TFamiliar";
                    break;
                }
                case 5: { // TJove
                    zona1 = 80.00f;
                    infoTicket[billets] = PreusBillets(zona1);
                    infoTicket[billets][0] = "TJove";
                    break;
                }
                case 4321: { // Mode de desenvolupador

                    System.out.println("Parant la maquina...");
                    paradaDeManteniment = true;
                    break;

                }
            }
                if (!paradaDeManteniment){
                    // Switch se acaba

                    // Añadirem el preu del tiquet al total amb parseFloat
                    preuFinal += Float.parseFloat(infoTicket[billets][2]);


                    // Sumarem el tiquet que hem comprar
                    billets++;
                    System.out.println("Tens " + billets + " billets");

                    // 1 -> 2 -> 3 -> Stop
                    // Verifiquem si ya tenim 3 billets
                    if (billets != 3) { // Si tenim menys de

                        // Imprimim el menu de torar a comprar
                        boolean comprarMesBillets = MenuBoolVerif();
                        if (!comprarMesBillets) {// En cas negatiu
                            tornarAComprar = false;
                            break;
                        } else {// En cas possitiu
                            tornarAComprar = true;
                        }
                    } else {
                        tornarAComprar = false;
                    }
                }else {
                    break;
                }

                }while (tornarAComprar) ;

            if (!paradaDeManteniment) {
                // Compra final
                System.out.print("╔═════════╡ Ticket de Compra │ \n");
                for (int i = 0; i < billets; i++) {
                    System.out.print("╟» ");
                    for (int j = 0; j < infoTicket[i].length - 1; j++) {
                        System.out.print(infoTicket[i][j] + " -- ");
                    }
                    System.out.printf("%.2f € \n", Float.parseFloat(infoTicket[i][2]));

                }
                System.out.printf("╚═════════╡ Total: %.2f€ │  \n", preuFinal);

                // Ticket impimit

                do {
                    System.out.printf("Et queden: %.2f€ \n", preuFinal);
                    preuFinal=Pagament(preuFinal);

                }while (preuFinal > 0.04f);

                if (preuFinal <= 0.04f && preuFinal >= 0){
                    System.out.printf("Per programacio intencionada et regalem aquests: %.2f€ ", preuFinal);
                }else {
                    System.out.println("Retornat canvi...");
                    System.out.printf("*Has obtingut: %.2f€ * \n", Math.abs(preuFinal)); // Amb Math.abs mostrara el valor absolut de preu Final es a dir, mostra el que té de retornar la maquina
                }

                preuFinal = 0;
            }


            }while (!paradaDeManteniment);


    }

    /**
     * [Lloc del metode original: MartinezPau_Temperatura.java] <br>
     * Crea un Menu a través d'un String i retorna un int que representa l'opció seleccionada  <br>
     *
     * @param min index minim per el control del menu
     * @param max index maxim per el control del menu
     **/
    private static int MenuIntVerif (int min, int max){

        Scanner llegir = new Scanner(System.in);
        boolean isInt = true;
        int opcio = 0;

        do {
            isInt = llegir.hasNextInt();

            if (!isInt){ // No
                llegir.nextLine();
                isInt = VarInvalid();
            }else { // Si
                opcio = llegir.nextInt();
                if (opcio == 4321){
                    llegir.nextLine();
                    // Developer mode
                } else if (opcio < min || opcio > max) {
                    llegir.nextLine();
                    isInt = VarInvalid();
                }
            }
        }while (!isInt);

        return opcio;
    }

    /**
     * Crea un Menu a través d'un String "picat a pedra" i retorna un boolean  <br>
     * Utilitza String equals per saber la resposta
     * @return Retora un true o un false depenent del input
     */
    private static boolean MenuBoolVerif (){
        Scanner llegir = new Scanner(System.in);
        boolean esAfirmatiu = true;
        boolean valorsIntroduitsLegals;

        System.out.println("""
                 Vols comprar un altre billet?\s
                     ╔══════╗   ╔══════╗  \s
                     ║  Si  ║   ║  No  ║  \s
                     ╚══════╝   ╚══════╝  \s
                Seleciona una opcio: \s""");

        String resposta = llegir.next();
        do {
            valorsIntroduitsLegals = true;
            llegir.nextLine();
            if (resposta.equalsIgnoreCase("SI")){
                esAfirmatiu = true;

            } else if (resposta.equalsIgnoreCase("NO")) {
                esAfirmatiu = false;

            } else {
                valorsIntroduitsLegals = VarInvalid(); // Donara misatge de error i convertira el boolean en false
            }
        }while (!valorsIntroduitsLegals);
    return esAfirmatiu;
    }

    /**
     * Utilitza un menu integrat per calcular els preus de les zones 1, 2 i 3
     * @param zona1 El preu "Inicaial del billet de tren, es en el qual es basen les calculacions del es demes zones
     * @return Retorna un Array amb la seguent informacio: {"*", "Zona" , "Preu"}
     */
    private static String[] PreusBillets(float zona1){
        String[] infoBillet = {"Nom","Zona","Preu"};
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
    switch(MenuIntVerif(1,3)){
        case 1 -> {
            infoBillet[1] = "Zona 1";
            infoBillet[2] = String.valueOf(zona1);
        }
        case 2 -> {
            infoBillet[1] = "Zona 2";
            infoBillet[2] = String.valueOf(zona2);
        }
        case 3 -> {
            infoBillet[1] = "Zona 3";
            infoBillet[2] = String.valueOf(zona3);
        }
        case 4321 -> {
            System.out.println("Force stop, no posible intenta ferlo desde el menu principal");
            infoBillet[2] = "0";
        }
    }
    return infoBillet;
    }

    /**
     * [Lloc del metode original: MartinezPau_Temperatura.java] <br>
     * Missatge que es mostrarà quan el valor introduit sigui incorrecte
     * @return boolean del control de errors
     */
    private static boolean VarInvalid(){

        boolean isVar = false;
        final String BR_RED = "\u001B[91m";
        final String RESET = "\u001B[0m";


        System.out.println(BR_RED +"ERROR: Input Incorrecta" + RESET);

        return isVar;
    }

    /**
     * Metode que es totalment opcional i que el seu sol proposit es que en el menu et mostri el total fins ara
     * @param preuFinal Es el preu conjunt de la compra, s'utilitza per mostrar el preu en el menu
     */
    private static void ActualizarMenuPrincial(float preuFinal){

        System.out.printf(      "╔══════════\tMenu principal \t══════════╗ \n" +
                                "║ 1 « Bitllet senzill      \t          ║ \n" +
                                "║ 2 « TCasual              \t          ║ \n" +
                                "║ 3 « TUsual               \t          ║ \n" +
                                "║ 4 « TFamiliar            \t          ║ \n" +
                                "║ 5 « TJove                \t          ║ \n" +
                                "╚═╦════════\tTotal: %.2f€\t══════════╝ \n" +
                                "  ╚╡Seleciona una opció: ", preuFinal);
    }

    /**
     * Metode que se utilitza per rebre un input i verificar si es un valor float
     * @return retorna el valor float introduit per el usuari
     */
    private static float esFloat(){
        Scanner llegir = new Scanner(System.in);
        boolean isFloat = true;
        float resulatat = 0;

        do {
            isFloat = llegir.hasNextFloat();

            if (!isFloat){ // No
                llegir.nextLine();
                isFloat = VarInvalid();
            }else { // Si
                resulatat = llegir.nextFloat();

            }
        }while (!isFloat);

        return resulatat;
    }

    /**
     * Methode que s'utilitza per verificar si el valor float es compatible amb les mondes i billets europeus
     * @param preuFinal Es la suma de tots els preus de la compra
     * @return Retorna la variable "preuFinal" menys el valor introduit per el usuari
     */
    private static float Pagament(float preuFinal){
        Scanner llegir = new Scanner(System.in);
        boolean esLegal;
        float monedaIntroduda = 0;
        float [] mondeasLegals = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50f, 0.20f, 0.10f};

        do {
            esLegal = false;
            System.out.println("Introdueix billets o monedes per pagar");
            monedaIntroduda = esFloat();

            for (float mondeasLegal : mondeasLegals) {
                if (monedaIntroduda == mondeasLegal) {
                    esLegal = true;
                    break;
                }
            }
            if (!esLegal){
                VarInvalid();
            }
        }while (!esLegal);

        preuFinal = preuFinal - monedaIntroduda;

        return preuFinal;
    }
}
