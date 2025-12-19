package KendiExceptionClassimiz;

import java.util.Scanner;

public class HataYakala {
    public static void mekan_kontrol(int yas){
        if (yas<18){
            throw new IllegalArgumentException("Invalid Age");
        }
        else {
            System.out.println("mekana hoşgeldiniz");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı girin :");
        int yas = sc.nextInt();
        try {
            mekan_kontrol(yas);
        }catch (InvalidAgeException e){
            e.printStackTrace();
        }


    }
}
