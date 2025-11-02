import java.util.Scanner;

public class calculator2 {

    /*
    Method overloading kullanarak gelişmiş bir hesap makinası geliştirelim.
    Toplama ve çarpma işlemlerini 2 veya 3 parametreli olacak şekilde tasarlayın.
     */

    public static int cikarma(int a,int b){
        return(a-b);
    }
    public static double bolme(int a,int b){
        return (double) (a/b);
    }
    public static int toplama(int a,int c){
        return a+c;
    }
    public static int toplama(int a,int c,int d){
        return a+c+d;
    }
    public static int carpma(int a,int c){
        return a*c;
    }
    public static int carpma(int a,int c,int d){
        return a*c*d;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String islemler ="1. Toplama \n" +
                "2.Çıkarma\n" +
                "3.Çarpma\n" +
                "4.Bölme\n" +
                "ÇIKIŞ İÇİN q YA BASIN";
        System.out.println("****************************************************");
        System.out.println(islemler);
        System.out.println("****************************************************");

        while (true){
            System.out.print("İşlemi seçiniz :");
            String islem = sc.nextLine();
            if (islem.equals("q")){
                System.out.println("programdan çıkılıyor...");
                break;
            }else if (islem.equals("1")){
                System.out.print("Kaç değer toplayacaksınız? (2 veya 3)");

                int kacSayi = sc.nextInt();

                if (kacSayi == 2) {
                    System.out.print("a :");
                    int a = sc.nextInt();
                    System.out.print("b :");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Girilen sayıların toplamları :" + toplama(a,b));

                }else if (kacSayi == 3) {
                    System.out.print("a : ");
                    int a = sc.nextInt();
                    System.out.print("b : ");
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Girilen sayıların toplamı : " + toplama(a,b,c));
                }

                else {
                    System.out.println("Bunun için uygun method bulunmuyor.");
                }
            }
            else if (islem.equals("2")){
                System.out.print("a : ");
                int a = sc.nextInt();
                System.out.print("b : ");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println("Çıkarma işlemi sonucu :"+ cikarma(a,b));
            }
            else if (islem.equals("3")){
                System.out.println("Kaç sayı giriceksiniz yazınız(2 veya 3) :");
                int kacSayi = sc.nextInt();
                if (kacSayi == 2) {
                    System.out.print("a :");
                    int a = sc.nextInt();
                    System.out.print("b :");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Girilen sayıların çarpımı :" +carpma(a,b));
                }else if (kacSayi == 3) {
                    System.out.print("a : ");
                    int a = sc.nextInt();
                    System.out.print("b : ");
                    int b = sc.nextInt();
                    System.out.print("c :");
                    int c = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Girilen sayıların çarpımı :" +carpma(a,b,c));
                }else {
                    System.out.println("bunun için uygun method bulunmuyor.");
                }

            }else if (islem.equals("4")){
                System.out.print("a : ");
                int a = sc.nextInt();
                System.out.print("b : ");
                int b = sc.nextInt();
                sc.nextLine();
                if (b!=0) {
                    System.out.println("Girilen sayıların bölümü" + bolme(a, b));
                }
                else {
                    System.out.println("payda 0 olamaz.");
                }
            }
            else  {
                System.out.println("Geçersiz işlem seçtiniz");
            }

        }
    }

}

















