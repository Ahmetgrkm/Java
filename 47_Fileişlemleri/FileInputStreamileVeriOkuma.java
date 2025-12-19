import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamileVeriOkuma {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosyaVeriOkuma.txt");

            /*System.out.println("Birinci karakter :" + (char)(fis.read())); //bir karakteri yani bir byte'ı alır ve char halini gösterir.
            System.out.println("İkinci karakter :" + (char)(fis.read()));
            System.out.println("Üçüncü karakter :" + (char)(fis.read()));
             */


            /*fis.skip(5);// gönderdiğimiz değer kadar karakter atlatır yani imleci kaydırır
            System.out.println("Sonraki karakter :" + (char)(fis.read()));  // yani burda P harfini okur imleci 5 kere kaydırıp sonrakini aldığı için
            System.out.println("Bir sonraki karakter :" + (char)(fis.read()));
             */


            int deger;
            String s = "";

            /*while ((deger = fis.read()) != -1){ //bu döngü sayesinde tüm dosya içeriğini okuyabiliriz
                s += (char)deger; // her bir karakteri char'a dönüştürüp string değerimize ekledik

            }
            System.out.println("DOsya içeriği :" + s);
             */

            int say=0;

            fis.skip(5);
            while ((deger = fis.read()) != -1) { //alttaki yapı sayesinde istediğimiz yerdeki karakterden itibaren geri kalanını ve istediğimiz karakter sayısını okuyabiliriz
                s += (char)deger;
                say++;
                if (say == 10) {
                    break;
                }
            }
            System.out.println("Dosyanın 5. yerinden itibaren 10 karakter :" + s);





        } catch (FileNotFoundException e) {
            System.out.println("File not found hatası");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }

            } catch (IOException e) {
                System.out.println("dosya kapatılırken hata oluştu");
            }
        }
    }
}
