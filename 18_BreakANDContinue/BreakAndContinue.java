import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        /* BREAK Anahar kelimesi

        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmayı durdurur.
        Böylelikle döngü hiçbir koşula bağlı olmaksızın durur. Sadece ve sadece içinde bulunduğu döngüyü sonlandırır.
        Eğer iç içe döngüler varsa ve break içteki döngüde ise sadece içteki döngüyü sonlandırır.

        CONTİNUE Anahtar kelimesi

        Döngü herhangi bir yerde veya herhangi bir zamanda break ifadesiyle karşılaştığı zaman geri kalan işlemlerini
        yapmadan direk döngü bloğunun başına döner.
         */

        /*
        int i = 0;
        while (i < 10) {
            if (i==10){
                break;
            }
            System.out.println(i);
            i++;
        }
         */

        /*
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Bir sayı giriniz :");
            int islem = scan.nextInt();
            if (islem == -1) {
                System.out.println("Döngüen çıkılıyor");
                break;
            }
            System.out.println("Seçtiğiniz sayı :" + islem);
        }
         */

        int i;
        for (i=1;i<=10;i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }


    }
}



















