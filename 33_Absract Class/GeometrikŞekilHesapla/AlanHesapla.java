package GeometrikŞekilHesapla;

import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String islemler = "İŞLEMLER\n" +
                "1.Kare alan hesapla\n" +
                "2.Üçgen alan hesapla\n" +
                "3.Daire alan hesapla\n" +
                "Çıkış için q  ya basınız";

        while(true){
            System.out.println(islemler);
            System.out.print("Hangi şeklin alanını hesaplamak istiyorsun :");
            String sekil_turu = sc.nextLine();
            Sekil sekil = null;
            if (sekil_turu.equals("q")){
                System.out.println("sistemden çıkılıyor");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.print("Karenin kenarını giriniz :");
                int kenar = sc.nextInt();
                sc.nextLine();

                sekil = new Kare("kare1",kenar);
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("2")){
                System.out.println("Kenar1 :");
                int kenar1 = sc.nextInt();
                System.out.println("Kenar2 :");
                int kenar2 = sc.nextInt();
                System.out.println("kenar3 :");
                int kenar3 = sc.nextInt();
                sc.nextLine();
                sekil = new Ucgen("Ucgen1",kenar1,kenar2,kenar3);
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("3")){
                System.out.println("Yarıçapı giriniz :");
                int yaricap = sc.nextInt();
                sc.nextLine();
                sekil = new Daire("Daire1",yaricap);
                sekil.alanHesapla();
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
/*Burda sekil referansını başta tanımladık ancak içini doldurmadık. Daha sonra döngü içindeki gibi sekilin kare ucgen ve daire gibi davranır.
buna Polimorfizim denir. Yani referans olarak verdiğimiz için bir sınıfa bağlı kalmadan farklı şekilllerde davranmasını sağlayabiliriz.

Yani absract classlardan ürettiğimiz alt sınıfları bir referansa atayabiliriz. O referans  başka sınılar gibi davranabilir.
 */

















