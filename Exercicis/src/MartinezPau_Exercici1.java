import java.util.Scanner;

public class MartinezPau_Exercici1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int opcio = 0;

        float fahenheit = 0.00f;
        float celsius = 0.00f;

        float miles = 0.00f;
        float kilometres = 0.00f;

        boolean tipusCorrecte;
        boolean sotrida = false;
        do {
            do {
                System.out.println("SELECCIONA MODE:\n" +
                        "1. Convertir una temperatura de graus Fahenheit a Celsius\n" +
                        "2. Convertir una distancia de milles a kilòmetres\n" +
                        "3. Sortir de l'aplicació");
                tipusCorrecte = llegir.hasNextInt(); // For Int

                if (!tipusCorrecte) {
                    System.out.println("ERROR: Input Incorrecta");
                } else {
                    opcio = llegir.nextInt();
                }
                llegir.nextLine();
            } while (!tipusCorrecte);

            switch (opcio) {
                case 1:

                    do {
                        System.out.println("Introduex els graus en Fahenheit");
                        tipusCorrecte = llegir.hasNextFloat(); // For Float

                        if (!tipusCorrecte) {
                            System.out.println("ERROR: Input Incorrecta");
                        } else {
                            fahenheit = llegir.nextFloat();
                        }
                        llegir.nextLine();
                    } while (!tipusCorrecte);

                    celsius = ((float) 5 / 9 * (fahenheit - 32));

                    // Imprimim
                    System.out.printf("%.2fºF son %.2fºC ", fahenheit, celsius);

                    break;
                case 2:

                    do {
                        System.out.println("Introduex la distancia en Millas");
                        tipusCorrecte = llegir.hasNextFloat(); // For Float

                        if (!tipusCorrecte) {
                            System.out.println("ERROR: Input Incorrecta");
                        } else {
                            miles = llegir.nextFloat();
                        }
                        llegir.nextLine();
                    } while (!tipusCorrecte);

                    kilometres = miles * 1.60f;

                    // Imprimim
                    System.out.printf("%.2fMile son %.2fºKm ", miles, kilometres);
                    break;

                case 3:
                    System.out.println("Que tingi un bon dia");
                    sotrida = true;
                    break;


            }
        }while (sotrida = false);
        }
    }

