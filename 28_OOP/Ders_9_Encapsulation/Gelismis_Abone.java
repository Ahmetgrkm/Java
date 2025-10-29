package Ders_9_Encapsulation;

public class Gelismis_Abone {
    private String isim;
    private int bakiye = 120; //bütün  objelerimizin ilk bakiye değeri 120 olsun diye böyle yazdık.
    private String sehir;

    public Gelismis_Abone(String isim, int bakiye, String sehir) {
        this.isim = isim;

        if (bakiye > 0 && bakiye < 120) {
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }
    public void dogalGaz_kullan(int miktar){
        if ((this.bakiye-miktar)<0){

            System.out.println("Yeterli Bakiye yok");
        }
        else{
            this.bakiye -= miktar;
            if(this.bakiye<= 0){
                System.out.println("Bakiyeniz bitmiştir. En yakın abone merkezine gidip kredi yükleyin. Kredi limiti 120 tl.");
            }
            else{
                System.out.println("Yeni bakiye :" + bakiye);
            }
        }
    }
    public void bakiye_ogren(){
        System.out.println("Bakiye :" + bakiye);
    }
}
