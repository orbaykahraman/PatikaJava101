import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int mesafe,yas,tip,ucret;
        double normalTutar,yasIndirimi,indirimliTutar,toplam;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen mesafe giriniz :");
        mesafe= inp.nextInt();
        System.out.print("Lütfen yaşınızı giriniz :");
        yas= inp.nextInt();
        System.out.print("Lütfen yolculuk tipini giriniz: Tek yön için 1 Çift yön için 2 tuşlayınız :");
        tip= inp.nextInt();
        if (mesafe>0 && yas>0)
            switch (tip) {
                case 1:
                    if (yas < 12) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("toplam tutar" + indirimliTutar);
                    } else if (12 <= yas && 24 > yas) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("toplam tutar" + indirimliTutar);
                    } else if (yas > 65) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("toplam tutar" + indirimliTutar);
                    } else {
                        normalTutar = mesafe * 0.10;
                        System.out.println("toplam tutar" + normalTutar);
                    }
                    break;
                case 2:
                    if (yas < 12) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("toplam tutar" + indirimliTutar);
                    } else if (12 <= yas && 24 > yas) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("toplam tutar" + indirimliTutar);
                    } else if (yas > 65) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("toplam tutar" + indirimliTutar);
                    } else {
                        normalTutar = mesafe * 0.10;
                        System.out.println("toplam tutar:" + normalTutar);
                    }
                    break;
                default:
                    System.out.println("hatalı sayı girdiniz lütfen 1 veya 2 tuşlayın:");
            }
        else
            System.out.println("Pozitif değer girin");
    }
}