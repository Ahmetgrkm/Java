import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        try(FileWriter writer1 = new FileWriter("dosyaTryWith.txt")) { /*bu kullanım sayesinde kapatma kodlarını yazmadan direk try with resources kullanarak
        kapatma işlerini yaptık o kendi içinde closable interfaceini kullanarak otomatik olarak kapatma işlemini yapar. Eğer birden çok dosya açmak istersek
        FileWriter writer1 = new FileWriter("dosyaTryWith2.txt") şeklinde yazarız*/

            Scanner sc = new Scanner(System.in);
            String dil;
            while (true){
                System.out.println("Bir dil giriniz :");
                dil=sc.nextLine();

                if(dil.equals("-1")){
                    System.out.println("Program kapatılıyor");
                    System.out.println("Dosyayı kontrol edin");
                    break;
                }
                else {
                    writer1.write(dil + "\n");
                }
            }





        } catch (IOException e) {
            System.out.println("dosya oluşturulurken hata oluştu");
        } ;

    }
}
