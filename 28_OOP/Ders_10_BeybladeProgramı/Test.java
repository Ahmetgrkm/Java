package Ders_10_BeybladeProgramı;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Beylade Programına Hoşgeldiniz");
        System.out.println("Çıkış için q ya basın");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Hangi Beyblade i üretmek istiyorsunuz :");
            String islem = sc.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else {
                BeyladeFabrikasi fabrika  = new BeyladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beylade ismi girin");
                }
                else {
                    beyblade.BilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
