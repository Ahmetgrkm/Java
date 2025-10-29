package Ders_9_Encapsulation;

public class Main {
    public static void main(String[] args) {
        //Abone abone = new Abone();

        /* abone.isim = "Ahmed";
        abone.bakiye = 200; // biz bu özelliğe direk olarak eriştiğimiz için en fazla 120 olabilen bakiyeye 200 verebildik. Ancak encapsulation kullanmış olsaydık yapamazdık.
        abone.sehir = "Malatya";

        /*burda 3 farklı özellik tanımladık ancak 15 tane olsaydı ve birini bile unutsaydık classımız sıkıntılı çalışıcaktı hatta belki çalışmayacaktı.
        Ancak constructor kullansaydık böyle bir derdimiz kalmayacaktı ve hiçbir özelliği unutmayacaktık.

        abone.dogalGaz_kullan(200);
         */

        //******************************* ENCAPSULATİONLU GELİŞMİŞ HALİ *************************

        Gelismis_Abone abone = new Gelismis_Abone("Ahmed",200,"Malatya");
        abone.bakiye_ogren();
    }
}
