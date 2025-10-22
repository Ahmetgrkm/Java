import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /* for(baslatma ; koşul ; arttırma){
        koşul doğru oldukça sürekli çalışır
        }
        */
        /*
        int i;
        for(i=0;i<5;i++){
            System.out.println(i);
        }
        */


        /*
        for (int i=0 ; i<5; i++){
        System.out.println(i);
        }
         */

        /*
        for (int i = 10 ; i>=0; i--){
            System.out.println(i);
            }
        */


        /*int i=0;
        for (;i<=5;i++){
            System.out.println("Ahmed");
        }
        */


        /*int i = 0;
        int j = 10;
        for (;i<10 && j>0; i++, j--){
            System.out.println("i= "+i);
            System.out.println("j= "+j);
        }
        */

        /*for (int i = 1; i <= 100; i*=2) {
            System.out.println(i);
        }
         */

        //----------------------------FAKTÖRİYEL---------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int fact = 1;
        int sayi =  sc.nextInt();

        for (int i=1; i<=sayi; i++) {
            fact*=i;

        }
        System.out.println("Faktöriyel= " +fact);







    }
}


















