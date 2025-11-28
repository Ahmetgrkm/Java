package PuanHesaplama;

public class EsitAgirlik extends Aday {

    public EsitAgirlik(int edebiyat, int fizik, int matematik, int turkce) {
        super(edebiyat, fizik, matematik, turkce);
    }

    @Override
    public int puan_hesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*1+getEdebiyat()*4;
    }
}
