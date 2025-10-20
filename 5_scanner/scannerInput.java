import java.util.Scanner;

public class scannerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();  //bu methodla kullanıcıdan int bir değer alırız.
        System.out.println("Yaşınız :" +yas);




        if (scanner.hasNextLine()) { // u yazdıüımız if ve i.indeki method eğer kullanıcı int yerine aşka birşey girerse diye koduğumuz koşul
            System.out.println("Lütfen sayınızı giriniz: ");
            double sayi = scanner.nextDouble(); //ondalıklı ir değer almamızı sağlar.
            System.out.println("girdiğiniz sayı: " +sayi);
            scanner.nextLine(); // int yada double girdikten sonra otomatik basılan enterı temizlememizi ve sonra stringi almamızı sağlar.
        }else {
            System.out.println("Lütfen bir sayı giriniz");
        }
        

        System.out.println("Lütfen bir kelime giriniz: ");
        String yazi = scanner.nextLine(); // kullanıcıdan string almamızı sağlar.
        System.out.println("Girdiğiniz kelime :" + yazi);
    }
}









