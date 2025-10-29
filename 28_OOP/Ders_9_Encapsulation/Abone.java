package Ders_9_Encapsulation;
//Doğalgaz abonesi

public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;

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
