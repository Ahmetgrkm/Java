import java.util.Scanner;

public class inner { //Static olmayan inner classlar böyle kullanılır
    public static void main(String[] args) {

        Matematik.Factoriyel factoriyel = new Matematik().new Factoriyel(); /*Burda diyor ki eğer sadece factoriyel yaparsan
        olmaz önce mat classını yazıp daha sonra factoriyeli yazmalısın ancak bu da yetersiz önce mat sınıfından bir obje oluştur
        daha sonra factoriyel objesini oluştur dedik*/

        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi giriniz :");
        int sayi = sc.nextInt();

        if (asal.asal_mi(sayi)){
            System.out.println("Bu sayı asaldır");
        }
        else {
            System.out.println("Bu sayı asal değildir");
        }
        factoriyel.faktoriyel();
        alan.daire_alan(5);
    }
}

