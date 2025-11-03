import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("sayının basamak sayısını girin :");
        int basamak = scan.nextInt();

        System.out.print("Sayıyı giriniz :");
        int sayi = scan.nextInt();

        int toplam = 0;
        int taban = 1;
        int orjinalSayi = sayi;

        while (sayi > 0) {
            System.out.println(sayi);
            taban = sayi % 10;

            int sonuc = 1;
            for (int j = 1; j <= basamak; j++) {
                sonuc = sonuc * taban;
            }
            toplam = toplam + sonuc;

            sayi = sayi / 10;

        }
        System.out.println("Bu işlemin toplamı : " + toplam);
        if (toplam == orjinalSayi) {
            System.out.println("Bu bir armstrong sayıdır");
        }
        else {
            System.out.println("Bu bir armstrong sayı değildir.");
        }

    }
}
