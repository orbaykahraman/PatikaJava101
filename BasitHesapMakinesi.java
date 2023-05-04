import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        n1 = girdi.nextDouble();

        System.out.print("İkinci sayıyı giriniz :");
        n2 = girdi.nextDouble();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Tercihinizi belirtiniz lütfen :");
        select = girdi.nextInt();

        switch (select) {
            case 1:
                System.out.print("sonuç :"+(n1 + n2));
                break;
            case 2:
                System.out.print("sonuç :"+(n1 - n2));
                break;
            case 3:
                System.out.print("sonuç :"+(n1 * n2));
                break;
            case 4:
                if  (n2 != 0){
                    System.out.print("sonuç :"+(n1 / n2));
                }
                else{
                    System.out.print("Sayıyı 0 ile bölemezsiniz, lütfen yeni bir sayı girip tekrar deneyiniz !");
                }
                break;


        }
    }
}
