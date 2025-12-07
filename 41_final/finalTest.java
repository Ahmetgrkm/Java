public class finalTest { //final anahtar kelimesi tanımlanan bir özelliğin değeri sadece bir defa verilebilir.Sonradan değiştiremeyiz.
    /*değeri sadece ya tanımlanırken yada constructor oluşturulurken verilir.

    public final int obje_sayisi=4; //eğer istersek burdaki değeri silip constructor içinde de verebilirizç.

    public finalTest() {
        //obje_sayisi=5;  burda böyle birşey yazarsak dicek ki sen zaten final ile değer vermişsin burda veremezsin dicek.
    }
     -----------------------------DERSİN İKİNCİ KISMI-------------------------------------------------------------------------------*/
    public final int obje_sayisi;

    private static int say = 0;
    private final String isim;

    public finalTest(String isim) {
        this.isim = isim;
        setSay(getSay() + 1);
        obje_sayisi = getSay();
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        finalTest.say = say;
    }
}
