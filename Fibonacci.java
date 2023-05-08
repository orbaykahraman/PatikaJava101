import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz :");
        int kacsayi = girdi.nextInt();

        int sayi1 = 0, sayi2 = 1;

        for (int i = 1; i < kacsayi; i++){
            int nextNumber = sayi1 + sayi2;
            System.out.println(sayi1 + "+" + sayi2 + "="+ nextNumber );
            sayi1 = sayi2;
            sayi2 = nextNumber;
        }
    }
}
