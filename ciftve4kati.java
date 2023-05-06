import java.util.Scanner;
public class ciftve4kati {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n, x;
        x = 0;

        do {
            System.out.print("Sayı giriniz :");
            n = girdi.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                x = x + n;
            }
        }while (n > 0);
        System.out.println(x);
    }
}
