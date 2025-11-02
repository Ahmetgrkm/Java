import java.util.Scanner;

public class KDV_Hesaplama {
    public static void main(String[] args) {
        System.out.println("KDV hesaplayıcıya hoşgeldiniz");
        System.out.println("***************************************");
        String islemler = "1.KDV Hesaplama\n" +
                "2.ÇIKIŞ";
        System.out.println(islemler);


        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.print("Bir işlem seçiniz :");
        String islem = sc.nextLine();

        if (islem.equals("q")) {
            System.out.println("Sistemden Çıkış Yapılıyor...");
            break;
        } else if (islem.equals("1")) {
            System.out.print("KDV'siz fiyatı giriniz :");
            int ilkFiyat = sc.nextInt();
            sc.nextLine();

            if (ilkFiyat < 500) {
                System.out.println("Kdv oranı %18");
                double yeniFiyat = ilkFiyat + (ilkFiyat * 18) / 100;
                System.out.println("KDV'li yeni fiyat :" + yeniFiyat);
            } else {
                System.out.println("Kdv oranı %8");
                double yeniFiyat = ilkFiyat + (ilkFiyat * 8) / 100;
                System.out.println("KDV'li yeni fiyat :" + yeniFiyat);
            }
        }
    }

 }

}
