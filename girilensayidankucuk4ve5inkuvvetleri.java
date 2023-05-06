import java.util.Scanner;
public class girilensayidankucuk4ve5inkuvvetleri {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int x;
        System.out.print("Sayı giriniz :");
        x = girdi.nextInt();

        System.out.println("4'ün kuvvetleri aşağıda sıralanmıştır");
        for (int i = 1; i < x; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri aşağıda sıralanmıştır");
        for (int i = 1; i < x; i*=5){
            System.out.println(i);
        }

    }
}
