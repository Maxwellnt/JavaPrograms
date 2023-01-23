import java.util.Scanner;

public class MartinezPau_Temperatura {
    public static void main(String[] args) {



            final int min = 1;
            final int max = 4;
            final String menu = " Ey Benvulgut al programa :) \n" +
                    " ============================== \n" +
                    "  1. Cº -> Fº & Kº              \n" +
                    "  2. Fº -> Cº & Kº              \n" +
                    "  3. Kº -> Cº & Fº              \n" +
                    "  4. Sortida                    \n" +
                    " ============================== \n" +
                    "Seleciona una opcio: ";
            boolean tornar = true;
            int opcio;
        do {
            opcio = MenuVerif(min, max, menu);

            float celcius = 0.00f;
            float farenheit = 0.00f;
            float kelvin = 0.00f;

            switch (opcio) {
                case 1 -> CeliusConvetion(celcius, farenheit, kelvin);
                case 2 -> FarenheitConvetion(celcius, farenheit, kelvin);
                case 3 -> KelvinConvetion(celcius, farenheit, kelvin);
                case 4 -> tornar = false;
            }

        }while (tornar);
    }
    /**
     * Crea un Menu a través d'un String i retorna un int que representa l'opció seleccionada  <br>
     *
     * @param min index minim per el control del menu
     * @param max index maxim per el control del menu
     * @param menu String on es mostrara el menu
     **/

    private static int MenuVerif (int min, int max, String menu){


        Scanner llegir = new Scanner(System.in);
        boolean isInt = true;
        int opcio = 0;
        System.out.println(menu);

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

    /**
     * Converteix Celsius [float] en fahrenheit [float] i kelvin [float]
     *
     * @param celcius Variable float on s'introdueix la mesura Celsius
     *      * @param farenheit Variable float on es mesura fahrenheit
     *      * @param kelvin Variable float on es mesura kelvin
     */
    private static void CeliusConvetion(float celcius, float farenheit, float kelvin ){

        System.out.println("Introdueix la temperatura en celcius");
        celcius = FloatVerif();

        farenheit = (9.00f/5.00f)*celcius+32;
        kelvin = celcius + 273.15f;

        System.out.println("| "+celcius+"ºC |"+" "+farenheit+"ºF |"+" "+kelvin+"ºK |");
    }

    /**
     * Converteix farenheit [float] en celcius [float] i kelvin [float]
     *
     * @param celcius Variable float on es mesura Celsius
     * @param farenheit Variable float on s'introdueix es mesura Fahrenheit
     * @param kelvin Variable float on es mesura kelvin
     */
    private static void FarenheitConvetion(float celcius, float farenheit, float kelvin ){

        System.out.println("Introdueix la temperatura en Farenheit");
        farenheit = FloatVerif();

        celcius = (5.00f /9) * (farenheit - 32);
        kelvin = celcius + 273.15f;

        System.out.println("| "+celcius+"ºC |"+" "+farenheit+"ºF |"+" "+kelvin+"ºK |");
    }

    /**
     * Converteix kelvin [float] en celcius [float] i fareheit [float]
     *
     * @param celcius Variable float on es mesura Celsius
     * @param farenheit Variable float on es mesura Fahrenheit
     * @param kelvin Variable float on s'introdueix es mesura kelvin
     */
    private static void KelvinConvetion(float celcius, float farenheit, float kelvin ){

        System.out.println("Introdueix la temperatura en Kelvin");
        kelvin = FloatVerif();

        celcius = kelvin - 273.15f;
        farenheit = (9.00f/5.00f)*celcius+32;

        System.out.println("| "+celcius+"ºC |"+" "+farenheit+"ºF |"+" "+kelvin+"ºK |");
    }


    /**
     * Verifica que el valor introduit sigui un float
     * @return Retorna una variable float
     */
    private static float FloatVerif (){
        Scanner llegir = new Scanner(System.in);

        boolean isFloat;
        float varFloat = 0;
        do {
            isFloat = llegir.hasNextFloat();

            if (!isFloat){ // No
                isFloat = VarInvalid();
            }else { // Si
                varFloat = llegir.nextFloat();
            }
        }while (!isFloat);

       return varFloat;
    }


    /**
     * Missatge que es mostrarà quan el valor introduit sigui incorrecte
     * @return boolean del control de errors
     */
    private static boolean VarInvalid(){
        Scanner llegir = new Scanner(System.in);

        boolean isVar;
        final String BR_RED = "\u001B[91m";
        final String RESET = "\u001B[0m";

        llegir.nextLine();
        System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
        isVar = false;

        return isVar;
    }
}
