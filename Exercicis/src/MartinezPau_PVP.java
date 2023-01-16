import java.util.Scanner;

public class MartinezPau_PVP {


    public static void main(String[] args) {

        float finalPrice = 0;
        int opcioMenu = 0;
        boolean esCorrecte;

        System.out.println("""
                Benvingut al programa de contabilitat:\s
                1. Donam el preu final!!\s
                2. Vui veure el preu detalladament""");
        System.out.println("Seleciona una opcio:");

        do {
            opcioMenu = controlInt();
            esCorrecte = true;

            switch (opcioMenu) {
                case 1 -> {
                    finalPrice = IVA(guany(controlFloat()));
                    System.out.printf("| Total (IVA.inc): %.2f € |", finalPrice);
                }
                case 2 -> {
                    float b2b = controlFloat();
                    float basImp = guany(b2b);
                    finalPrice = IVA(basImp);

                    System.out.printf("| Preu de compra: %.2f € |", b2b);
                    System.out.printf("| Base Inponible: %.2f € |", basImp);
                    System.out.printf("| Total (IVA.inc):  %.2f € |", finalPrice);

                }
                default -> {
                    esCorrecte = false;
                    System.out.println("Valor Incorrecte");
                }
            }
        }while (!esCorrecte);
    }

    public static int controlInt(){
        Scanner llegir = new Scanner(System.in);
        int val = 0;
        boolean isInt;
        do {
            isInt = true;
            isInt = llegir.hasNextInt();

            if (!isInt) {
                llegir.nextLine();
                System.out.println("Error: Number Invalid");
            }else {
                val = llegir.nextInt();
                isInt = true;
            }
        }while (!isInt);

        return val;
    }
    public static float controlFloat() {
        Scanner llegir = new Scanner(System.in);

        boolean esFloat;
        float preu = 0;
        do {
            esFloat = true;
            System.out.println("Quan te a costat el producte?");
            esFloat = llegir.hasNextFloat();

            if (!esFloat){
                System.out.println("No es un valor Float");
                llegir.nextLine();
            }else {
                preu = llegir.nextFloat();
                esFloat = true;
            }

        }while (!esFloat);
return preu;
    }

    public static float guany(float b2b) {
        int opcio = 0;
        boolean esCorrecte;

        System.out.println("""
                Quant percentage de guany vols tenir?\s
                1. 40% de benefici\s
                2. 50% de benefici\s
                3. 100% de benefici""");
        System.out.print("Seleciona una opcio:");

        do {
            opcio = controlInt();

            esCorrecte = true;
            switch (opcio) {
                case 1 -> b2b = b2b * 1.40f;
                case 2 -> b2b = b2b * 1.50f;
                case 3 -> b2b = b2b * 2.00f;
                default -> esCorrecte = false;
            }
            if (!esCorrecte){
                System.out.println("Valor incorrecte");
            }
        }while (!esCorrecte);
        return b2b;
    }

    public static float IVA(float baseInponible){
        int opcio = 0;
        boolean esCorrecte;

        System.out.println("""
                Que IVA te el producte?\s
                1. 0% de IVA\s
                2. 10% de IVA\s
                3. 21% de IVA""");
        System.out.print("Seleciona una opcio:");

        do {
            opcio = controlInt();
            esCorrecte = true;
            switch (opcio) {
                case 1 -> {}// Case NULL
                case 2 -> baseInponible *= 1.10f;
                case 3 -> baseInponible *= 1.21f;
                default -> esCorrecte = false;
            }
            if (!esCorrecte){
                System.out.println("Valor incorrecte");
            }
        }while (!esCorrecte);

        return baseInponible;
    }

}
