import java.util.Scanner;
public class palindromsayi {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            System.out.println("Girilen sayı :" + temp);
            lastNumber = temp % 10;
            System.out.println("Girilen sayının son rakamı : "+ lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Girilen sayının tersten yazılışı :" + reverseNumber);
            temp /= 10;
        } if ( number == reverseNumber){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int i = girdi.nextInt();
        System.out.println(isPalindrom(i));


    }
}
