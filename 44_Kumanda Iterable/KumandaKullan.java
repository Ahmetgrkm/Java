import java.util.Scanner;

public class KumandaKullan {
    public static void main(String[] args) {
        System.out.println("Kumanda Programı");
        Scanner sc = new Scanner(System.in);

        String islemler = "İşlemler\n" +
                "1.işlem : Kanalları Göster\n" +
                "2.işlem : Kanal Ekle\n" +
                "3.işlem : Kanal Sil\n" +
                "4.İŞlem : Kanal Sayısı Öğren\n" +
                "Çıkış İçin q ya basınız...";

        Kumanda kumanda = new Kumanda();
        while(true){
            System.out.println(islemler);
            System.out.println("İşlemi giriniz");
            String islem = sc.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor");
                break;
            }
            else if(islem.equals("1")){
                kanallariGoster(kumanda);
            }
            else if(islem.equals("2")){
                System.out.println("Eklenecek kanal :");
                String kanalismi = sc.nextLine();
                kumanda.kanalEkle(kanalismi);
            }
            else if(islem.equals("3")){
                System.out.println("Silinecek kanal :");
                String silinecekKanal = sc.nextLine();
                kumanda.kanalSil(silinecekKanal);
            }
            else if(islem.equals("4")){
                System.out.println("Kanal Sayısı :" + kumanda.kanalSayisi());

            }
            else {
                System.out.println("Geçersiz işlem girdiniz...");
            }
        }
    }
    public static void kanallariGoster(Kumanda kumanda){
        if (kumanda.kanalSayisi()==0){
            System.out.println("Şuanda hiçbir kanal bulunmuyor");
        }
        else{
            for (String kanal : kumanda){
                System.out.println("Kanal :" + kanal);
            }
        }
    }
}


























