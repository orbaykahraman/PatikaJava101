import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int x, y;
        int ebob = 1;
        int ekok = 0;

        System.out.print("Lütfen Ebob ve Ekok için küçük sayıyı giriniz :");
        x = girdi.nextInt();
        System.out.print("Lütfen Ebob ve Ekok için büyük sayıyı giriniz :");
        y = girdi.nextInt();

        int i = 1;

        while (i < x){
            if ( x % i == 0 && y % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Girdiğiniz sayıları ebob sonucu : "+ ebob);
        while ( i++ < (x*y)){
            if (i % x == i % y){
                ekok = i;
                break;
            }
        }
        System.out.println("Girdiğiniz sayıların ekok sonucu : "+ ekok);
    }
}
