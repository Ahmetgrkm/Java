import java.util.Scanner;

public class Taksimetre {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç kilometre yol gittiniz? :");
        int yol = sc.nextInt();

        double fiyat;
        fiyat = 10 + (yol*2.20);

        if (fiyat <=20){
            System.out.print("Ödenecek tutar 20 tl dir...");
        }
        else{
            System.out.println("Ödeyeceğiniz tutar :"+fiyat);
        }
    }
}
