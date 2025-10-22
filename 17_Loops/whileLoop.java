import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        /*
        While(döngü koşulu){
        //Koşul doğru olduğu sürece çalışır
        }
         */
        /*
        int i=10;
        while (i<100){
            System.out.println(i);
            i+=3;

        }*/
        //----------------------------FAKTÖRİYEL----------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı girin :");
        int sayi = sc.nextInt();
        int fact = 1;
        while (sayi >0) {
            fact = fact * sayi;
            sayi--;
        }
        System.out.println("Faktöriyel= " +fact);
    }
}

















