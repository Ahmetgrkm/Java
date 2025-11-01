package Ders_9_Polymorphism;  //Polimorfizim olmasaydı bu örnekteki gibi her yeni class ekleme işleminde onlarca yeri değiştirip birçok kontrolü elle yapmamız gerekecekti.

class Hayvan4{
    private String isim;

    public Hayvan4(String isim) {
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
class kedi4 extends Hayvan4{
    public kedi4(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor..";
    }
}
class Kopek4 extends Hayvan4{
    public Kopek4(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}
class At4 extends Hayvan4{
    public At4(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
}
class Kus extends Hayvan4{
    public Kus(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + "Ötüyor...";
    }
}

public class Main2 {


    public static void konustur(Object object) {
        if (object instanceof Kopek4) {
            Kopek4 kopek = (Kopek4) object;
            System.out.println(kopek.konus());
        }
        else if (object instanceof kedi4) {
            kedi4 kedi = (kedi4) object;
            System.out.println(kedi.konus());
        }
        else if (object instanceof At4) {
            At4 at = (At4) object;
            System.out.println(at.konus());
        }
        else if (object instanceof Hayvan4) {
            Hayvan4 hayvan = (Hayvan4) object;
            System.out.println(hayvan.konus());
        }
        else if (object instanceof Kus) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        }

        //System.out.println(object.konus());
        //Bir objenin hangi classdan oluştuğunu anlamak için instanceof anahtar kelimesi kullanılır ve bize true yada false döndürür.
    }

    public static void main(String[] args) {
        /*Kopek4 kopek4 = new Kopek4("Karabas");
        if (kopek4 instanceof Kopek4){
            System.out.println("Bu nesne kopek4 sınıfından");

        }
         */
        Kopek4 kopek = new Kopek4("Karabaş");
        kedi4 kedi = new kedi4("Pamuk");
        At4 at = new At4("Şahbatur");
        Hayvan4 hayvan = new Hayvan4("Hayvan");
        Kus kus = new Kus("Zeytin");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
    }
}





















