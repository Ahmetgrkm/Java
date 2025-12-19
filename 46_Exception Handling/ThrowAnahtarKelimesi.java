
//Throw anahtar kelimesi ile lendi exceptionlarımızı fırlatabiliriz.

import java.util.Scanner;

public class ThrowAnahtarKelimesi {
    public static void mekanKontrol(int yas){

        if (yas <18){
            throw new ArithmeticException(); //yaş 18 den küçükse direk aritmetik exception fırlatır
        }
        else {
            System.out.println("Mekana hoşgeldiniz");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen ya1şınızı girin :");
        int yas =  sc.nextInt();
        try {
            mekanKontrol(yas);
        }
        catch (ArithmeticException e){
            System.out.println("18 yaşından küçükler mekana giremez...");
        }



    }
}
