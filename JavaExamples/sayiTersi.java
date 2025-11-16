import java.util.ArrayList;
import java.util.Scanner;

public class sayiTersi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> basamak = new ArrayList<>();


        System.out.print("Tersini bulmak istediğiniz sayıyı giriniz :");
        int sayi = sc.nextInt();


        while(sayi > 0) {
            int kalan = sayi%10;
            basamak.add(kalan);
            sayi = sayi/10;
        }
        for(int i = 0; i < basamak.size(); i++) {
            System.out.print(basamak.get(i));
        }


    }
}
