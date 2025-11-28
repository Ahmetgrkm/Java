package PuanHesaplama;

public abstract class Aday {
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;

    public Aday(int edebiyat, int fizik, int matematik, int turkce) {
        this.setEdebiyat(edebiyat);
        this.setFizik(fizik);
        this.setMatematik(matematik);
        this.setTurkce(turkce);
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }
    abstract int puan_hesapla();
}














