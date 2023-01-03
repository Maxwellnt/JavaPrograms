import java.util.Scanner;

public class MartinezPau_Exercici2 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int [] butlletesUsuari;
        int [] butlletesGuanyadores = new int[10];

        int numButlletes = 0;
        int butlletesPremis = 0; // per saber quantes butlletes a guayat l'usuari

        float quantiatPremi = 0.00f; // per saber quan a guanyat l'usuari

        boolean tipusCorrecte;
        do {
            System.out.println("Quants butlletes vols comprar ( solsament pots comprar entre 1 i 3 butlletes)");
            tipusCorrecte = llegir.hasNextInt(); // For Int

            if (!tipusCorrecte){
                llegir.nextLine();
                System.out.println("ERROR: Input Incorrecta");
            }else{
                numButlletes = llegir.nextInt();

                if (numButlletes < 1 || numButlletes > 3){
                    System.out.println("Solsament pots comprar entre 1 i 3 butlletes!!!");
                    tipusCorrecte = false;
                }
            }
        }while (!tipusCorrecte);

        butlletesUsuari= new int[numButlletes];

        // Introduim el nom de les butlletes
        for (int i = 0; i < butlletesUsuari.length; i++) {
            do {
                System.out.println("Introdueix els numeros del " + (i+1) + "º butlleti");
                tipusCorrecte = llegir.hasNextInt(); // For Int

                if (!tipusCorrecte){
                    llegir.nextLine();
                    System.out.println("ERROR: Input Incorrecta");
                }else{
                    butlletesUsuari[i] = llegir.nextInt();

                    if (butlletesUsuari[i] < 00000 || butlletesUsuari[i] > 99999){
                        System.out.println("Te de ser un nombre de 5 xifres!!");
                        tipusCorrecte = false;
                    }
                }
            }while (!tipusCorrecte);
        }
        System.out.print("Les butlletes guanyadores son: ");
        for (int i = 0; i <butlletesGuanyadores.length; i++) {
            butlletesGuanyadores [i] = (int)(Math.random()*99999);
            System.out.printf(butlletesGuanyadores[i] + " ");
        }
        System.out.println();
        System.out.println("Verifican butlletes...");

        for (int i = 0; i < butlletesUsuari.length; i++) {
            for (int j = 0; j < butlletesGuanyadores.length; j++) {
                if (butlletesUsuari [i] == butlletesGuanyadores [j]){
                    butlletesPremis = butlletesPremis+1;
                }
            }
        }

        quantiatPremi = (-10 * numButlletes) + (200000 * butlletesPremis);
        if (quantiatPremi < 0){
            System.out.printf("Te an tocat "+numButlletes+" butlletes hi has perdut : %.2f€", quantiatPremi );
        }else{
            System.out.printf("Te an tocat "+numButlletes+" butlletes hi has guanyat: %.2f€", quantiatPremi );
        }


    }
}
