
public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.setIsim(isim);
    }
    public void ismini_soyle(){
        System.out.println("Bu obje " + getIsim() +" objesidir");
    }
    abstract void alan_hesapla(); //gövdesiz yazdığımız bu absract methodu bu sınıftan türettiğimiz alt sınıflar bunu mutlaka kullanmalı kendine göre yazmalı.

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
