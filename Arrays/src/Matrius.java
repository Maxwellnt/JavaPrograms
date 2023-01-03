import java.util.Scanner;

public class Matrius {
    public static void main(String[] args) {
        final String BLACK = "\033[40m";
        final String WHITE_TEXT = "\033[37m";
        final String RED = "\033[41m";
        final String GREEN = "\033[42m";
        final String YELLOW = "\033[43m";
        final String BLUE = "\033[44m";
        final String PURPLE = "\033[45m";
        final String CYAN = "\033[46m";
        final String WHITE = "\033[47m";
        final String RESET = "\u001B[0m";

        Scanner llegir = new Scanner(System.in);

        String[][] horari = {{"Mates", "Català", "Castellà", "Anglès", "Educació Física"},
                {"Socials", "Naturals", "Tecnologia", "Educació Plàstica"}
        };

        String[] torn = {"Matí", "Tarda"};
        String[] diesSetmana = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};

        // Matí
        horari[0][0] = BLUE + "Mates" + RESET;
        horari[0][1] = RED + "Català" + RESET;
        horari[0][2] = WHITE + "Castellà" + RESET;
        horari[0][3] = YELLOW + "Anglès" + RESET;
        horari[0][4] = GREEN + "Educació Física" + RESET;

        // Tarda
        horari[1][0] = BLUE + "Socials" + RESET;
        horari[1][1] = GREEN + "Naturals" + RESET;
        horari[1][2] = WHITE_TEXT + BLACK + "Tecnologia" + RESET;
        horari[1][3] = PURPLE + "Educació Plàstica" + RESET;
        //horari[1][4] = "";

        int opcio = 0;
        System.out.println("Benvingut/da al programa");
        do {


            // TODO: Aplicar control d'errors
            boolean tipusCorrecte;
            do {


                System.out.println("Tria una opció:"
                        + "\n\t1. Mostrar horari complet"
                        + "\n\t2. Mostrar horari de torn"
                        + "\n\t3. Mostrar horari d'un dia"
                        + "\n\t4. Sortir"
                        + "");
                tipusCorrecte = llegir.hasNextInt(); // Nomes mira el valor int del escaner no se apolica a la variable

                if (!tipusCorrecte) {
                    llegir.nextLine(); // Serveix per elimianr el numero del escaner
                } else {
                    opcio = llegir.nextInt(); // Passem sence possar imput perque ja hi ha un valor al escaner
                }

            } while (tipusCorrecte = false);


            switch (opcio) {
                case 1:
                    for (int i = 0; i < diesSetmana.length; i++) {
                        System.out.printf("%15s", diesSetmana[i]);
                    }
                    System.out.println();

                    for (int fila = 0; fila < horari.length; fila++) {
                        System.out.print(torn[fila] + "\t"); // Matí o Tarda
                        for (int col = 0; col < horari[fila].length; col++) {
                            System.out.print(horari[fila][col] + "\t\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Digas si vols veure el horari de:"
                                + "\n\t1. Mati"
                                + "\n\t2. Tarda"
                        );
                        tipusCorrecte = llegir.hasNextInt(); // Nomes mira el valor int del escaner no se apolica a la variable

                        if (!tipusCorrecte) {
                            llegir.nextLine(); // Serveix per elimianr el numero del escaner
                        } else {
                            opcio = llegir.nextInt(); // Passem sence possar imput perque ja hi ha un valor al escaner
                        }

                    } while (tipusCorrecte = opcio < 1 || opcio > 2);
                    opcio -= 1;

                        for (int i = 0; i < horari[opcio].length; i++) {
                            System.out.print(horari[opcio][i] + "\t\t");

                        }
                    System.out.println(" ");

                    break;
                case 3:
                    System.out.println("En construcció...");

                    do {
                        System.out.println("Digas qui dia vols veure:");
                        for (int i = 0; i < diesSetmana.length; i++) {
                            System.out.println(  "\n\t" +(i+1)+". " + diesSetmana [i]);
                        }

                        tipusCorrecte = llegir.hasNextInt(); // Nomes mira el valor int del escaner no se apolica a la variable

                        if (!tipusCorrecte) {
                            llegir.nextLine(); // Serveix per elimianr el numero del escaner
                        } else {
                            opcio = llegir.nextInt(); // Passem sence possar imput perque ja hi ha un valor al escaner
                        }

                    } while (tipusCorrecte = opcio < 1 || opcio > 5);
                    opcio -= 1;

                    if (opcio == 4){
                        System.out.print(horari[0][opcio] + "\t\t");
                    }else {
                        for (int i = 0; i < horari.length; i++) {
                            System.out.print(horari[i][opcio] + "\t\t");
                        }
                    }


                    do {
                        String editar ;
                        System.out.println("Vols editar una assignatura? (Si / No)");
                        editar = llegir.next();
                        if (editar == "Si"){
                            System.out.println("Quina asignatura de mati vols?");
                            horari [0] [opcio] = llegir.next();

                            System.out.println("Quina asignatura de tarda vols?");
                            horari [1] [opcio] = llegir.next();


                        } else if (editar == "No") {
                            break;
                        }else {
                            System.out.println("ERROR: Introdueix un altre variable");
                            tipusCorrecte = false;
                        }

                    }while (tipusCorrecte = false);

                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Adéu i gràcies");
                    break;
                default:
                    System.out.println(RED + "ERROR: Valor no vàlid" + RESET);
                    break;
            }
        } while (opcio != 4);


    }
}