import java.util.Scanner;
public class Enbuyukveenkucuksayibulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,enbuyuk,enkucuk;
        i = 0;
        enbuyuk =0;
        enkucuk =0;
        boolean number=true;
        System.out.print("Kaç tane sayı :");
        n= input.nextInt();
        while (i<n){
            i++;
            System.out.print(i+".Sayıyı giriniz :");
            int sayi=input.nextInt();
            if(number){
                enbuyuk=sayi;
                enkucuk=sayi;
                number=false;
            }else{
                if(sayi>enbuyuk){
                    enbuyuk=sayi;
                }if (sayi<enkucuk){
                    enkucuk=sayi;
                }
            }
        }
        System.out.println("En büyük sayı:"+enbuyuk);
        System.out.println("En küçük sayı:"+enkucuk);
    }
}
