import java.util.Scanner;
public class cinzodyagı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int born;

        System.out.print("Çin zodyağına göre burcunuzu öğrenmek için lütfen doğum tarihinizi giriniz :");
        born = scanner.nextInt();
        int hesap;
        hesap = born%12;

        switch (hesap){
            case 0:
                System.out.println("Burcunuz MAYMUN");
                break;
            case 1:
                System.out.println("Burcunuz HOROZ");
                break;
            case 2:
                System.out.println("Burcunuz KÖPEK");
                break;
            case 3:
                System.out.println("Burcunuz DOMUZ");
                break;
            case 4:
                System.out.println("Burcunuz Fare");
                break;
            case 5:
                System.out.println("Burcunuz ÖKÜZ");
                break;
            case 6:
                System.out.println("Burcunuz KAPLAN");
                break;
            case 7:
                System.out.println("Burcunuz TAVŞAN");
                break;
            case 8:
                System.out.println("Burcunuz Ejderha");
                break;
            case 9:
                System.out.println("Burcunuz YILAN");
                break;
            case 10:
                System.out.println("Burcunuz AT");
                break;
            case 11:
                System.out.println("Burcunuz KOYUN");
                break;

        }
    }
}
