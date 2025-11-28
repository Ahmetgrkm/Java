public class YazdirmaSinifi<E> {   /*Burda E nin anlamı şudur "Ben sana farklı tiplerde veri tipleri göndericem sen
                                    gönderdiğim veri tipini E yi kulladnığın gördüğün her yere yaz" */

    public void yazdir(E[] dizi){
        for (E e : dizi){
            System.out.println(e);
        }
    }
}
