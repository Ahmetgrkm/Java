package Ders_7_Çalışanlar_Projesi;

import Ders_6_İnheritence.yonetici;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ÇALIŞANLAR PROGRAMINA HOŞGELDİNİZ....");

        String islemler ="İŞLEMLER...\n" +
                "1.Yazılımcı İşlemleri\n" +
                "2.Yönetici İşlemleri\n" +
                "Çıkış için q ya basın";
        System.out.println("**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");

        while (true){
            System.out.println("İşlemi seçiniz");
            String islem = sc.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                yazilimci yazilimci = new yazilimci("ahmed","çalışkan",107,"Java,React,Test");
                String yazilimci_islem ="1.Format at\n" +
                        "2.bilgileri göster\n" +
                        "Çıkış için q ya basın";
                System.out.println(yazilimci_islem);
                while (true){
                    System.out.println("İşlemi seçiniz :");
                   String y_islem = sc.nextLine();
                   if(y_islem.equals("q")){
                       System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                       break;
                   }
                   else if(y_islem.equals("1")){
                       System.out.print("İşletim Sistemi :");
                       String isletim_sistem = sc.nextLine();
                       yazilimci.formatAt(isletim_sistem);
                   }
                   else if(y_islem.equals("2")){
                       yazilimci.BilgileriGoster();
                   }
                   else {
                       System.out.println("Geçersiz yazılımcı işlemi");
                   }
                }
            }

            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("GRKM","çalışkan",440044,250);
                String yonetici_islem ="YÖNETİCİ İŞLEMLERİ...\n" +
                        "1.Zam Yap\n" +
                        "2.Bilgileri GÖster\n" +
                        "Çıkmak için q ya basın";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.println("İşlem seçiniz");
                    String y_islem = sc.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor.");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istersiniz? :");
                        int zam_miktari = sc.nextInt();
                        sc.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    else if(y_islem.equals("2")){
                        yonetici.BilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz işlem seçtiniz");
                    }
                }

            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}




















