import java.util.Scanner;

public class Pau_Martinez_Salgado_Array_Ex8 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        String [] bombo1  = {"Manchester United (ING)", "Nantes (FRA)", "Midtjylland (DIN)",  "Rennes (FRA)",  "Union Berlín (GER)", "Mónaco (FRA)", "PSV Eindhoven (NED)",  "Roma (ITA)"};
        String [] bombo2 = {"Barcelona (ESP)", "Juventus (ITA)", "Sporting Lisboa (POR)", "Shakhtar Donetsk (UKR)", "Ajax (NED)", "Bayer Leverkusen (GER)", "Sevilla (ESP)", "Salzburgo (AUT)"};
        int [] num = {1,2,3,4,5,6,7,8};
        int [] numL = {1,2,3,4,5,6,7,8};
        int index1 = 1;
        int index2 = 1;


        for (int i = 0; i < bombo1.length;) {
            index1 = (int) (Math.random()*8);
            index2 = (int) (Math.random()*8);


            if (bombo1 [index1] != "9" && bombo2 [index2] != "9"){
                if (index1 == 0|| index2 == 0){
                    System.out.println(bombo1[0] + " vs. " + bombo2[0]);
                    bombo1[0] = "9";
                    bombo2[0] = "9";
                }else {

                    System.out.println(bombo1[index1] + " vs. " + bombo2[index2]);
                    bombo1[index1] = "9";
                    bombo2[index2] = "9";
                    i++;
                }
            }



        }


    }
}

