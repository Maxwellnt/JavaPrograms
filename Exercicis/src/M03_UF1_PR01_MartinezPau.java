import java.util.Arrays;
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


        int puntuaccioUsuari = 0;
        int puntuaccioIA = 0;

        // Opci??
        int opcio = 0;
        String opcioString; // Opci?? pero en String

        // Booleans
        boolean tipusCorrecte;
        boolean endProgram = false;
        boolean tornarAJugar = false;

        // El Codi comen??a
        do {

            // Menu principal // 1:v 2:X 3:R
            System.out.print("\r");
            System.out.print(
                            BR_BG_BLACK + "BENVINGUTS AL MENU:                        \t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "#===============" + BG_WHITE + " "+ BLUE + puntuaccioUsuari + GREEN + " vs " + RED + puntuaccioIA +" " + BR_BG_BLACK + GREEN + "===============#\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 1. Cara o creu (" + YELLOW + "Ara amb animacio!!" + RESET + BR_BG_BLACK + GREEN + ")  |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 2. Pedra, Paper i tisora (??? ??? ???)   |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 3. Generador d'art                   |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 4. El penjat                         |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "| 5. Sortir de la aplicaci??            |\t" + RESET + "\n" +
                            BR_BG_BLACK + GREEN + "#======================================#\t" + RESET + "\n");
            System.out.print("Selecciona una opci??: ");

            do { // excloguem el menu perqu?? no es repeteixi cada vegada que fallem
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
                    String[] moneda = {YELLOW + "Cara ???" + RESET, YELLOW + "Creu ???" + RESET}; // Per poder ilustrar el resultat
                    char[] animMoneda = {'???', '???', '???', '???'}; // Per fer l'animaci?? de la moneda
                    char[] animVictoria = {'E', 'N', 'H', 'O', 'R', 'A', 'B', 'O', 'N', 'A'}; // Enhorabona!!
                    int indexMoneda = 0; // S'utilitzar?? per saber si has guanyat i per al Math.random

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
                                puntuaccioUsuari +=1;

                            } else { // Perd
                                System.out.println("Has perdut..");
                                puntuaccioIA +=1;
                            }

                        } else {// Si es creu
                            if (indexMoneda == 1) { // Guanya
                                for (char c : animVictoria) {
                                    System.out.print(FOREGROUNDS[(int) (Math.random() * 16)] + c + RESET);
                                    Thread.sleep(200);
                                }
                                System.out.println("\tHas guanyat!!");
                                puntuaccioUsuari +=1;
                            } else { // Perd
                                System.out.println("Has perdut..");
                                puntuaccioIA +=1;
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
                                Selecciona una opci??:\s""");
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

                // ===== ??? ??? ??? ===== //
                case 2: {
                    // Variables
                    char[] animVictoria = {'E', 'N', 'H', 'O', 'R', 'A', 'B', 'O', 'N', 'A'}; // Enhorabona!!
                    int selectionIA = 0; // Castejem la variable IA
                    int selectionUser = 0; // Castejem la variable per el jugador
                    char[] emojis = {' ','???', '???', '???'};


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
                                     1 per Pedra  ???
                                     2 per Paper   ???\s
                                     3 per Tisores ??? \t""");

                            tipusCorrecte = llegir.hasNextInt(); // For Int


                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                            } else {
                                selectionUser = llegir.nextInt();
                                System.out.println(selectionUser);
                                if (selectionUser < 0 || selectionUser > 2) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BR_RED +"ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                }
                            }
                        } while (!tipusCorrecte);

                        for (int i = 0; i < 3; i++) {
                            selectionIA = (int) (Math.random() * 3);
                            if (selectionIA == 0){
                                selectionIA = 1;
                            }
                        }

                        String[] animPPT = {"Pedra !","Paper !!","Tisores !!!"};

                        for (String s : animPPT) {
                            System.out.print(s);
                            Thread.sleep(600);
                            System.out.print("\r");
                        }

                        System.out.println(emojis[(selectionUser)] + " vs. " + emojis [(selectionIA)]);

                        // 1 Pedra  2 Paper  3 Tisora   P vs M
                        if (selectionUser == selectionIA){
                            System.out.println("Ha sigut un empat");

                        } else if (selectionIA == selectionUser + 1 || (selectionIA == 1 && selectionUser == 3) ) { // Ex: Si User = 1 i IA = 2 El guanyador ??s el qui tingui el n??mero adjacent m??s gran
                            // El User perd.
                            System.out.println("Has perdut...");
                            puntuaccioIA +=1;

                        } else if (selectionUser == selectionIA + 1 || (selectionUser == 1 && selectionIA == 3) ) {
                            // El User guanya.
                            for (char c : animVictoria) {
                                System.out.print(FOREGROUNDS[(int) (Math.random() * 16)] + c + RESET);
                                Thread.sleep(200);
                            }

                            System.out.println("\t Has guanyat!!");
                            puntuaccioUsuari +=1;
                        }


                        System.out.print("""
                                    Que vols fer?:\s
                                    =====================================
                                    1. Tornar a jugar
                                    2. Tornar el menu principal
                                    3. Sortir del programa
                                    =====================================
                                    Selecciona una opci??:\s""");
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
                    // DU-MB ve de DA-LLI la IA que pinta i DUMB, enginy??s, he?

                        // Variables
                        int canvas = 0; // Pesa menys que un canvas
                        int esRepeteix = 0; // 0=No 1=Si //TODO Intenta posar boolean

                        int indexColor = 0; // Color del text
                        int indexColorBG = 0; // Color del background
                        int indexChar = 0;


                        // Comen??a
                    do{
                        System.out.print("\r");
                        System.out.print(" Benvingut a la galeria d'art de DU-MB: \n" +
                                        GREEN +"  ====Quin es el tamany de canvas que vols?====\n" + RESET +
                                        "  Introdueix "+ YELLOW + "\"2\""+ RESET + " per un canvas 10x10\n" +
                                        "  Introdueix "+ YELLOW + "\"2\""+ RESET + " per un canvas 20x20\n" +
                                        "  Introdueix "+ YELLOW + "\"3\""+ RESET + " per un canvas 40x40\n" +
                                        GREEN +"  =============================================\n" + RESET +
                                        "  Selecciona una opcio:\n");

                        do { //Excloguem el menu perqu?? no es repeteixi cada vegada que fallem
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
                                Selecciona una opci??:\s""");

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
                case 4: {

                    String[][] paraules = {{"Abra??", "Casa", "Esport", "Final", "Caure", "Contes", "Marit", "Pedra", "Vaca", "Llapis", "Teoria", "Mare", "Nebot", "Sang", "Infern", "Rodona", "Xiulet", "Llavor"}, // Hi ha les facils 4-6 lletres sense accents
                            {"Cambrera", "Empresari", "Jutgessa", "Perruqueria", "Quadrat", "Correu", "Internet", "Planejar", "Peixatera", "Folklore", "Costelles", "Acupuntura", "Lleialtat", "Superheroi", "Superheroi"}, // Hi ha les normals 16+ lletres amb accents
                            {"Monorefring??ncia", "Drogodepend??ncia", "Espectroradiometria", "Microminiaturitzaci??", "Ferrihemoglobina", "Mineralitzadores", "Llatinoamericans", "Irreversiblement", "Invulnerabilitat"}}; // I les dif??cils...

                    char[] tureWord; // Un array per la paraula completa
                    char[] printWord;  // Un array que el usuari que omplir
                    char selectWords = 'S';

                    
                    int dificultat = 0; // S'utilitza per escollir la filla de la matriu paraules
                    int choseWord = 0; // Actua com index per escollir una paraula
                    int vidas = 6; // Las vidas que te el usuari
                    boolean conteLletra = false;

                    do {
                        tornarAJugar = false;
                        System.out.print("\r");

                        System.out.print(" Benvingut al Penjat: \n" +
                                GREEN + "  ====   En quina dificultat vols jugar?   ====\n" + RESET +
                                "  Introdueix " + YELLOW + "\"1\"" + RESET + " per mode facil\n" +
                                "  Introdueix " + YELLOW + "\"2\"" + RESET + " per mode normal\n" +
                                "  Introdueix " + YELLOW + "\"3\"" + RESET + " per mode ??????\n" +
                                GREEN + "  =============================================\n" + RESET +
                                "  Selecciona una opcio:\n");

                        do { //Excloguem el menu perqu?? no es repeteixi cada vegada que fallem
                            System.out.print("\r");
                            tipusCorrecte = llegir.hasNextInt(); // For Int


                            if (!tipusCorrecte) {
                                llegir.nextLine();
                                System.out.print(BR_RED + "ERROR: Input Incorrecta" + RESET);
                                Thread.sleep(1000);
                                System.out.print("\r");
                            } else {
                                opcio = llegir.nextInt();
                                if (opcio < 1 || opcio > 3) {
                                    tipusCorrecte = false;

                                    llegir.nextLine();
                                    System.out.print(BR_RED + "ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                    System.out.print("\r");
                                }
                            }
                        } while (!tipusCorrecte);

                        switch (opcio) {
                            case 1 -> dificultat = 0;
                            case 2 -> dificultat = 1;
                            case 3 -> dificultat = 2;
                        }

                        choseWord = (int) (Math.random() * paraules[dificultat].length);
                        tureWord = paraules[dificultat][choseWord].toUpperCase().toCharArray();
                        printWord = new char[tureWord.length];

                        for (int i = 0; i < printWord.length; i++) {
                            if (tureWord[0] == tureWord[i]) { // Per donar una ajuda l'usuari passarem sempre la primera lletra
                                printWord[i] = tureWord[i];
                            } else {
                                printWord[i] = '_';
                            }
                        }

                        do {
                            System.out.println(printWord);

                            System.out.print("Vides restants: " + vidas + "\t");
                            System.out.print("Selecciona una lletra: ");

                            do { // excloguem el menu perqu?? no es repeteixi cada vegada que fallem
                                tipusCorrecte = llegir.hasNext(); // Es per Sting ja que no hi ha una function per char

                                if (!tipusCorrecte) {
                                    llegir.nextLine();
                                    System.out.print(BR_RED + "ERROR: Input Incorrecta" + RESET);
                                    Thread.sleep(1000);
                                    System.out.print("\r");
                                } else {
                                    selectWords = llegir.next().toUpperCase().charAt(0);
                                }
                            } while (!tipusCorrecte);

                            System.out.println("Has seleccionat: " + selectWords);


                            // Ja he seleccionat la lletra

                            for (int i = 0; i < printWord.length; i++) { // Verifiquem la lletra
                                if(tureWord[i] == selectWords){
                                    conteLletra = true;
                                    break;
                                }else {
                                    conteLletra = false;
                                }
                            }

                            if (conteLletra){
                                // Ey tens lletra, estic molt cansat
                                System.out.println("Correcta!");
                                for (int i = 0; i < printWord.length; i++) {
                                    if(tureWord[i] == selectWords){
                                        printWord[i] = selectWords;
                                    }
                                }
                            }else {
                                System.out.println("Incorrecta");
                                vidas -= 1;
                            }

                            if(Arrays.equals(tureWord, printWord)){
                                // Has guanyat!!
                                System.out.println("Has guanyar!!!");
                                puntuaccioUsuari += opcio;
                                break;
                            }

                        } while (vidas != 0);

                        if (vidas == 0){
                            puntuaccioIA += 1;
                        }


                    System.out.println();

                    System.out.print("""
                                Que vols fer?:\s
                                =====================================
                                1. Tornar a jugar
                                2. Tornar el menu principal
                                3. Sortir del programa
                                =====================================
                                Selecciona una opci??:\s""");

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

                // ===== El programa finalitza
                case 5:
                        endProgram = true;

                        break;
                }


            }while (!endProgram) ;
        }
    }