import java.util.Scanner;

public class Pau_Martinez_Strings_II {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int opcio;

        System.out.print("Que vols fer?: \n" +
                "===== No hi ha control de valors =====\n" +
                "1.Ex1. \n" +
                "2.Ex2. \n" +
                "3.Ex3. \n" +
                "4.Ex4. \n" +
                "5.Ex5. \n" +
                "======================================\n" +
                "Seleciona una opció: ");
        opcio = llegir.nextInt();

        switch (opcio){
            case 1:
                //1. Escriu un programa per calcular la longitud d'una cadena i que ho mostri per pantalla.
            {
                String frase;
                int numFrase = 0;

                System.out.println("BENBINGUT, introdueix una frase que contare quants caracters hi ha:");
                frase = llegir.next();

                numFrase = frase.length();

                System.out.println("Hi ha " + numFrase + " caracters en el frase!");
            }
                break;
            case 2:
                //2. Escriu un programa per comptar el nombre de caràcters (freqüència de caràcters) en una cadena.



                break;
            case 3: {
                //3. Escriu un programa per obtenir una cadena formada pels primers 2 i els
                //darrers 2 caràcters d'una cadena donada. Si la longitud de la cadena és inferior a 2, torneu una cadena buida.
                String paraula;

                System.out.println("BENBINGUT, introdueix una paraula de 2 o mes lletres ver les seves 2 primias i ultimes lletres:");
                paraula = llegir.next();

                if (paraula.length() <=1){
                    System.out.println("Solament te 1 lletra :C");
                }else {
                    System.out.print(paraula.charAt(0)+""+paraula.charAt(1));
                    System.out.print(paraula.charAt(paraula.length()-2)+""+paraula.charAt(paraula.length()-1));
                }


            }
                break;
            case 4: {
                //4.Escriviu un programa per afegir 'ing' al final d'una cadena determinada (la
                //longitud ha de ser com a mínim 3). Si la cadena donada ja acaba amb 'ing', afegiu 'ly' al seu lloc. Si la longitud de la cadena donada és inferior a 3, deixeu-la sense canvis
                String paraula;
                boolean viveCheck = true;

                do {
                    System.out.println("BENBINGUT, introdueix una paraula de 3 o mes paraules ver convertilo en verb:");
                    paraula = llegir.next();

                    if (paraula.length() < 3){
                        System.out.println("Nessesitas una paraula de 3 o mes paraules!!!");
                        viveCheck = false;
                    }else {
                        viveCheck = true;
                    }
                }while (viveCheck == false);

                if (paraula.endsWith("ing")){
                    paraula = paraula+"ly";
                }else {
                    paraula = paraula+"ing";
                }
                System.out.println("El teu verb es... "+ paraula);
            }
                break;
            case 5:
                //5. Escriviu un programa que agafi un vector de paraules i ens digui quina és la més llarga i quina longitud té.
            {
                String[] frases = new String[5];
                int[] numFrases = new int[5];
                int fraseMesLLarga = 0;

                for (int i = 0; i < frases.length; i++) {
                    System.out.println("BENBINGUT, Introdueix la " + (i + 1) + "º frase:");
                    frases[i] = llegir.next(); // Pot llegir espais
                    numFrases[i] = frases[i].length();
                }
                for (int i = 1; i < numFrases.length; i++) {
                    if (numFrases[(i-1)]<numFrases[i]){
                        fraseMesLLarga = i;
                    }
                }

                System.out.println("La fase mes llarga es la "+(fraseMesLLarga+1)+"º, Es es \""+frases[fraseMesLLarga]+ "\"");

            }
            break;




        }









    }
}

