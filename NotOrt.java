
import java.util.Scanner;
public class NotOrt {

    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, kimya, fizik, tarih, turkce;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matemetik notunuz :");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Kimya notunuz :");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("fizik notunuz :");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("tarih notunuz :");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Türkce notunuz :");
        turkce = inp.nextInt();
        System.out.println(turkce);

        int toplam = (mat + fizik + tarih + tarih + kimya);
        double ortalama = (toplam / 5.0);

        System.out.print("NOT ORTALAMANIZ :");
        System.out.println(ortalama);

        int x = 60;
        boolean kosul = ortalama == x;
        boolean kosul1 = ortalama >= x;
        boolean sonuc = kosul || kosul1;
        String str = sonuc ? "Gecti" : "Kaldi";
        System.out.println(str);
    }
}
