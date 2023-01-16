import java.io.IOException;


public class inputkeys {
    public static void main(String[] args) throws IOException {
        char grid [][] = new char[5][5];
        int keyPess = 0;

        System.out.println(keyPess);


    }

    private static char[][] maping(char map[][]){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
        return map;
    }

    private static void payermovent(int x,int y){

    }
}
