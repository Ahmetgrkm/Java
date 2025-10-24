import java.util.Scanner;

public class methods {

    /*
    Erişim belirteci(opsiyonel) Extra_Özellikler Dönüş_Tipi Fonksiyon_Adı(parametreler){
    Burası fonksiyon bloğu

    fonksiyonun yapacağı işlemler burada olacak.

    }
     */

    /*public static void selamlama(){
        System.out.println("Selam naber");
        System.out.println("Merhaba");
    }
     */

    //*********************************FAKTÖRİYEL********************************

    public static void faktoriyel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = sc.nextInt();

        int fact = 1;
        while (sayi>0){
            fact*=sayi;
            sayi--;
        }
        System.out.println("Faktoriyel = " + fact);
    }


    public static void main(String[] args) {
        //selamlama();
        faktoriyel();
    }
}
