import java.util.Scanner;

public class Havasicakligietkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını belirtiniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 9) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("Sinemaya ve pikniğe gidebilirsiniz");
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
