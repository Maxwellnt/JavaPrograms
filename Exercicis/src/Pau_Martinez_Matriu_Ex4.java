public class Pau_Martinez_Matriu_Ex4 {
    public static void main(String[] args) {
        String[][] figura = {{"X", " ", " ", " ", "X"},
                             {" ", "X", " ", "X", " "},
                             {" ", " ", "X", " ", " "},
                             {" ", "X", " ", "X", " "},
                             {"X", " ", " ", " ", "X"}};


        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura.length; j++) {
                System.out.print(figura [i][j] + " ");

            }
            System.out.println("");
        }
    }
}
