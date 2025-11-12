import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scan.nextInt();

        int ebob = ebobBul(sayi1, sayi2);
        int ekok = ekokBul(sayi1, sayi2, ebob);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    // 🔹 EBOB bulma fonksiyonu
    public static int ebobBul(int a, int b) {
        int ebob = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }
        return ebob;
    }

    // 🔹 EKOK bulma fonksiyonu
    public static int ekokBul(int a, int b, int ebob) {
        return (a * b) / ebob; // formül: EKOK = (a*b) / EBOB
    }
}
