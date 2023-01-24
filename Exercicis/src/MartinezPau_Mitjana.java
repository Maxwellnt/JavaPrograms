import java.util.Scanner;

public class MartinezPau_Mitjana {
    public static void main(String[] args) {
        final String MENU_PRINCIPAL =   "Benvingut al progrmama seleciona una opcio: \n" +
                                            " 1. Calcular la mitjana \n" +
                                            " 2. Sortir del programa \n ";
        final String MENU_TERMINAR_MITJANA = "Mitjana fins el monent \n" +
                                            " Introdueix \"T\" per per saber la mitjana? \n" +



        boolean terminateProgram = false;
        boolean terminateCalulus = false;

        float sumaTotaldeNum = 0.00f;
        int numDeEntitats = 0;

        do {


            if (Menu(MENU_PRINCIPAL, 1, 2) == 1) {
                // Calcula la mitjana
                do {
                    numDeEntitats++;
                    sumaTotaldeNum = CalcularMitjana(numDeEntitats,sumaTotaldeNum);


                 // preguntem si vol continuar calculant


                }

            } else {
                terminateProgram = true;
            }

        }while (terminateProgram == false);
    }

    private static int Menu(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);

        int opcio = 0;
        boolean valorLegal;

        System.out.println(missatge);
        do {
            opcio = llegirEnter();
            if (opcio < min || opcio > max){
                valorLegal = VarInvalid();
            }else {
                valorLegal = true;
            }
        }while (!valorLegal);
        return opcio;
    }

    private static float CalcularMitjana(int numDeEntitats, float sumaDeNums){



        sumaDeNums += llegirFloat();

     return sumaDeNums;
    }

    private static int
    private static int llegirEnter(){
        Scanner llegir = new Scanner(System.in);

        boolean esInt;
        int numEnter = 0;

        do {
            esInt = llegir.hasNextInt();

            if (esInt){
                numEnter = llegir.nextInt();
            }else {
                llegir.nextLine();
                esInt = VarInvalid();
            }

        }while (!esInt);

        return numEnter;
    }

    private static float llegirFloat() {
        Scanner llegir = new Scanner(System.in);

        boolean esFloat;
        float num = 0;

        do {
            esFloat = llegir.hasNextFloat();

            if (esFloat){
                num = llegir.nextFloat();
            }else {
                llegir.nextLine();
                esFloat = VarInvalid();
            }

        }while (!esFloat);

        return num;
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
}
