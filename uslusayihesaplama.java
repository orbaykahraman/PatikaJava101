import java.util.Scanner;
public class uslusayihesaplama {
    public static void main(String[] args) {
        int n, k, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k = input.nextInt();

        total = 1;

        for (int i = 1; i <= k; i++){
            total = total * n;
        }
        System.out.println("cevap :"+ total);
    }
}
