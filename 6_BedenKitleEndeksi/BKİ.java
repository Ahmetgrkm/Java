import java.util.Scanner;

public class BKİ {
    //kullanıcıdan aldığımız boy ve kilo değerlerine göre kitle indeksi bulma

    public static void main(String[] args) {
        //Beden Kitle İndeksi = Kilo / Boy(m) + Boy(m)
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilonuzu girin :");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu girin (Örnek : 1,72) :");
        double boy = scanner.nextDouble();

        double BKİ =  kilo/(boy*boy);
        System.out.println("Beden kitle indeksiniz :" +BKİ);

    }
}
