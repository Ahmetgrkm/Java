import java.util.Scanner;

public class ebobBulma {

    //Kullanıcıdan alınan iki sayının ebobunu bulma

    public static int ebob(int sayi1,int sayi2){
        int ebob=1;

        for (int i =1; i<=sayi1 && i<=sayi2;i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        return ebob;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayı :");
        int birinci = sc.nextInt();

        System.out.print("İkinci sayı :");
        int ikinci = sc.nextInt();

        System.out.println("İki sayının ebobu :" + ebob(birinci,ikinci));
    }
}
