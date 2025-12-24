package IdmanProgramıLogOluşturma;

import java.io.FileWriter;
import java.io.IOException;
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

        int i =1;

        try(FileWriter writer = new FileWriter("log.txt")){
            writer.write("İdman Programı...\n");
            writer.write("Burpee Sayısı :" + i̇dman.getBurpee_sayisi() + " \n");
            writer.write("Pushup Sayısı :" + i̇dman.getPushup_sayisi() + " \n");
            writer.write("Situp Sayısı :" + i̇dman.getSitup_sayisi() + " \n");
            writer.write("Squat Sayısı :" + i̇dman.getSquat_sayisi() + " \n");



        while (i̇dman.idmanBittiMi()==false){
            System.out.println("Hareket Türü(burpee,pushup,situp,squat) :");
            String tur = sc.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız? :");
            int sayi = sc.nextInt();
            sc.nextLine();
            i̇dman.hareketYap(tur,sayi);

            writer.write(i+" .İşlem ------> Hareket: " + tur + " Sayı: " + sayi + " \n");
            i++;
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("İdmanı başarıyla bitirdin...");


    }
}












