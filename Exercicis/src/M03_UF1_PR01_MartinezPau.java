import java.util.Scanner;

public class M03_UF1_PR01_MartinezPau {
    public static void main(String[] args) throws InterruptedException {

        Scanner llegir = new Scanner(System.in);

        // Colors
            // Foregrounds
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        final String BR_BLACK = "\u001B[90m";
        final String BR_RED = "\u001B[91m";
        final String BR_GREEN = "\u001B[92m";
        final String BR_YELLOW = "\u001B[93m";
        final String BR_BLUE = "\u001B[94m";
        final String BR_PURPLE = "\u001B[95m";
        final String BR_CYAN = "\u001B[96m";
        final String BR_WHITE = "\u001B[97m";

        final String[] FOREGROUNDS = {
                BLACK, RED, GREEN, YELLOW,
                BLUE, PURPLE, CYAN, WHITE,
                BR_BLACK, BR_RED, BR_GREEN, BR_YELLOW,
                BR_BLUE, BR_PURPLE, BR_CYAN, BR_WHITE
        }; // Hi ha 16 colors diferents

        final String BG_BLACK = "\u001B[40m";
        final String BG_RED = "\u001B[41m";
        final String BG_GREEN = "\u001B[42m";
        final String BG_YELLOW = "\u001B[43m";
        final String BG_BLUE = "\u001B[44m";
        final String BG_PURPLE = "\u001B[45m";
        final String BG_CYAN = "\u001B[46m";
        final String BG_WHITE = "\u001B[47m";
        final String BR_BG_BLACK = "\u001B[100m";
        final String BR_BG_RED = "\u001B[101m";
        final String BR_BG_GREEN = "\u001B[102m";
        final String BR_BG_YELLOW = "\u001B[103m";
        final String BR_BG_BLUE = "\u001B[104m";
        final String BR_BG_PURPLE = "\u001B[105m";
        final String BR_BG_CYAN = "\u001B[106m";
        final String BR_BG_WHITE = "\u001B[107m";

        final String[] BACKGROUNDS = {
                BG_BLACK, BG_RED, BG_GREEN, BG_YELLOW,
                BG_BLUE, BG_PURPLE, BG_CYAN, BG_WHITE,
                BR_BG_BLACK, BR_BG_RED, BR_BG_GREEN, BR_BG_YELLOW,
                BR_BG_BLUE, BR_BG_PURPLE, BR_BG_CYAN, BR_BG_WHITE};


        int puntuacioUsuari = 0;
        int puntuacioIA = 0;

        // Opció
        int opcio = 0;
        String opcioString; // Opció pero en String

        // Booleans
        boolean tipusCorrecte;
        boolean endProgram = false;
        boolean tornarAJugar = false;

        // El Codi comença
        do {

            // Menu principal // 1:v 2:X 3:R
            System.out.print("\r");
            System.out.print(
                            BR_BG_BLACK + "BENVINGUTS AL MENU:                        \t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "#===============" + BG_WHITE + " "+ BLUE + puntuacioUsuari + GREEN + " vs " + RED + puntuacioIA +" " + BR_BG_BLACK + GREEN + "===============#\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 1. Cara o creu (" + YELLOW + "Ara amb animacio!!" + RESET + BR_BG_BLACK + GREEN + ")  |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 2. Pedra, Paper i tisora (✊ ✋ ✌)   |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 3. Generador d'art                   |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 4. Generador de noms                 |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 5. Sortir de la aplicació            |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "#======================================#\t" + RESET + "\n");
            System.out.print("Selecciona una opció: ");

            do { // excloguem el menu perquè no es repeteixi cada vegada que fallem
                System.out.print("\r");
                tipusCorrecte = llegir.hasNextInt(); // For Int


                if (!tipusCorrecte) {
                    llegir.nextLine();
                    System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                    Thread.sleep(1000);
                    System.out.print("\r");
                } else {
                    opcio = llegir.nextInt();
                    if (opcio < 1 || opcio > 6) {
                        tipusCorrecte = false;

                        llegir.nextLine();
                        System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                        Thread.sleep(1000);
                        System.out.print("\r");
                    }
                }
            } while (!tipusCorrecte);

            switch (opcio) {

                // ===== JOC MONEDA ===== //
                case 1: {
                    // Variables per Joc Monedes
                    String[] moneda = {YELLOW + "Cara ☻" + RESET, YELLOW + "Creu ♱" + RESET}; // Per poder ilustrar el resultat
                    char[] animMoneda = {'⭗', '⭖', '⚊', '⭖'}; // Per fer l'animació de la moneda
                    char[] animVictoria = {'E', 'N', 'H', 'O', 'R', 'A', 'B', 'O', 'N', 'A'}; // Enhorabona!!
                    int indexMoneda = 0; // S'utilitzarà per saber si has guanyat i per al Math.random

                    do {
                        tornarAJugar = false; // Revertim a false per no acabar en un loop infinit

                        // SubMenu Cara-Creu
                        System.out.print("\r");
                        System.out.print("Benvingut al joc de la moneda: \n" +
                                "Introdueix \"" + RED + "Cara" + RESET + "\" per " + moneda[0] + "\n" +
                                "Introdueix \"" + RED + "Creu" + RESET + "\" per " + moneda[1] + "\n");

                        do { // Verificar si no es cara o creu
                            System.out.print("\r");
                            opcioString = llegir.next(); // For Int


                            if (opcioString.equals("Cara")) {
                                break;
                            } else if (opcioString.equals("Creu")) {
                                break;
                            } else {
                                tipusCorrecte = false;

                                System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                                System.out.print("\r");
                            }

                        } while (!tipusCorrecte);


                        for (int i = 0; i < 3; i++) { // Animacio Moneda
                            for (char c : animMoneda) {
                                System.out.print("Tirant moneda: "+ YELLOW + c + RESET);
                                Thread.sleep(200);
                                System.out.print("\r");
                            }
                        }

                        for (int i = 0; i < 1; i++) {// Si ho feia fora del "for" sempre aconsegueixo el mateix resultat
                            indexMoneda = (int) (Math.random() * 2);
                            System.out.println("Ha tocat: " + YELLOW + moneda[indexMoneda] + RESET);
                            Thread.sleep(1000);
                        }


                        if (opcioString.equals("Cara")) {// Si es cara...
                            if (indexMoneda == 0) { // Guanya
                                for (char c : animVictoria) { // Animacio de Victoria
                                    System.out.print(FOREGROUNDS[(int) (Math.random() * 16)] + c + RESET);
                                    Thread.sleep(200);
                                }
                                System.out.println("\tHas guanyat!!");

                            } else { // Perd
                                System.out.println("Has perdut..");
                            }

                        } else {// Si es creu
                            if (indexMoneda == 1) { // Guanya
                                for (char c : animVictoria) {
                                    System.out.print(FOREGROUNDS[(int) (Math.random() * 16)] + c + RESET);
                                    Thread.sleep(200);
                                }
                                System.out.println("\tHas guanyat!!");

                            } else { // Perd
                                System.out.println("Has perdut..");
                            }

                        }
                        Thread.sleep(1000);

                        // ===== Final del joc de la moneda =====


                        System.out.print("""
                                Que vols fer?:\s
                                =====================================
                                1. Tornar a jugar
                                2. Tornar el menu principal
                                3. Sortir del programa
                                =====================================
                                Selecciona una opció:\s""");
                        do {
                            System.out.print("\r");
                            tipusCorrecte = llegir.hasNext(); // For Int

                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BG_RED + "ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                            } else {
                                opcio = llegir.nextInt();
                                if (opcio < 1 || opcio > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BG_RED + "ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                }
                            }
                        } while (!tipusCorrecte);

                        switch (opcio) {
                            case 1:
                                tornarAJugar = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                endProgram = true;
                                break;
                        }

                    } while (tornarAJugar);
                    break;
                }
                // ===== ✊ ✋ ✌ ===== //
                case 2: {
                    // Variables
                    char[] animVictoria = {'E', 'N', 'H', 'O', 'R', 'A', 'B', 'O', 'N', 'A'}; // Enhorabona!!
                    int selectionIA; // Castejem la variable IA
                    int selectionUser = 0; // Castejem la variable per el jugador
                    char[] emojis = {'✊', '✋', '✌'};


                    do{

                        System.out.print("""
                            Benvingut al joc del pedra, paper o tisores\s
                            Es al millor de 3\s
                            """);
                        System.out.println(" ");


                        do {
                            tornarAJugar = false;

                            // SubMenu Pe-Pa-Ti
                            System.out.print("\r");
                            System.out.print("""
                                    SELECCIONA LA TEVA OPCIO:
                                     1 per Pedra  ✊
                                     2 per Paper   ✋\s
                                     3 per Tisores ✌ \t""");

                            tipusCorrecte = llegir.hasNextInt(); // For Int


                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                            } else {
                                selectionUser = llegir.nextInt();
                                if (selectionUser < 1 || selectionUser > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                }
                            }
                        } while (!tipusCorrecte);

                        selectionIA = (int) (Math.random() * 3);

                        String[] animPPT = {"Pedra !","Paper !!","Tisores !!!"};

                        for (String s : animPPT) {
                            System.out.print(s);
                            Thread.sleep(600);
                            System.out.print("\r");
                        }

                        System.out.println(emojis[(1 - selectionUser)] + " vs. " + emojis [(1 - selectionIA)]);

                        // 1 Pedra  2 Paper  3 Tisora   P vs M
                        if (selectionUser == selectionIA){
                            System.out.println("Ha sigut un empat");

                        } else if (selectionIA == selectionUser + 1 || (selectionIA == 1 && selectionUser == 3) ) { // Ex: Si User = 1 i IA = 2 El guanyador és el qui tingui el número adjacent més gran
                            // El User perd.
                            System.out.println("Has perdut...");

                        } else if (selectionUser == selectionIA + 1 || (selectionUser == 1 && selectionIA == 3) ) {
                            // El User guanya.
                            for (char c : animVictoria) {
                                System.out.print(FOREGROUNDS[(int) (Math.random() * 16)] + c + RESET);
                                Thread.sleep(200);
                            }

                            System.out.println("\t Has guanyat!!");
                        }


                        System.out.print("""
                                    Que vols fer?:\s
                                    =====================================
                                    1. Tornar a jugar
                                    2. Tornar el menu principal
                                    3. Sortir del programa
                                    =====================================
                                    Selecciona una opció:\s""");
                        do {
                            System.out.print("\r");
                            tipusCorrecte = llegir.hasNext(); // For Int

                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BG_RED + "ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                            } else {
                                opcio = llegir.nextInt();
                                if (opcio < 1 || opcio > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BG_RED + "ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                }
                            }
                        } while (!tipusCorrecte);

                        switch (opcio) {
                            case 1:
                                tornarAJugar = true;
                                break;
                            case 2:
                                break;
                            case 3:
                                endProgram = true;
                                break;
                        }

                    } while (tornarAJugar);

                    break;
                }
                // ===== DU-MB ===== //
                case 3: {
                    // DU-MB ve de DA-LLI la IA que pinta i DUMB, enginyós, he?

                        // Variables
                        int canvas = 0; // Pesa menys que un canvas
                        int esRepeteix = 0; // 0=No 1=Si //TODO Intenta posar boolean

                        int indexColor = 0; // Color del text
                        int indexColorBG = 0; // Color del background
                        int indexChar = 0;


                        // Comença
                    do{
                        System.out.print("\r");
                        System.out.print(" Benvingut a la galeria d'art de DU-MB: \n" +
                                        GREEN +"  ====Quin es el tamany de canvas que vols?====\n" + RESET +
                                        "  Introdueix "+ YELLOW + "\"2\""+ RESET + " per un canvas 10x10\n" +
                                        "  Introdueix "+ YELLOW + "\"2\""+ RESET + " per un canvas 20x20\n" +
                                        "  Introdueix "+ YELLOW + "\"3\""+ RESET + " per un canvas 40x40\n" +
                                        GREEN +"  =============================================\n" + RESET +
                                        "  Selecciona una opcio:\n");

                        do { //Excloguem el menu perquè no es repeteixi cada vegada que fallem
                            System.out.print("\r");
                            tipusCorrecte = llegir.hasNextInt(); // For Int


                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                                System.out.print("\r");
                            } else {
                                opcio = llegir.nextInt();
                                if (opcio < 1 || opcio > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                    System.out.print("\r");
                                }
                            }
                        } while (!tipusCorrecte);

                        switch (opcio) {
                            case 1 -> canvas = 10;
                            case 2 -> canvas = 20;
                            case 3 -> canvas = 40;

                        }

                        for (int i = 0; i < canvas; i++) {


                            for (int j = 0; j < canvas; j++) {

                                if (esRepeteix != 1) {
                                    indexColorBG = (int) (Math.random() * 16);
                                    indexColor = (int) (Math.random() * 16);

                                    indexChar = (int) (Math.random() * 224) + 32; // D'aquesta manera posem
                                    // max:255 min:32 range: max - min + 1 = 224
                                }

                                esRepeteix = (int) (Math.random() * 6) ;


                                System.out.print(FOREGROUNDS[indexColor] + BACKGROUNDS[indexColorBG]
                                        + " " + (char) (indexChar) + " " + RESET);

                            }
                            System.out.print("\n");

                        }
                        System.out.println();

                        System.out.print("""
                                Que vols fer?:\s
                                =====================================
                                1. Tornar a pintar
                                2. Tornar el menu principal
                                3. Sortir del programa
                                =====================================
                                Selecciona una opció:\s""");

                        do { // Verifiquem
                            System.out.print("\r");
                            tipusCorrecte = llegir.hasNext(); // For Int

                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                            } else {
                                opcio = llegir.nextInt();
                                if (opcio < 1 || opcio > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                }
                            }
                        } while (!tipusCorrecte);

                        switch (opcio) {
                            case 1:
                                tornarAJugar = true;
                                System.out.println(" ");
                                break;
                            case 2:
                                break;
                            case 3:
                                endProgram = true;
                                break;
                        }

                    } while (tornarAJugar);

                        break;
                    }

                // ===== El aogado ===== //
                case 4:

                    String paraules[][] = {{"Abraç", "Casa", "Esport", "Final", "Caure", "Contes", "Marit", "Pedra", "Vaca", "Llapis", "Teoria", "Mare", "Nebot", "Sang", "Infern", "Rodona", "Xiulet", "Llavor"}, // Hi ha les facils 4-6 lletres sense accents
                            {"Cambrera", "Empresari", "Jutgessa", "Perruqueria", "Quadrat", "Correu", "Internet", "Planejar", "Peixatera", "Folklore", "Costelles", "Acupuntura", "Lleialtat", "Superheroi", "Superheroi"}, // Hi ha les normals 16+ lletres amb accents
                            {"Monorefringència", "Drogodependència", "Espectroradiometria", "Microminiaturització", "Ferrihemoglobina", "Mineralitzadores", "Llatinoamericans", "Irreversiblement", "Invulnerabilitat"}}; // I les difícils...

                    int dificultat = 0;

                    


                        break;

                case 5:
                        endProgram = true;

                        break;


                }


            }while (!endProgram) ;
        }
    }