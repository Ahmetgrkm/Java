import java.util.Scanner;

public class ucgenHipotenus {
    //bir üçgenin hipotenüsünü bulan mini proje

    public static void main(String[] args) {
        //Hipotenüs = ((kısa kenar*kısa kenar) + (ortanca kenar*ortanca kenar))= (uzun kenar*uzun kenar)

        Scanner sc = new Scanner(System.in);
        System.out.println("Üçgenin kısa kenarını giriniz: ");
        int kisa = sc.nextInt();

        System.out.println("Üçgenin ortanca kenarını giriniz");
        int ortanca =sc.nextInt();

        double hipo = Math.sqrt((kisa*kisa) + (ortanca *ortanca));


        System.out.println("Üçgenin hipotenüsü " + hipo + " dur");
    }
}
