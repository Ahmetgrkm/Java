package Matematik_Fizik_Problemleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matematik  ve Fizik Problemleri programına hoşgeldiniz...");
        String islemler = "İşlemler...\n" +
                "1.Daire Alanı Hesapla\n" +
                "2.Üçgen Çevresi hesapla\n" +
                "3.İki vektörün iç çarpımını hesaplama\n" +
                "Çıkış için q ya basın";
        while (true) {
            System.out.println(islemler);
            System.out.print("İşlemi seçiniz :");
            String islem = sc.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Yarıçapı giriniz :");
                int yaricap = sc.nextInt();
                sc.nextLine();
                Problem.Matematik.daireAlan(yaricap); // hem matematik hemde methodumuz static olduğu için direk isimle yazabiliriz.
            }
            else if (islem.equals("2")) {
                System.out.println("Üçgenin kenarlarını giriniz...");
                System.out.print("Kenar 1 :");
                int k1 = sc.nextInt();
                System.out.print("Kenar 2 :");
                int k2 = sc.nextInt();
                System.out.print("Kenar 3 :");
                int k3 = sc.nextInt();
                sc.nextLine();

                Problem.Matematik.ucgen_cevresi(k1,k2,k3);
            }
            else if (islem.equals("3")) {
                vek vec1 = new vek("vektör1");
                vek vec2 = new vek("vektör2");

                Problem.Fizik.ic_carpim(vec1,vec2);
            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
}




















