import java.util.Scanner;
public class harmonikseri {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Harmonik serisi için sayı beliritiniz :");
        int x = inp.nextInt();

        double result = 0;

        for (double i = 1; i <= x; i++){
            result += (1/i);
        }
        System.out.println("Harmonik seri toplamına ulaştınız tebrikler keke :" +result);
    }
}
