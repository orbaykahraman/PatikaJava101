import java.util.Scanner;

public class faktoryelhesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n, nfak,r, rfak, cikarma,cfak, i, kombinasyon;
        nfak = 1;
        rfak = 1;
        cfak = 1;
        kombinasyon = nfak / (rfak * cfak);

        System.out.print("N Sayısını giriniz :");
        n = girdi.nextInt();
        System.out.print("R sayısını giriniz :");
        r = girdi.nextInt();

        cikarma = n - r;

        for (i = 1; i <= n; i++){
            nfak = nfak * i;
        }for (i = 1; i < r; r++){
            rfak = rfak * i;
        } for (i = 1; i < cikarma; i++){
            cfak = cfak * i;
        }
        System.out.println("Kombinasyon sonucu : "+ kombinasyon);
    }
}
