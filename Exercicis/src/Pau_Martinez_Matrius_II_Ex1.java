import java.util.Scanner;

public class Pau_Martinez_Matrius_II_Ex1 {
    public static void main(String[] args) {
        final String RED = "\033[41m";
        final String BLUE = "\033[44m";
        final String RESET = "\u001B[0m";

        Scanner llegir = new Scanner(System.in);

        int [][] taula1;
        int [][] taula2;
        boolean [][] taula3;
        String [][] taula4;
        int [][] taula5;
        boolean [][] taula6;


        int [] valors = new int[2];
        String [] coluna = {"Columna", "Fila"};
        int opcio = 0;

        boolean tipusCorrecte;
        System.out.println("Definex les dimencions de la Matriu");
        for (int i = 0; i < 2 ; i++) {


        do {
            System.out.println("Definex les dimencion de " + coluna [i]);
            tipusCorrecte = llegir.hasNextInt(); // For Int

            if (tipusCorrecte == false){
                llegir.nextLine();
                System.out.println("ERROR: Input Incorrecta");
            }else{
                valors [i] = llegir.nextInt();}
        }while (tipusCorrecte == false);
        }

        do {
            System.out.println("Quina matriu voldras? (1-6)");
            tipusCorrecte = llegir.hasNextInt(); // For Int

            if (tipusCorrecte == false){
                llegir.nextLine();
                System.out.println("ERROR: Input Incorrecta");
            }else{
                opcio = llegir.nextInt();}
        }while (tipusCorrecte == false);

        switch (opcio){
            case 1:
                taula1 = new int[valors[0]][valors[1]];
                for (int i = 0; i < taula1.length; i++) {
                    for (int j = 0; j < taula1[i].length; j++) {
                        taula1 [i][j] = (j+1);
                    }
                }
                // Imprimim
                for (int i = 0; i < taula1.length; i++) {
                    for (int j = 0; j < taula1[i].length; j++) {
                        System.out.print(taula1 [i] [j] + "\t");

                    }
                    System.out.println("");
                }
            case 2:
                int nums = 0;
                taula2 = new int[valors[0]][valors[1]];
                for (int i = 0; i < taula2.length; i++) {
                    for (int j = 0; j < taula2[i].length; j++) {
                        nums += 1;
                        taula2 [i][j] = (nums);
                    }
                }
                // Imprimim
                for (int i = 0; i < taula2.length; i++) {
                    for (int j = 0; j < taula2[i].length; j++) {
                        System.out.print(taula2[i][j] + "\t");
                    }
                    System.out.println("");
                }
            case 3:
                taula3 = new boolean[valors[0]][valors[1]];
                for (int i = 0; i < taula3.length; i++) {
                    for (int j = 0; j < taula3[i].length; j++) {
                        taula3 [i][j] = false;
                        }
                    taula3 [i][i] = true;
                }

                // Imprimim
                for (int i = 0; i < taula3.length; i++) {
                    for (int j = 0; j < taula3[i].length; j++) {
                        System.out.print(taula3[i][j] + "\t");
                    }
                    System.out.println("");
                }
            case 4:
                //if (valors[0] != valors[1])
                taula4 = new String[valors[0]][valors[1]];
                for (int i = 0; i < taula4[0].length; i++) {
                    for (int j = 0; j < taula4.length; j++) {
                        if ((i % 2) == 0){ // Per detectar pares
                            taula4 [j][i] = RED+"A"+RESET;
                        }else{
                            taula4 [j][i] = BLUE +"B"+ RESET;
                        }

                    }
                }
                // Imprimim
                for (int i = 0; i < taula4.length; i++) {
                    for (int j = 0; j < taula4[i].length; j++) {
                        System.out.print(taula4[i][j] + "\t");
                    }
                    System.out.println("");
                }

            case 5:
                int numsNegative = (valors[0]*valors[1]);
                taula5 = new int[valors[0]][valors[1]];
                for (int i = 0; i < taula5.length; i++) {
                    for (int j = 0; j < taula5[i].length; j++) {
                        numsNegative -= 1;
                        taula5 [i][j] = (numsNegative+1);
                    }
                }
                // Imprimim
                for (int i = 0; i < taula5.length; i++) {
                    for (int j = 0; j < taula5[i].length; j++) {
                        System.out.print(taula5[i][j] + "\t");
                    }
                    System.out.println("");
                }
            case 6:
                taula6= new boolean[valors[0]][valors[1]];
                for (int i = 0; i < taula6.length; i++) {
                    for (int j = 0; j < taula6[i].length; j++) {
                        if ((i % 2) == 0){
                            if ((j % 2) == 0){
                                taula6 [i][j] = true;
                            }else {
                                taula6 [i][j] = false;
                            }
                        }else {
                            if ((j % 2) == 0){
                                taula6 [i][j] = false;
                            }else {
                                taula6 [i][j] = true;
                            }
                        }

                    }

                }

                // Imprimim
                for (int i = 0; i < taula6.length; i++) {
                    for (int j = 0; j < taula6[i].length; j++) {
                        System.out.print(taula6[i][j] + "\t");
                    }
                    System.out.println("");
                }

        }


    }
}
