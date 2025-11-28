package PuanHesaplama;

public class Test {
    public static void main(String[] args) {
        Sayisal sayisal1 = new Sayisal(30,40,20,30);
        Sayisal sayisal2 = new Sayisal(2,35,45,30);

        Sayisal birinci = birinci(sayisal1,sayisal2);

        EsitAgirlik esitAgirlik = new EsitAgirlik(30,2,20,40);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(50,0,10,40);

        EsitAgirlik birinci2 = birinci(esitAgirlik,esitAgirlik);

        System.out.println("Birinci Öğrencinin puanı :" + birinci.puan_hesapla());
        System.out.println("Birinci Eşit ağırlık Öğrencinin puanı :" + birinci2.puan_hesapla());


    }
    public static  <E extends Aday> E birinci(E e1, E e2) { /*Burdaki extend şu anlama geliyor göndereceğim veri tipleri
    sadece Aday classını extend eden veri tiplerini göndereceğimizi söylüyoruz.
    */
        if (e1.puan_hesapla()>e2.puan_hesapla()) {
            return e1;
        }
        else {
            return e2;
        }
    }
}
