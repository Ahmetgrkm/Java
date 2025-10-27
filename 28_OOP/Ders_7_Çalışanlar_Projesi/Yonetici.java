package Ders_7_Çalışanlar_Projesi;

public class Yonetici extends Calisan{

    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad,soyad,id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Yöneticinin Sorumlu olduğu kişi : " + sorumlu_kisi_sayisi);
    }
    public void zamYap(int zam_miktari){
        System.out.println(getAd() + " çalışanlara " + zam_miktari +" kadar zam yapıyor....");
    }
}
