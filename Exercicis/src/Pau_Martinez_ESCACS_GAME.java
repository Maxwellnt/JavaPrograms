import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Pau_Martinez_ESCACS_GAME {
    public static void main(String[] args) {

        final String BLACK = "\u001B[90m ";
        final String WHITE_TEXT = "\u001B[97m";
        final String RED = "\033[41m ";
        final String WHITE = "\u001B[47m ";
        final String RESET = "\u001B[0m";
        final String BLACK_TEXT  = "\u001B[30m";


        Scanner llegir = new Scanner(System.in);
        String [][] escacs = new String[9][9];
        String [] cordenadaX = {"A", "B", "C", "D", "E","F","G", "H"," "};
        String [] cordenadaY = {"1","2","3","4","5","6","7","8"," "};
        String [] pesesNegres = {"♜","♞","♝","♛","♚","♟"," "};
        String selecio;

        boolean verifCoords = false;
        boolean verifTropa = false;

        int coordXForPlayer = 0;
        int coordYForPlayer = 0;
        int opcio = 0;
        int intro;

        System.out.println("\n" +
                "████████╗░█████╗░██╗░░░██╗██╗░░░░░███████╗██╗░░░░░██╗░░░░░\n" +
                "╚══██╔══╝██╔══██╗██║░░░██║██║░░░░░██╔════╝██║░░░░░██║░░░░░\n" +
                "░░░██║░░░███████║██║░░░██║██║░░░░░█████╗░░██║░░░░░██║░░░░░\n" +
                "░░░██║░░░██╔══██║██║░░░██║██║░░░░░██╔══╝░░██║░░░░░██║░░░░░\n" +
                "░░░██║░░░██║░░██║╚██████╔╝███████╗███████╗███████╗███████╗\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░╚══════╝╚══════╝╚══════╝╚══════╝\n" +
                "\n" +
                "██████╗░██╗███████╗░██████╗░█████╗░░█████╗░░█████╗░░██████╗\n" +
                "██╔══██╗╚█║██╔════╝██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                "██║░░██║░╚╝█████╗░░╚█████╗░██║░░╚═╝███████║██║░░╚═╝╚█████╗░\n" +
                "██║░░██║░░░██╔══╝░░░╚═══██╗██║░░██╗██╔══██║██║░░██╗░╚═══██╗\n" +
                "██████╔╝░░░███████╗██████╔╝╚█████╔╝██║░░██║╚█████╔╝██████╔╝\n" +
                "╚═════╝░░░░╚══════╝╚═════╝░░╚════╝░╚═╝░░╚═╝░╚════╝░╚═════╝░");


        for (int i = 0; i < escacs.length; i++) {
            for (int j = 0; j < escacs.length; j++) {
                    if (i == 1){
                        escacs [i][j] = BLACK_TEXT+ "♟︎";

                    } else if (i == 6) {
                        escacs [i][j] = WHITE_TEXT+ "♙" ;
                    }else {
                        escacs [i][j] = " ";
                    }
                escacs[8][j] = cordenadaX[j];
                escacs[i][8] = cordenadaY[i];
            }
            }

        escacs [0][0] = BLACK_TEXT + "♜" ;
        escacs [0][1] = BLACK_TEXT + "♞" ;
        escacs [0][2] = BLACK_TEXT + "♝" ;
        escacs [0][3] = BLACK_TEXT + "♛" ;
        escacs [0][4] = BLACK_TEXT + "♚" ;
        escacs [0][5] = BLACK_TEXT + "♝" ;
        escacs [0][6] = BLACK_TEXT + "♞" ;
        escacs [0][7] = BLACK_TEXT + "♜" ;

        escacs [7][0] = WHITE_TEXT+ "♖" ;
        escacs [7][1] = WHITE_TEXT+ "♘" ;
        escacs [7][2] = WHITE_TEXT+ "♗" ;
        escacs [7][3] = WHITE_TEXT+ "♕" ;
        escacs [7][4] = WHITE_TEXT+ "♔" ;
        escacs [7][5] = WHITE_TEXT+ "♗" ;
        escacs [7][6] = WHITE_TEXT+ "♘" ;
        escacs [7][7] = WHITE_TEXT+ "♖" ;



            boolean tipusCorrecte;
            do {
                System.out.println("SELECCIONA MODE:\n" +
                        "1. 1 JUGADOR\n" +
                        "2. 2 JUGADORS");
                tipusCorrecte = llegir.hasNextInt(); // For Int

                if (tipusCorrecte == false){
                    llegir.nextLine();
                    System.out.println("ERROR: Input Incorrecta");
                }else{
                    opcio = llegir.nextInt();}
            }while (tipusCorrecte == false);

            switch (opcio){
                case 1:
                    System.out.println("La AI es molt experimental i segurament moura peces injustament");
                    int torn = 0;

                    for (int i = 0; i < 100; i++) { // Aixi prevenim infinte loop


                        // Imprimim Background
                        for (int c = 0; c < escacs.length; c++) {
                            if (c == 8){
                                for (int j = 0; j < escacs[c].length; j++) {
                                    System.out.printf(RED+escacs[c][j]+ "\t" + RESET);
                                }

                            } else if ((c % 2) == 0) {
                                for (int j = 0; j < escacs[c].length ; j++) {
                                    if (8 == j){
                                        System.out.printf(RED+escacs[c][j]+ "\t" + RESET);
                                        break;
                                    }else if ((j % 2) == 0){
                                        System.out.printf(BLACK+escacs[c][j]+ "\t" + RESET);
                                    }else if ((j % 2) != 0){
                                        System.out.printf(WHITE+escacs[c][j]+ "\t" + RESET);
                                    }
                                }

                            } else {
                                for (int j = 0; j < escacs[c].length ; j++) {
                                    if (8 == j){
                                        System.out.printf(RED+escacs[c][j]+ "\t" + RESET);
                                        break;
                                    }else if ((j % 2) == 0){
                                        System.out.printf(WHITE+escacs[c][j]+ "\t" + RESET);
                                    }else {
                                        System.out.printf(BLACK+escacs[c][j]+ "\t" + RESET);
                                    }
                                }
                            }

                            System.out.println("");
                        }


                        System.out.println("Torn " + i + ": et toca");

                        do { // Es el "do" de verificar les tropes
                            do { // Es el "do" de verificar les cordenades
                                // Introduim les cordenades
                                System.out.println("Introdueix quina pessa vols selecionar (EX: A1)");

                                selecio = llegir.next();

                                //Verifiquem que siguin cordenades

                                for (int j = 0; j < cordenadaX.length; j++) {
                                    for (int k = 0; k < cordenadaY.length; k++) {
                                        if (selecio.equals(cordenadaX[k] + cordenadaY[j])) {
                                            verifCoords = true;
                                            coordXForPlayer = j;
                                            coordYForPlayer = k;
                                            System.out.println("!");
                                        }
                                    }
                                }
                            }while (verifCoords == false);

                        // Ara verifiquem que la tropa selecionada sigu nostra


                        for (int j = 0; j < pesesNegres.length ; j++) {
                            if (escacs[coordXForPlayer][coordYForPlayer].equals(BLACK_TEXT + pesesNegres[j])) {
                                verifTropa = false;
                                break;
                            }else {
                                verifTropa = true;
                            }
                        }

                        if (verifTropa == false){
                            System.out.println("Aquesta tropa no es teva");
                        }else {
                            System.out.println("Has selecionat: " + escacs[coordXForPlayer][coordYForPlayer] + RESET);
                        }
                        }while (verifTropa == false);


                        // Acebem de verificar la possicio de la nostra pessa

                        // Per saber si el mobivent es legal o no podriem pintar el backgrund de color verd

                        switch (escacs[coordXForPlayer][coordYForPlayer]){

                            case WHITE_TEXT+ "♖": // Movients legals de torre
                                                    // - Es mou en una lina recta horizontal i vertical
                                                    // - No salta

                                for (int j = 0; j < cordenadaX.length; j++) {
                                }


                        }

                    }// Acaba la partida







            }
    }
}
