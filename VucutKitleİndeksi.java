
import java.util.Scanner;

public class VucutKitleİndeksi {
    public static void main(String[] args) {

        double boy, kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        double sonuc = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz :"+sonuc);



    }
}
