public class asalsayi100 {
    public static void main(String[] args) {
        for ( int i = 2; i <= 100; i++){
            boolean asalSayi = true;
            for ( int k = 2; k < i; k++){
                if (i % k == 0){
                    asalSayi = false;
                    break;
                }
            } if (asalSayi){
                System.out.print( i + " ");
            }
        }
    }
}
