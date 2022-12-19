public class Sorting {
    public static void main(String[] args) {
        int [] numeros = {5,4,1,8,4,2,5,9,2,7};

// Hi ha multiples manereas
        for (int i = 0; i < numeros.length; i++){
            for (int j = i+1; j < numeros.length; j++){
                if (numeros[i] > numeros[j]){ // i=0 j=1
                    // 5 > 4? Si
                    int camvi = numeros[i]; // camvi = 5
                    numeros[i] = numeros[j];
                    // numeros = {4,4,1,8,...}
                    numeros[j] = camvi;
                    // numeros = {4,5,1,8,...}
                }
            }
        }

        System.out.println ("El arry orednat es: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}
