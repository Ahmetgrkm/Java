import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Sayıyı giriniz :");
        int sayi = sc.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Bu bir mükemmel sayıdır");
        }
        else {
            System.out.println("Bu bir mükemmel sayı değildir");
        }

    }
}
