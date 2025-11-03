import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi = scan.nextInt();
        double toplam = 0;

        for (double i = 1; i <= sayi; i++) {
            System.out.println(i);
            toplam = toplam + (1/i);


        }
        System.out.println("Sayıların harmonik toplamı : " + toplam);
    }
}
