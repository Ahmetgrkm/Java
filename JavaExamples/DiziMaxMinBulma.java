import java.util.Scanner;

public class DiziMaxMinBulma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz :");
        int boyut = sc.nextInt();

        int[] dizi = new int[boyut];



        for (int i = 0; i < dizi.length; i++){
            System.out.print((i+1) + ". elemanı giriniz :");
            dizi[i] = sc.nextInt();
        }

        int max = dizi[0];
        int min = dizi[0];

        for (int i = 1; i < dizi.length; i++){
            if (dizi[i] > max) max = dizi[i];
            if (dizi[i] < min) min = dizi[i];
        }
        System.out.println("Diziniz en küçük elemanı : " + min);
        System.out.println("Dizinin en büyük elemanı : " +max);

    }
}
