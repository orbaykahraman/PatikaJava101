import java.util.Scanner;
public class Asalsayi {

    public static boolean asalMi (int a, int b){
        if (a < 2){
            return false;
        }
        if (a == 2){
            return true;
        }
        if (a % b == 0 ){
            return false;
        }
        if (a % b == 1){
            return true;
        }
        return asalMi(a,b+1);
    }
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz :");
        int a = girdi.nextInt();
        int b;

        if (asalMi(a,2)){
            System.out.println(a + " Asal sayıdır");
        } else {
            System.out.println(a + " Asal sayı değildir");
            
        }

    }
}
