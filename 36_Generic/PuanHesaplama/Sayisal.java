package PuanHesaplama;

public class Sayisal extends Aday{

    public Sayisal(int edebiyat, int fizik, int matematik, int turkce) {
        super(edebiyat, fizik, matematik, turkce);
    }

    @Override
    public int puan_hesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*4+getEdebiyat()*1;
    }
}
