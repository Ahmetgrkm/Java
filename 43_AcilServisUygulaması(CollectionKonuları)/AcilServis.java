import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServis {
    //Hatsalar acil serviste Şİkayetlerine göre kuyrukta en öne geçecek(PriorityQueue)

    //Apandisit ---> En yüksek öncelik
    //Yanık ----> Orta öncelik
    //baş ağrısı en düşük öncelik

    /*
    new Hasta("Murat Bey","Yanık")
    new Hasta("Okan Bey","Baş Ağrısı")
    new Hasta("Elif Hanım","Apandisit")
    new Hasta("Oğuz Bey","Yanık")
    new Hasta("Merve Hanım","Yanık")
    new Hasta("Gizem Hanım","Apandisit")
     */
    public static void main(String[] args) {
        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        acilServis.offer(new Hasta("Murat Bey","Yanık"));
        acilServis.offer(new Hasta("Okan Bey","Baş Ağrısı"));
        acilServis.offer(new Hasta("Elif Hanım","Apandisit"));
        acilServis.offer(new Hasta("Oğuz Bey","Yanık"));
        acilServis.offer(new Hasta("Merve Hanım","Yanık"));
        acilServis.offer(new Hasta("Gizem Hanım","Apandisit"));

        int i =1;
        while (!acilServis.isEmpty()) {
            System.out.println("*****************************");
            System.out.println(i+". sırada");
            System.out.println(acilServis.poll());
            System.out.println("******************************");
            i++;
        }

    }
}





















