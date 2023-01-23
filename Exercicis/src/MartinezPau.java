import java.net.UnknownHostException;
import java.util.Scanner;
import  java.net.InetAddress;
public class MartinezPau {
    public static void main(String[] args) throws UnknownHostException {
        Benvinguda();
    }

    public static void Benvinguda() throws UnknownHostException {

        InetAddress addr = InetAddress.getLocalHost();
        Scanner llegir = new Scanner(System.in);
        String name = addr.getCanonicalHostName();
        System.out.println("Benvulgut, "+ name);
    }




}
