import java.util.Scanner;

//kullanıcıdan alınan 3 sayıdan en büyüğünü bulma

public class maxSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz :");
        int sayi1 = sc.nextInt();

        System.out.print("2.sayıyı giriniz :");
        int sayi2 = sc.nextInt();

        System.out.print("3.sayıyı giriniz :");
        int sayi3 = sc.nextInt();

        int maks = -1;

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            maks=sayi1;
        }
        else if (sayi2 > sayi1 && sayi2 > sayi3) {
            maks=sayi2;
        }
        else {
            maks=sayi3;
        }
        System.out.println("En büyük sayı :" + maks);
    }
}
