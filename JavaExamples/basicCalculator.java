import java.util.Scanner;

public class basicCalculator {

    public static int toplama(int a,int b){
        return a+b;
    }
    public static int cikarma(int a,int b){
        return a-b;
    }
    public static int carpma(int a,int b){
        return a*b;
    }
    public static double bolme (int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesap makinasına hoşgeldiniz......");
        String islemler = "1.TOPLAMA\n" +
                "2.ÇIKARMA\n" +
                "3.ÇARPMA\n" +
                "4.BÖLME";
        System.out.println(islemler);
        System.out.println("Birinci sayıyı giriniz :");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int b = sc.nextInt();
        System.out.print("Bir işlem seçiniz :");
        int secim = sc.nextInt();
            if (secim == 1) {
                System.out.println(toplama(a, b));
            } else if (secim == 2) {
                System.out.println(cikarma(a, b));
            } else if (secim == 3) {
                System.out.println(carpma(a, b));
            } else if (secim == 4) {
                if (b!=0){
                    System.out.println(bolme(a, b));
                }else {
                    System.out.println("b sayısı 0 olamaz!");
                }

            } else {
                System.out.println("Geçersiz bir işlem girdiniz");
            }
        }
    }
















