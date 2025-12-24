import java.io.FileWriter;
import java.io.IOException;

public class FileWriterKonusu { //bu method sayesinde dosyamızı char'a dönüştürmeden direk yazmış oluruz uzun uzun uğraşmayız.
    public static void main(String[] args) {

        FileWriter writer = null; //eğer try catch içinde tanımlasaydık finally içinde kullanamazdık o yüzden önce dışarda null tanımladık.
        try {
            writer = new FileWriter("dosyawriter.txt",true); // bu true sayesinde yeni şeyleri öncekileri silmeden sona yazar.

            writer.write("Ahmed \n");
            writer.write("Görkem \n");
            writer.write("çalışkan \n");



        } catch (IOException e) {
            System.out.println("dosya açılırken IOException oluştu");
        }
        finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatılırken hata oluştu");
                }
            }
        }
    }
}
