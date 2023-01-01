import java.sql.SQLOutput;
import java.util.Scanner;

public class M03_UF1_PR01_MartinezPau {
    public static void main(String[] args) throws InterruptedException {

        Scanner llegir = new Scanner(System.in);

        // Colors
        // Foregrounds
         final String RESET  = "\u001B[0m";
         final String BLACK  = "\u001B[30m";
         final String RED    = "\u001B[31m";
         final String GREEN  = "\u001B[32m";
         final String YELLOW = "\u001B[33m";
         final String BLUE   = "\u001B[34m";
         final String PURPLE = "\u001B[35m";
         final String CYAN   = "\u001B[36m";
         final String WHITE  = "\u001B[37m";
         final String BR_BLACK  = "\u001B[90m";
         final String BR_RED    = "\u001B[91m";
         final String BR_GREEN  = "\u001B[92m";
         final String BR_YELLOW = "\u001B[93m";
         final String BR_BLUE   = "\u001B[94m";
         final String BR_PURPLE = "\u001B[95m";
         final String BR_CYAN   = "\u001B[96m";
         final String BR_WHITE  = "\u001B[97m";
        final String[] FOREGROUNDS = {
                BLACK, RED, GREEN, YELLOW,
                BLUE, PURPLE, CYAN, WHITE,
                BR_BLACK, BR_RED, BR_GREEN, BR_YELLOW,
                BR_BLUE, BR_PURPLE, BR_CYAN, BR_WHITE
        }; // Hi ha 16 colors diferents

         final String BG_BLACK  = "\u001B[40m";
         final String BG_RED    = "\u001B[41m";
         final String BG_GREEN  = "\u001B[42m";
         final String BG_YELLOW = "\u001B[43m";
         final String BG_BLUE   = "\u001B[44m";
         final String BG_PURPLE = "\u001B[45m";
         final String BG_CYAN   = "\u001B[46m";
         final String BG_WHITE  = "\u001B[47m";
         final String BR_BG_BLACK  = "\u001B[100m";
         final String BR_BG_RED    = "\u001B[101m";
         final String BR_BG_GREEN  = "\u001B[102m";
         final String BR_BG_YELLOW = "\u001B[103m";
         final String BR_BG_BLUE   = "\u001B[104m";
         final String BR_BG_PURPLE = "\u001B[105m";
         final String BR_BG_CYAN   = "\u001B[106m";
         final String BR_BG_WHITE  = "\u001B[107m";

        final String[] BACKGROUNDS = {
                BG_BLACK, BG_RED, BG_GREEN, BG_YELLOW,
                BG_BLUE, BG_PURPLE, BG_CYAN, BG_WHITE,
                BR_BG_BLACK, BR_BG_RED, BR_BG_GREEN, BR_BG_YELLOW,
                BR_BG_BLUE, BR_BG_PURPLE, BR_BG_CYAN, BR_BG_WHITE};

        // Arrays

        String[] nom;
        String[] cognom;

        // Opcion
        int opcio = 0;
        String opcioString = ""; // Opcio pero en String

        // Boolenas
        boolean tipusCorrecte;
        boolean endProgram = false;
        boolean toranarAJugar = false;

        // El Codi comença
        do {

                // Menu principal // 1:v 2:X 3:R
                System.out.print("\r");
                System.out.print(
                        BR_BG_BLACK+"BENVINGUTS AL MENU:                        \t" + RESET+ "\n"+

                        BR_BG_BLACK+GREEN+"#======================================#\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"| 1. Cara o creu ("+YELLOW+ "Ara amb animacio!!"+RESET+BR_BG_BLACK+GREEN+")  |\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"| 2. Pedra, Paper i tisora (✊ ✋ ✌) |\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"| 3. Generador d'art                   |\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"| 4. Generador de noms                 |\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"| 5. (EXTRA) TerminalQuest             |\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"| 6. Sortir de la aplicació            |\t" + RESET+ "\n"+
                        BR_BG_BLACK+GREEN+"#======================================#\t" + RESET+ "\n");

                System.out.print("Seleciona una opció: ");

            do { // Excluim el menu perque no es repetexi cada vegada que fallem
                System.out.print("\r");
                tipusCorrecte = llegir.hasNextInt(); // For Int


                if (tipusCorrecte == false) {
                    llegir.nextLine();
                    System.out.print("ERROR: Input Incorrecta");
                    Thread.sleep(1000);
                    System.out.print("\r");
                } else {
                    opcio = llegir.nextInt();
                    if (opcio < 1 || opcio > 6) {
                        tipusCorrecte = false;

                        llegir.nextLine();
                        System.out.print("ERROR: Input Incorrecta");
                        Thread.sleep(1000);
                        System.out.print("\r");
                    }
                }
            } while (tipusCorrecte == false);

            switch (opcio) {

                // ===== JOC MONEDA ===== //
                case 1:{
                    // Variables per Joc Monedes
                    String [] moneda = {YELLOW+"Cara ☻"+RESET, YELLOW+"Creu ♱"+RESET}; // Per poder Ilustrar el resultat
                    char[] animMoneda = {'⭗', '⭖', '⚊', '⭖'}; // Per fer la animacio de la moneda
                    char[] animVictoria = {'E','N','H','O','R','A','B','O','N','A'}; // Enhorabona!!
                    int indexMoneda = 0; // Se utilitzara per saber si has guanyat i per el Math.random

                    do {
                        toranarAJugar = false; // Revertim a false per no acabar en un loop infinit

                        // SubMenu Cara-Creu
                        System.out.print("\r");
                        System.out.print("Benvingut al joc de la moneda: \n" +
                                "Introdueix \""+RED+"Cara"+RESET+"\" per " + moneda[0] + "\n" +
                                "Introdueix \""+RED+"Creu"+RESET+"\" per " + moneda[1] + "\n");

                        do { // Verificar si no es cara o creu
                            System.out.print("\r");
                            opcioString = llegir.next(); // For Int


                            if (opcioString.equals("Cara")) {
                                break;
                            } else if (opcioString.equals("Creu")) {
                                break;
                            } else {
                                tipusCorrecte = false;

                                System.out.print("ERROR: Input Incorrecta");
                                Thread.sleep(1000);
                                System.out.print("\r");
                            }

                        } while (tipusCorrecte == false);


                        for (int i = 0; i < 3; i++) { // Animacio Moneda
                            for (int j = 0; j < animMoneda.length; j++) {
                                System.out.print("Tiran moneda: " + animMoneda[j] + " ");
                                Thread.sleep(200);
                                System.out.print("\r");
                            }
                        }

                        for (int i = 0; i < 1; i++) {// Si ho faix fora del for sempre aconsegeixo el mateix resultat
                            indexMoneda = (int) (Math.random() * 2);
                            System.out.println("Ha tocat: " + moneda[indexMoneda]);
                            Thread.sleep(1000);
                        }



                        if (opcioString.equals("Cara")) {// Si es cara...
                            if (indexMoneda == 0) { // Guaña
                                for (int i = 0; i < animVictoria.length; i++) { // Animacio de Victoria
                                    System.out.print(FOREGROUNDS[(int)(Math.random()*16)]+animVictoria[i]+RESET);
                                    Thread.sleep(200);
                                }
                                System.out.println("");
                                System.out.println("Has guanyat!!");

                            } else { // Perd
                                System.out.println("Has perdut..");
                            }

                        } else if (opcioString.equals("Creu")) {// Si es creu
                            if (indexMoneda == 1) { // Guaña
                                for (int i = 0; i < animVictoria.length; i++) {
                                    System.out.print(FOREGROUNDS[(int)(Math.random()*16)]+animVictoria[i]+RESET);
                                    Thread.sleep(200);
                                }
                                System.out.println(RESET);
                                System.out.println("Has guanyat!!");

                            } else { // Perd
                                System.out.println("Has perdut..");
                            }

                        }
                        Thread.sleep(1000);

                        // Final del joc de la moneda

                        System.out.print("Que vols fer?: \n" +
                                "=====================================\n" +
                                "1. Tornar a jugar\n" +
                                "2. Tornar el menu principal\n" +
                                "3. Sortir del programa\n" +
                                "=====================================\n" +
                                "Seleciona una opció: ");
                        do {
                            System.out.print("\r");
                            tipusCorrecte = llegir.hasNext(); // For Int

                            if (tipusCorrecte == false) {
                                llegir.nextLine();
                                System.out.print("ERROR: Input Incorrecta");
                                Thread.sleep(1000);
                            } else {
                                opcio = llegir.nextInt();
                                if (opcio < 1 || opcio > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print("ERROR: Input Incorrecta");
                                    Thread.sleep(1000);
                                }
                            }
                        } while (tipusCorrecte == false);

                        switch (opcio){
                            case 1:
                                toranarAJugar = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                endProgram = true;
                                break;
                        }

                    }while (toranarAJugar == true);
                    break;
                }
                case 2:
                    // Variables
                    int selecioIA = 0; // Castejem la variable IA
                    int selecioUser = 0; // Castejem la varaible per el jugador
                    char [] emojis = {'✊','✋','✌'};

                    System.out.print("Benvingut al joc del predre, paper o tisores \n"
                            + "Es al millor de 3 \n" );

                    System.out.println("");


                    do {
                        // SubMenu Pe-Pa-Ti
                        System.out.print("\r");
                        System.out.print("SELECIONA:\n" +
                                " 1 per Predra✊\n"+
                                " 2 per Paper✋ \n"+
                                " 3 per Tisores✌");

                        tipusCorrecte = llegir.hasNextInt(); // For Int


                        if (tipusCorrecte == false) {
                            llegir.nextLine();
                            System.out.print("ERROR: Input Incorrecta");
                            Thread.sleep(1000);
                        } else {
                            selecioUser = llegir.nextInt();
                            if (selecioUser < 1 || selecioUser > 3) {
                                tipusCorrecte = false;

                                llegir.nextLine();
                                System.out.print("ERROR: Input Incorrecta");
                                Thread.sleep(1000);
                            }
                        }
                    } while (tipusCorrecte == false);

                    selecioIA = (int) (Math.random()*3);

                    

                    break;
                case 3: {
                    // ===Generador de Art===

                    // Variables

                    char [] textures = {'▓','▒','░',' '};

                    int canvas; // Pessa menys que un canvas
                    int esRepeteix; // 0=No 1=Si //TODO Intenta possar boolean
                    int indexColor; // Color del text
                    int indexColorBG; // Color del backgraund

                    // Comença
                    System.out.print("\r");
                    System.out.print(   "Benvingut a la galeria d'art de Mr.Mathrando:" +
                                        "====Quin es el tamany de canvas que vols?==== \n" +
                                        "Introdueix \"Petit\" per un canvas 5x5        \n" +
                                        "Introdueix \"Mitja\" per un canvas 10x10      \n" +
                                        "Introdueix \"Gran\" per un canvas 20x20       \n" +
                                        "============================================= \n" +
                                        "Seleciona una opcio: ");

                    do { // Verificar qui tamany es
                        System.out.print("\r");
                        opcioString = llegir.next(); // For Int


                        if (opcioString.equals("Petit")) {
                            canvas = new char[5][5];
                            break;
                        } else if (opcioString.equals("Mitja")) {
                            canvas = new char[10][10];
                            break;
                        }  else if (opcioString.equals("Gran")) {
                            canvas = new char[20][20];
                            break;

                        }else {
                            tipusCorrecte = false;

                            System.out.print("ERROR: Input Incorrecta");
                            Thread.sleep(1000);
                            System.out.print("\r");
                        }

                    } while (tipusCorrecte == false);

                    indexColorBG = (int) (Math.random()*16);
                    indexColor = (int) (Math.random()*16);


                    for (int i = 0; i < canvas.length; i++) {
                        esRepeteix = (int) (Math.random()*3);

                        if (esRepeteix != 1){
                            indexColorBG = (int) (Math.random()*16);
                            indexColor = (int) (Math.random()*16);
                        }


                        for (int j = 0; j < canvas[i].length; j++) {
                            System.out.print(FOREGROUNDS[indexColor]+BACKGROUNDS[indexColorBG]+textures[]);

                        }

                    }

                }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    endProgram = true;

                    break;
            }
        } while (endProgram != true);
    }
}
