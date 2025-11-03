import java.util.Scanner;

public class TekCiftSayi {



    public static void TekCiftSayi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaça kadar olan sayıların içinden çiftler bulunsun istersiniz? :");
        int sayi = sc.nextInt();
        int toplam =0;
        int i =0;

        for (; i<=sayi; i++){
            if (i%2==0){
                System.out.println(i + " sayısı bir çift sayıdır" );
            }
            else{
                System.out.println(i + " sayısı tek sayıdır");
            }

        }


    }

    public  static void main(String[] args) {
        TekCiftSayi();
    }
}
