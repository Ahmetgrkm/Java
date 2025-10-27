package Ders_2_classlardaMethodKullanma;

public class Test {
    public static void main(String[] args) {

        Araba araba2 = new Araba();

        araba2.setModel("Kia");


        System.out.println("Model: " + araba2.getModel());

        araba2.setKapilar(-4); // kapı sayısı 0 dan küçük olamaz diye uyarı vercek çünkü methodda o koşulu koyduk.

    }
}
