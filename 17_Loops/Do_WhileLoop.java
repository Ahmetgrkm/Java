import java.util.Scanner;

public class Do_WhileLoop {
    public static void main(String[] args) {
        //Koşul doğru olduğu sürece çalışır ancak döngü en az bir kere çalışır(Do bloğu içindeki)

        /*int i = 0;
        do {
            System.out.println("i :" + i);
            i++;
        }
        while (i < 5);
         */

        //------------------Bir sayının rakamları toplamı-------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = sc.nextInt();
        int toplam = 0;
        do {
            toplam+=sayi%10;
            sayi = sayi/10;
            System.out.println("Sayı = " + sayi);
        }while (sayi>0);

        System.out.print("Rakamları toplamı: " + toplam);

    }
}
