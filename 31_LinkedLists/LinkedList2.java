import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList2 {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){
        /*for (String s : gidilecek_yerler){
            System.out.println(s);
        }
         */
        ListIterator<String> iterator = gidilecek_yerler.listIterator(); //linkedlist üzerine gezinmemizi sağlayan ekleme çıkarmagibi işlemleri kolayca yapmamızı sağlayan bir şeydir.

        //iterator.next(); // hangi adımdaysa iteratoru bir sonraki liste elemananına gider ve itarator onun referansında durur.

        //iterator.previous(); hangi adımdaysa iteratoru bir önceki adıma alır ve iterator de onun referansında durur.

        while(iterator.hasNext()){ //hasNext iteratörün gösterdiği nesne var mı sorusunu sorar varsa true yoksa false döner.
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        //******************************İlk KISIM*******************************************

        /*gidilecek_yerler.add("postane");
        gidilecek_yerler.add("market");
        gidilecek_yerler.add("okul");
        gidilecek_yerler.add("kütüphane");
        gidilecek_yerler.add("spor salonu");
        gidilecek_yerler.add("ev");


        listeyi_bastir(gidilecek_yerler);
        System.out.println("******************************************");
        gidilecek_yerler.add(4,"Alışveriş merkezi"); //4. indekse alışveriş merkezi ekledik
        listeyi_bastir(gidilecek_yerler);
        System.out.println("-------------------------------------------");
        gidilecek_yerler.remove(3); //3. indeksi sildik.
        listeyi_bastir(gidilecek_yerler);
         */


        //*********************************** 2.KISIM ***************************************

        //Boş olan bir linkedListe sıralı olarak eleman ekleme işlemi
        sirali_ekle(gidilecek_yerler,"postane");
        sirali_ekle(gidilecek_yerler,"Market");
        sirali_ekle(gidilecek_yerler,"Ev");
        listeyi_bastir(gidilecek_yerler); //alfabetik olarak sırakadı ve çıktı ev,market,postane oldu, string olarak sayı versek bile sıralı çıktı verir.

    }
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);  /*iteratorun olduğu değer ile gönderdiğimiz değeri kıyaslar.Eğer eşitse değer 0 çıkar.
            Eğer gönderilen değer daha büyükse karşılaştırmanın sonucu -1 çıkar, eğer gönderilen değer büyükse sonuç 0 dan büyük çıkar.*/

            if(karsilastir==0){ //iki değer eşitse
                System.out.println("Listenizde bu eleman zaten var");
                return; // dikkat et methodumuz void. O yüzden returnü sadece methodu sonlandırmak için, herhangi birşey döndürmeyecek şekilde kullanabiliriz.
            }
            else if(karsilastir<0){ //gönderdiğimiz değer iteratordan daha büyükse
                //
            }
            else if(karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
}























