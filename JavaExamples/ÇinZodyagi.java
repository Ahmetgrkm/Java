import java.util.Scanner;

public class ÇinZodyagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz :");
        int age = sc.nextInt();
        int result = age % 12;
        String aciklama = "Çin Zodyagi burcunuz :";
        switch (result) {
            case 0:
                System.out.println(aciklama +  "Maymun");
                break;
            case 1:
                System.out.println(aciklama +  "Horoz");
                break;
            case 2:
                System.out.println(aciklama + "Köpek");
                break;
            case 3:
                System.out.println(aciklama +  "Domuz");
                break;
            case 4:
                System.out.println(aciklama +  "Fare");
                break;
            case 5:
                System.out.println(aciklama +  "Öküz");
                break;
            case 6:
                System.out.println(aciklama +  "Kaplan");
                break;
            case 7:
                System.out.println(aciklama +  "Tavşan");
                break;
            case 8:
                System.out.println(aciklama +  "Ejderha");
                break;
            case 9:
                System.out.println(aciklama +  "Yılan");
                break;
            case 10:
                System.out.println(aciklama +  "At");
                break;
            case 11:
                System.out.println(aciklama +  "Koyun");
                break;
            default:
                System.out.println("Yanlış değer girdiniz!!");


        }
    }
}
