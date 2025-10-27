package Ders_4_ATM_Projesi;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){
        Login login = new Login();

        Scanner sc = new Scanner(System.in);

        System.out.print("Bankamıza HOŞGELDİNİZ");
        System.out.println("***************************************");

        System.out.println("Kullanıcı girişi");
        System.out.println("***************************************");

        int giris_hakki = 3;

        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakki-=1;
                System.out.println("Kalan Giriş hakkı :" + giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giriş Hakkınız bitti...");

                return;
            }
        }
        System.out.println("********************************************");
        String islemler = "1.Bakiye Görüntüle\n" +
                "2.Para yatırma\n" +
                "3.Para Çekme\n" +
                "4.Para Çekme\n" +
                "ÇIKIŞ İÇİN q'ya BASINIZ......";
        System.out.println(islemler);
        System.out.println("*******************************************");

        while(true){
            System.out.println("Bir işlem seçiniz :");
            String islem = sc.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz :" +hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz işlem....");
            }
        }

    }

}




















