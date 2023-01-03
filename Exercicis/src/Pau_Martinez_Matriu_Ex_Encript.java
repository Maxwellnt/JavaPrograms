public class Pau_Martinez_Matriu_Ex_Encript {
    public static void main(String[] args) {

        int [][] numsNom = new int[3][3];
        char [][] charNom = new char[3][3];


        for (int i = 0; i < numsNom.length; i++) {
            for (int j = 0; j < numsNom[i].length; j++) {
                numsNom [i][j] = (int) (Math.random()*127);
            }
        }
        numsNom [0][0] = 80;
        numsNom [1][1] = 97;
        numsNom [2][2] = 117;


        // Imprimim
        for (int i = 0; i < numsNom.length; i++) {
            for (int j = 0; j < numsNom[i].length; j++) {
                System.out.print(numsNom[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Descodificant...");

        for (int i = 0; i < charNom.length; i++) {
            for (int j = 0; j < charNom[i].length; j++) {
                charNom [i][j] = (char) numsNom[i][j];
            }
        }

        // Imprimim
        for (int i = 0; i < charNom.length; i++) {
            for (int j = 0; j < charNom[i].length; j++) {
                System.out.print(charNom[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
