import java.util.Scanner;

public class TekSayiToplami {

    public static void TekSayiToplami() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = sc.nextInt();
        int toplam = 0;

        for (int i=1; i<=sayi; i++) {

            if (i%2==1) {
                System.out.println(i);
                toplam += i;
            }
        }
        System.out.println("Tek sayıların toplamı :"+toplam);
    }


    public static void main(String[] args) {
        TekSayiToplami();
    }
}
