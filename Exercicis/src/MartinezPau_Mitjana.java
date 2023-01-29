import java.util.Scanner;

public class MartinezPau_Mitjana {
    public static void main(String[] args) {
        final String MENU_PRINCIPAL =   "Benvingut al progrmama seleciona una opcio: \n" +
                                            " 1. Calcular la mitjana de 5 notes \n" +
                                            " 2. Calcular la mitjana de 3 notes \n" +
                                            " 3. Deixam selecionar els quans numeros vui \n" +
                                            " 4. Sortir del programa \n ";




        boolean terminateProgram = false;

        float[] numIntroduits;

        do {


            switch (Menu(MENU_PRINCIPAL, 1, 4)) {
                // Calcula la mitjana
                case 1 -> {
                    numIntroduits = new float[5];

                    MitjanaAprovada(CalcularMitjana(numIntroduits),5.00f);
                }
                case 2 -> {
                    numIntroduits = new float[3];

                    MitjanaAprovada(CalcularMitjana(numIntroduits),5.00f);
                }

                case 3 -> {
                    numIntroduits = new float[llegirEnter(false)];

                    MitjanaAprovada(CalcularMitjana(numIntroduits),5.00f);
                }

                case 4 -> terminateProgram = true;
            }


        }while (!terminateProgram);
    }
    /**
     * [Lloc del metode original: MartinezPau_Temperatura.java] <br>
     * Crea un Menu a través d'un String i retorna un int que representa l'opció seleccionada  <br>
     *
     * @param missatge String que representara el menu
     * @param min index minim per el control del menu
     * @param max index maxim per el control del menu
     **/
    private static int Menu(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);

        int opcio = 0;
        boolean valorLegal;

        System.out.println(missatge);
        do {
            opcio = llegirEnter(false);
            if (opcio < min || opcio > max){
                valorLegal = VarInvalid();
            }else {
                valorLegal = true;
            }
        }while (!valorLegal);
        return opcio;
    }


    /**
     * Aquest Metde introduieix els valors del usuari i els possa en una matriu float per despers retornar la mitjana
     * @param nums L'array per saber el seu índex
     * @return Retorna la mitjana de la matriu
     */
    private static float CalcularMitjana(float[] nums){
        float mitjana;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introdueix el " + (1+i) + "º nombre.");
            nums[i] = llegirFloat();

        }

        mitjana = (SumarArray(nums) / nums.length);


     return mitjana;
    }


    /**
     * Suma tot els nombres d'un array float
     * @param nums El array del qual es sumaran
     * @return El valor dels arrays sumats
     */
    private static float SumarArray(float[] nums){
        float sumaTotal = 0;

        for (float num : nums) {
            sumaTotal += num;
        }

        return sumaTotal;
    }

    /**
     * Verifia si la mitjana es superor o igual a notaPerAprobat
     * @param mitjana La mitjana, o el valor que vulgis comprovar
     * @param notaPerAprobat La nota minima per poder aprovar
     */
    private static void MitjanaAprovada(float mitjana, float notaPerAprobat){

        boolean aprobat = (mitjana) >= notaPerAprobat;

        if (aprobat){
            System.out.printf("Enhorabona has aprobat amb un %.2f \n" ,(mitjana));
        }else {
            System.out.printf("La mitjana no superara del 5, has suspes amb un %.2f" ,(mitjana));
        }

    }


    /**
     * Metode on es verifica si el valor introduit correspon a la a un valor int
     * @param valorsNegatius Fa que l'usuari no pugui introduir valors negatius si esta en False
     * @return Retorna el valor int introduit per el usuari
     *
     */
    private static int llegirEnter(boolean valorsNegatius){
        Scanner llegir = new Scanner(System.in);

        boolean esInt;
        int numEnter = 0;

        do {
            esInt = llegir.hasNextInt();

            if (esInt){
                numEnter = llegir.nextInt();
                if (!valorsNegatius && numEnter < 0){
                    llegir.nextLine();
                    esInt = VarInvalid();
                }
            }else {
                llegir.nextLine();
                esInt = VarInvalid();
            }

        }while (!esInt);

        return numEnter;
    }

    /**
     * Metode on es verifica si el valor introduit correspon a la a un valor float
     * @return Retorna el valor float introduit per el usuari
     */
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
