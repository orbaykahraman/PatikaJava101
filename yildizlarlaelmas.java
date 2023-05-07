import java.util.Scanner;

public class yildizlarlaelmas {
    public static void main(String[] args) {
        int n; // elmasın yüksekliği

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı belirtiniz :");
        n = input.nextInt();

        int space = n - 1;


        for (int i = 0; i < n; i++) { // yukarıdaki üçgen kısmı
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }

        space = 0;
        for (int i = n; i > 0; i--) { // aşağıdaki üçgen kısmı
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}
