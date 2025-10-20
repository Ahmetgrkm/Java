import java.util.Scanner;

public class KM {

    //Bir aracın km başına ne kadar yakıt yaktığını ve kaç km yol yaptığını alan ve sürücünün ne kadar ödemesi gerektiğini ulan mini proje

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Kaç km yol gittiğinizi yazınız: ");
        double yol = sc.nextDouble();

        System.out.print("Aracınız km başına kaç kuruş yakıyor: ");
        double yakit = sc.nextDouble();

        System.out.println("Toplam ödemeniz gereken tutar " + (yol*yakit) + "TL dir");

    }
}
