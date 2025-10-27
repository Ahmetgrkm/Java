package Ders_1_OopGiris;

public class Test {
    public static void main(String[] args) {
        Araba araba1 = new Araba();

        araba1.renk = "kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model="Reno";

        System.out.println(araba1.motor);
        System.out.println(araba1.model);
        System.out.println(araba1.renk);

    }
}
