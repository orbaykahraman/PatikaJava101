import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {
        double urun;

        Scanner input = new Scanner(System.in);
        System.out.print("Aldığınız ürün fiyatı :");


        urun = input.nextInt();

        double urunYeni;

        boolean kosul1 = urun <= 1000;

        urunYeni = kosul1 ? urun + urun * 0.18 : urun + urun * 0.08;

        System.out.println("Aldığınız ürünün KDV'li tutarı :" + urunYeni + " TL");

        System.out.println("Aldığınız ürünün KDV tutarı :" + (urunYeni-urun) + "TL");




    }
}
