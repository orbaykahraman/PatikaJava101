import java.util.Scanner;
public class Mukemmelsayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int x;
        int y = 0;


        System.out.println("Bir sayı giriniz :");
        x = girdi.nextInt();

        for (int i = 1 ; i < x; i++){
            if (x % i == 0){
                y += i;
            }
        }if (y == x){
            System.out.println(x + " mükemmel sayıdır.");
        }
        else {
            System.out.println(x +" mükemmel sayı değildir.");
        }

    }
}
