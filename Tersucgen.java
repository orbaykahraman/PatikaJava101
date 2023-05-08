import java.util.Scanner;
public class Tersucgen {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int x;
        System.out.println("Bir sayı giriniz :");
        x = girdi.nextInt();
        int space = x-1;
        int space1 = (2*x)-1;

        for (int k = x; k >= 1; k--){
            for (int j = 0; j < x - k ; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * k - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       }
}
