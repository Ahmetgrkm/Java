import java.util.Scanner;

public class Max_Min_Bulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int adet = sc.nextInt();

        int max =0;
        int min =0;
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + " . sayıyı giriniz :");
            int sayi = sc.nextInt();
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min || min ==0) {
                min = sayi;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
