import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz :");
        int size = sc.nextInt();

        int[] dizi = new int[size];

        System.out.print("Dizi elemanlarını giriniz :");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1) +  ".elemanı giriniz : ");
            dizi[i] = sc.nextInt();
        }

        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - 1 - i; j++) { //burası sıralama sonunda doğru yere oturan eleman bir daha kontrol edilmesin diye böyle yazıldı(int j = 0; j < dizi.length - 1 - i)
                if (dizi[j] > dizi[j + 1]) {
                    int temp = dizi[j]; //gereksiz bellek tutmasın diye döngü içerisinde tanımdaldık.
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
        System.out.println("Sıralı dizi : ");
        for(int eleman : dizi){
            System.out.print(eleman + " ");
        }
    }
}
