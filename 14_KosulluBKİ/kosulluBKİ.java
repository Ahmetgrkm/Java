import java.util.Scanner;

public class kosulluBKİ {
    public static void main(String[] args) {
        //Beden Kitle İndeksi = Kilo / Boy(m) + Boy(m)
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilonuzu girin :");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu girin (Örnek : 1,72) :");
        double boy = scanner.nextDouble();

        double BKİ =  kilo/(boy*boy);
        System.out.println("Beden kitle indeksiniz :" +BKİ);

        if (BKİ <= 18.5){
            System.out.println("Zayıfsınız");
        }
        else if (BKİ>=18.5 && BKİ<=25){
            System.out.println("Normalsiniz");
        }
        else if (BKİ>=25 && BKİ<=30){
            System.out.println("Fazla kilolu");
        }
        else if (BKİ>30){
            System.out.println("OBEZSİNİZ AZ YİYİN");
        }

    }
}
