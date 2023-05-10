import java.util.Scanner;
public class gelismishesapmakinesi {

    static int toplama(int a, int b){
        int result = a + b;
        System.out.println("Toplam :"+ result);
        return result;
    }
    static int cikarma(int a, int b){
        int result = a - b;
        System.out.println("Sonuç :"+ result);
        return result;
    }
    static int carpma(int a, int b){
        int result = a*b;
        System.out.println("Sonuç :"+ result);
        return result;
    }
    static int bolme(int a, int b){
        if (b == 0){
            System.out.println("Bölen 0'dan büyük olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç :"+ result);
        return result;
    }
    static int uslu(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Sonuç :" + result);
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Sonuç :"+ result);
        return result;
    }
    static void dik(int a, int b){
        System.out.println("Çevresi :"+ (2 * ( a+b)));
        System.out.println("Alanı :" + (a*b));
    }


    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int select;

        String menu = "1- Toplama işlmei\n" +
                "2- Çıkarma işlemi\n" +
                "3- Çarpma işlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü sayı hesaplama\n" +
                "6- Mod alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış yap";

        System.out.println(menu);

        while (true){
            System.out.print("Bir işlemi seçiniz :");
            select = girdi.nextInt();
            if (select == 0){
                System.out.println("Çıkış işlemi gerçekleştiriliyor.");
                break;
            } if (select > 7){
                System.out.println("Hatalı giriş yaptınız");
                break;
            }
                System.out.print("A sayısını giriniz :");
                int a = girdi.nextInt();
                System.out.print("B sayısını giriniz :");
                int b = girdi.nextInt();

                switch (select){
                    case 1:
                        toplama(a,b);
                        break;
                    case 2:
                        cikarma(a,b);
                        break;
                    case 3:
                        carpma(a,b);
                        break;
                    case 4:
                        bolme(a,b);
                        break;
                    case 5:
                        uslu(a,b);
                        break;
                    case 6:
                        mod(a,b);
                        break;
                    case 7 :
                        dik(a,b);
                        break;
                }
        }



    }
}
