package ArrayLists;

import java.util.ArrayList;

public class Main {
    public static void yazdir(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + a.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ahmet"); //Arrayliste eleman eklemek için kullanılır.
        arrayList.add("Mehmet");
        arrayList.add("Murat");
        arrayList.add("Fatih");
        arrayList.add("Apo");
        arrayList.add("Barış");
        arrayList.add("İcardi");
        arrayList.add("Oshimen");
        arrayList.add("Ahmet");
        //arrayList.remove("Mehmet"); //ArrayListten eleman silmek için kullanılır
        //arrayList.remove(arrayList.get(3)); //index kullanarak arrayListten eleman silmek
        System.out.println(arrayList);
        System.out.println(arrayList.get(0)); //arraylist in içinden istediğimiz indexi seçebiliriz.
        System.out.println(arrayList.size()); //ArrayList in boyunun bize verir.

        for (int i = 0; i < arrayList.size(); i++) { //for yardımı ile arrayListi bastırmak
            System.out.println(arrayList.get(i));
        }
        for (String s : arrayList) { //foreach yardımı ile arrayListi bastırmak
            System.out.println(s);
        }

        System.out.println(arrayList.indexOf("Ahmet")); //Ahmet elemanının yerini öğrenmemizi sağlar. Birden çok aynı eleman varsa ilk gördüğü yerde durur.
        System.out.println(arrayList.lastIndexOf("Ahmet")); //Bu da sonda başlayarak sayar ve ilk gördüğü ahmette durur ve indexi verir.

        arrayList.set(3,"Can"); //bir indeksi direk güncellememizi sağlar ilk olarak güncellemek istediğimiz indeksi yazarız sonra da ne ile güncellemek istiyorsak onu
        System.out.println(arrayList);

        yazdir(arrayList);


    }
}














