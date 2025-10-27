package Ders_5_İdmanProgramı_Projesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("İdman Programına hoşgeldiniz...");

        String idmanlar = "Geçerli hareketler...\n" +
                "Burpee\n" +
                "Pushup(şınav\n" +
                "Situp(mekik)\n" +
                "Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee sayısı :");
        int burpee = sc.nextInt();

        System.out.println("Pushup sayısı :");
        int pushup = sc.nextInt();

        System.out.println("Situp sayısı :");
        int situp = sc.nextInt();

        System.out.println("squat sayısı :");
        int squat = sc.nextInt();
        sc.nextLine();

        İdman i̇dman = new İdman(burpee,pushup,situp,squat);

        System.out.println("İdmanınız başlıyor......");

        while (i̇dman.idmanBittiMi()==false){
            System.out.println("Hareket Türü(burpee,pushup,situp,squat) :");
            String tur = sc.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız? :");
            int sayi = sc.nextInt();
            sc.nextLine();
            i̇dman.hareketYap(tur,sayi);
        }
        System.out.println("İdmanı başarıyla bitirdin...");


    }
}












