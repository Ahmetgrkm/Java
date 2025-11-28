public class generic { //generic classlar türden bağımsız işlem yaptığımız methodlardır.
    public static void main(String[] args) {

        Character[] char_dizi = {'J','A','V','A'};
        Integer[] int_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"java","python","C++","C#"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Ahmed"),new Ogrenci("Görkem"),new Ogrenci("Çalışkan")};

        /*CharYazdir.yazdir(char_dizi); EĞER generic kullanmasaydık böyle yapmak zorunda kalırık ve farklı farklı sınıflar tanımlardık
        System.out.println("****************************************");
        IntegerYazdir.yazdir(int_dizi);
        System.out.println("****************************************");
        StringYazdir.yazdir(string_dizi);
        System.out.println("****************************************");
        OgrenciYazdir.yazdir(ogrenci_dizi);
         */


        YazdirmaSinifi<Character> yazdirChar = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdirString = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdirInt = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdirOgrenci = new YazdirmaSinifi<Ogrenci>();

        yazdirChar.yazdir(char_dizi);
        System.out.println("******************************");
        yazdirString.yazdir(string_dizi);
        System.out.println("******************************");
        yazdirInt.yazdir(int_dizi);
        System.out.println("******************************");
        yazdirOgrenci.yazdir(ogrenci_dizi);



    }




}
