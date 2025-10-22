import java.util.Scanner;

public class ATM {
    /* While döngüsü yardımı ile bir ATM programı yapmaya çalışalım.
    işlemler
    1.işlem=Bakiye öğrenme
    2.işlem=Para çekme
    3.işlem = Para yatırma
    çıkış=q
    */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bakiye = 1000;
        String islemler="1.işlem : Bakiye öğrenme \n" +
                "2.işlem : Para Çekme\n" +
                "3.işlem : Para Yatırma \n" +
                "4.işlem : Çıkış için q ya basın";
        System.out.println("***********************************************");
        System.out.println(islemler);
        System.out.println("***********************************************");

        while (true){
            System.out.println("Bir işlem seçiniz");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz :" + bakiye);

            }else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutar :");
                int tutar=scanner.nextInt();
                scanner.nextLine();

                if (bakiye-tutar<0){
                    System.out.println("Yeterli bakiye yok. Bakiyeniz :" + bakiye);
                }else {
                    bakiye = bakiye-tutar;
                    System.out.println("Yeni Bakiyeniz :" + bakiye);
                }

            }else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar :");
                int tutar=scanner.nextInt();
                scanner.nextLine();

                bakiye = bakiye+tutar;
                System.out.println("Yeni Bakiyeniz :" + bakiye);

            }else {
                System.out.println("Geçersiz işlem");
            }
        }



    }
}





















