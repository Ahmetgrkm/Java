package Ders_6_İnheritence.Kısım2;

public class Köpek extends Hayvan {
    private int dis_sayisi;

    public Köpek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
        super(isim, kilo, boy, bacak_sayisi); //özellikler private olduğu için constructor ile birlikte alarak kullanmamız gerekiyor bu nedenle super kullandık.
        this.setDis_sayisi(dis_sayisi); //ek özelliğimizi ekledik.

    }
//Diğer getter ve setter methodlarını hayvandan kalıtım aldığımız için burda sadece dis_sayisinın getter ve setter methodlarını yazdık.
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    public void kos(int hiz){
        System.out.println("Kopek koşuyor.");
        super.harekete_gec(hiz);
    }
}
