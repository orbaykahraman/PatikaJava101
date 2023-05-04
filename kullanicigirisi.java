import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String userName, password,newPass, again;
        int select, change;

        Scanner girdi = new Scanner(System.in);

        String ad = "patika";
        String sifre = "java123";

        System.out.print("Kullanıcı adınızı giriniz :");
        userName = girdi.nextLine();

        System.out.print("Şifrenizi giriniz :");
        password = girdi.nextLine();

        if (userName.equals(ad) && password.equals(sifre)) {
            System.out.print("BAŞARILI BİR ŞEKİLDE GİRİŞ YAPTINIZ");
        } else {
            System.out.println("Giriş başarısız");
            System.out.println("1- Şifreyi değiştir\n2- Tekrar dene");
            System.out.print("Tercihinizi belirtiniz :");
            change = girdi.nextInt();
            girdi.nextLine();

            switch (change) {
                case 1 -> {
                    System.out.print("Yeni şifrenizi giriniz :");
                    newPass = girdi.nextLine();
                    if (newPass.equals(sifre)) {
                        System.out.print("Yeni şifreniz eskisiyle aynı olamaz");
                    } else {
                        System.out.print("Şifreniz değiştirilmiştir. Tebrik ederiz başardınız ");
                    }
                }
                case 2 -> {
                    System.out.print("Şifrenizi tekrar giriniz :");
                    again = girdi.nextLine();
                    if (again.equals(sifre)) {
                        System.out.println("Giriş başarılı");
                    } else {
                        System.out.print("Şifre girme hakkınız dolmuştur hesabınız 10 dakika donduruldu ");
                    }
                }
            }

        }
    }
}

