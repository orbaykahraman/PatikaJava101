import java.util.Scanner;
public class uslusayıhesaplamaprogramı {

    static int uslu(int a, int b ){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Üs değerini giriniz :");
        int b = girdi.nextInt();
        System.out.print("Taban değerini giriniz :");
        int a = girdi.nextInt();

        System.out.println(uslu(a,b));
    }
}
