import java.util.Scanner;

public class armstrong {

    /*Girilen sayının armsonrg olup olmadığını söyleyen program
    bir sayının armstrong olup olmadığını şöyle anlarız:
    örneğin 1634 = 1^4 + 6^4 + 3^4 + 4^4 şeklinde olmalıdır. do while ile yapılabilir. 4 basamaklı olduğu için
    sayıların 4. kuvvetini aldık ama eğer 3 basamaklı bir sayı olsaydı o zaman 3. kuvvetini alırdık.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int sayi = scan.nextInt();

        System.out.print("Basamak sayısını giriniz :");
        int basamak_sayisi = scan.nextInt();

        int gecici = sayi;
        int toplam = 0;

        do {
           int basamak_degeri = gecici%10;
           gecici = gecici/10;
           toplam += Math.pow(basamak_degeri,basamak_sayisi);


        }while (gecici>0);

        if (sayi==toplam) {
            System.out.println("Bu bir armstrong sayısıdır");
        }else {
            System.out.println("Bu sayı armstrong değildir");
        }
    }
}























