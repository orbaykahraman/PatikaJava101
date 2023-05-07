import java.util.Scanner;
public class ATMPROJECASE {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String userName, passWord, name, pass;
        System.out.println("Bankamıza hoşgeldiniz !");
        System.out.println("Sisteme kayıt için kullanıcı adı ve şifre yazınız...");
        System.out.print("Sisteme kayıt edilecek kullanıcı adı :");
        userName = girdi.nextLine();
        System.out.print("Sisteme kayıt edilecek parolanızı yazınız :");
        passWord = girdi.nextLine();
        int right = 3;
        int select;
        int bakiye = 1500;
        int parasal;
        while (right > 0){
            System.out.println("Hesabınıza giriş yapmak için kullanıcı adınızı ve şifrenizi yazınız");
            System.out.print("Kullanıcı adı :");
            name = girdi.nextLine();
            System.out.print("Şifrenizi yazınız :");
            pass = girdi.nextLine();
            if (userName.equals(name) && passWord.equals(pass)){
                System.out.println("Hesabınıza başarıyla giriş yaptınız.");
             do {
                System.out.println("1- Para çek :\n" +
                        "2- Para yatır :\n" +
                        "3- Bakiye sorgula :\n" +
                        "4- Çıkış yap");

                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                select = girdi.nextInt();
                switch (select){
                    case 1:
                        System.out.print("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİN :");
                        parasal = girdi.nextInt();
                        if (parasal < bakiye){
                            bakiye = bakiye-parasal;
                        } else {
                            System.out.println("Yetersiz bakiye");
                            break;
                        }
                    case 2:
                        System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİN :");
                        parasal = girdi.nextInt();
                        bakiye += parasal;
                        break;
                    case 3:
                        System.out.println("HESABINIZDAKİ PARACIK MİKTARI :"+ bakiye);
                }
            } while (select != 4);
            System.out.println("YOLUNUZ AÇIK PARANIZ ÇOK OLSUN.");
            break;
            }else{
                right--;
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyin");
                if (right == 0){
                    System.out.println("3 KERE YANLIŞ GİRDİNİZ HESABINIZ BLOKE EDİLDİ");
                } else {
                    System.out.println("Kalan hakkızın "+ right);
                }
            }
        }
    }
}
