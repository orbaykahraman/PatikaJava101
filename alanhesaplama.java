import java.util.Scanner;


public class alanhesaplama {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin birinci kenar uzunluğunu giriniz :");
        a = input.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz :");
        b = input.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz :");
        c = input.nextDouble();

        // Yarı çevreyi hesaplıyoruz.
        double u = (a+b+c) / 2;

        // Alanı hesaplayalım.

        double alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));


        System.out.println("Dik üçgenin Alanı :"+ alan);








    }
}
