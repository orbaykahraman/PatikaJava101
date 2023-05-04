import java.util.Scanner;


public class DaireninAlanvecev {
    public static void main(String[] args) {
       int r;
       double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapını giriniz :");
        r = input.nextInt();

        int a;

        System.out.print("Dairenin ölçüsü olan a'nın değerini yazınız :");
        a = input.nextInt();


        double alan = (pi * (r*r) * a) / 360;

        System.out.print("Dairenin alanı :"+alan);







    }
}
