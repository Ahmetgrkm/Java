package Ders_9_Polymorphism;  //Bir nesnenin birden farklı nesne gibi davranmasına polimorfizim denir.

class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor...";
    }
}
class kedi extends Hayvan{
    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor..";
    }
}
class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}
class At extends Hayvan{
    public At(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
}


public class Main {

    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }

    public  static void main(String[] args) {
        Hayvan hayvan1 = new kedi("Tekir");
        System.out.println(hayvan1.konus());

        Hayvan hayvan2 = new Kopek("karabaş");
        System.out.println(hayvan2.konus());

        Hayvan hayvan3 = new At ("Şahbatur");
        System.out.println(hayvan3.konus());


        konustur(new kedi("Tekir"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Şahbatur"));


    }
}

//Polimorfizm için bir tane ana classımız olmalı(burdaki hayvan classı gibi), geri kalan alt classların referanslarını biz üst yani super classdaki referansa eşitleyebiliyoruz.









