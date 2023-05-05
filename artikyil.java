import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
       Scanner girdi = new Scanner(System.in);
       int bolum, yil;

        System.out.print("Artık yılını hesaplamamızı istediğiniz yılı giriniz :");
        yil = girdi.nextInt();
        bolum = yil%4;

        switch (bolum) {
            case 0:
                System.out.println(yil + " bir artık yıldır !");
                break;
            default:
                System.out.println(yil + " bir artık yıl değildir !");

        }
    }
}
