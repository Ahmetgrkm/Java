import java.util.Scanner;

public class faiz {


    //Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği ilgisini alan ve her sene sonunda toplam para miktarını ekrana yazdırır


    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bankamıza hoşgeldiniz. Faiz oranı %6");

        int anapara,vade;
        System.out.print("Yatırmak istediğiniz tutar :");
        anapara = sc.nextInt();

        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz? :");
        vade = sc.nextInt();

        double toplamPara = anapara;

        double faizOrani = 0.06;

        for (int i = 1; i <= vade; i++) {
            toplamPara = (toplamPara * faizOrani)+ toplamPara;

            System.out.println(i + ".yılın sonunda toplam para: " + (int) toplamPara);
        }
    }
}
