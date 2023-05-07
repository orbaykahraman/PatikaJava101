import java.util.Scanner;
public class basamaksayitoplami {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayıyı belirtiniz :");
        int x = girdi.nextInt();

        int basamaksayisi, sonuc;
        sonuc = 0;

        while (x != 0){
            basamaksayisi = x % 10;
            sonuc += basamaksayisi;
            x /= 10;
        }
        System.out.println("Basamak sayılarının toplamı :"+sonuc);

    }
}
