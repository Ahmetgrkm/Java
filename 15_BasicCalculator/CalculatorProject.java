import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("*****************************************");
        String islemler =
                "1. Toplama işlemi \n"+
                "2. Çıkarma işlemi\n"+
                "3. Çarpma işlemi \n"+
                "4. Bölme işlemi";
        System.out.println(islemler);
        System.out.println("*****************************************");

        System.out.println("Bir işlem seçiniz");

        String islem = sc.nextLine();
        int a;
        int b;

        switch (islem) {
            case "1":
                System.out.println("Birinci sayı :");
                a = sc.nextInt();
                System.out.println("İkinci sayı :");
                b = sc.nextInt();
                System.out.println("İşlem sonucu :" +(a+b));
                break;
            case "2":
                System.out.println("Birinci sayı :");
                a = sc.nextInt();
                System.out.println("İkinci sayı :");
                b = sc.nextInt();
                System.out.println("İşlem sonucu :" +(a-b));
                break;
            case "3":
                System.out.println("Birinci sayı :");
                a = sc.nextInt();
                System.out.println("İkinci sayı :");
                b = sc.nextInt();
                System.out.println("İşlem sonucu :" +(a*b));
                break;
            case "4":
                System.out.println("Birinci sayı :");
                a = sc.nextInt();
                System.out.println("İkinci sayı :");
                b = sc.nextInt();
                System.out.println("İşlem sonucu :" +((double)a/b));
                break;
                default:
                    System.out.println("Geçersiz işlem girdiniz.");
        }


    }
}






















