public class Generic_Method {
    public static void main(String[] args) {
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] int_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"java","python","C++","C#"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Ahmed"),new Ogrenci("Görkem"),new Ogrenci("Çalışkan")};

        yazdir(char_dizi);
        yazdir(int_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);
    }
    public static <E> void yazdir(E[] dizi){
        for (E e : dizi){
            System.out.println(e);
        }
    }
}
