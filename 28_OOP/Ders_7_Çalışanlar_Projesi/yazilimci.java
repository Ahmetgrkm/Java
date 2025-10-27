package Ders_7_Çalışanlar_Projesi;

public class yazilimci extends Calisan{
    private String diller;


    public  yazilimci(String ad, String soyad, int id, String diller){
        super(ad,soyad,id);
        this.diller=diller;
    }

    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " +isletim_sistemi + "ni yüklüyor");
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); //ilk olarak üst sınıfın methodunu super anahtar kelimesi ile çağırdık.
        System.out.println("Yazılımcının bildiği diller :" + diller);
    }
}
