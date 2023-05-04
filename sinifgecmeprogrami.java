import java.util.Scanner;
public class sinifgecmeprogrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fiz, turk, kim, mzk;

        System.out.println("Matematik notunuzu giriniz :");
        matematik = input.nextInt();
        int mat = (matematik > 100 || matematik < 0) ? 0 : matematik;

        System.out.println("Fizik notunuzu giriniz :");
        fiz = input.nextInt();
        int fizik = (fiz > 100 || fiz < 0) ? 0 :fiz;

        System.out.println("Türkçe notunuzu giriniz :");
        turk = input.nextInt();
        int turkce = (turk > 100 || turk < 0) ? 0 : turk;

        System.out.println("Kimya notunuzu giriniz :");
        kim = input.nextInt();
        int kimya = (kim > 100 || kim < 0) ? 0 : kim;

        System.out.println("Müzik notunuzu giriniz :");
        mzk = input.nextInt();
        int muzik = (mzk > 100 || mzk < 0) ? 0 : mzk;

        double total = ( mat + fizik + turkce + kimya + muzik);
        double avarage =  total/ 5;
                if (avarage < 55){
                    System.out.println("Derslerden çaktın sıkma canını sağlık olsun !");
                } else if (avarage >= 55) {
                    System.out.println("Tebrikler sinifi gectiniz.");
                }
    }
}
