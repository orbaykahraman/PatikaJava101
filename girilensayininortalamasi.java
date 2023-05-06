import java.util.Scanner;
public class girilensayininortalamasi {
    public static void main(String[] args) {
        int sayi, x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz :");
        sayi = scanner.nextInt();
        double ort;
        x = 0;
        y = 0;

        for (int i = 1; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                x += i;
                y++;
            }
        }
        ort = x / y;
        System.out.println("Toplam elde edilen sayi :"+ x);
        System.out.println("Ortalamasını almak için kaç adet sayı kullanıldı : "+ y);
        System.out.println("Girilen sayıların 3 ve 4 e tam bölünebilenlerin ortalaması :"+ ort);
    }
}
