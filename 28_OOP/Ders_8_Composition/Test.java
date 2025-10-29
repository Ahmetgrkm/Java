package Ders_8_Composition;

public class Test {
    public  static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE","Asus","18.5",resolution);
        Kasa kasa = new Kasa("Çelik","SHADOWBLADE","LG");
        Anakart anakart = new Anakart("B250PRO","Asus",10,"Windows10");

        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);

        pc.getKasa().bilgisayari_ac(); //eğer bilgisayarı_ac fonksiyonuna erişmek istiyorsak önce bilgisayar içindeki kasaya erişmemiz lazım ki bu fonksiyonu kullanabilelim.

        pc.getMonitor().monitoru_kapat();

        pc.getAnakart().isletim_sistemi_yukle("Ubuntu");


    }
}
