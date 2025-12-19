import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamKonusu {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");

        try {
            fos = new FileOutputStream("dosya.txt",true); //bu true şunu sağlar dosyada bir içerik varsa yeni yazılanı sona ekler. dosya yoksa oluşturur

            fos.write(65); //ASCİİ ye göre yazar o değere karşılık gelen karakteri yazar
            fos.write(74);

            //byte[] array ={101,75,66,68};
            //fos.write(array); //bu şekilde byte arrayimizi yazdirabiliriz

            String s = "Ahmed görkem çalışkan";
            byte[] s_array = s.getBytes();// bu method string içindeki her karakteri bytelara dönüştürür.
            fos.write(s_array);




        } catch (FileNotFoundException e) {
            System.out.println("File not found exception oluştu");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken hata oluştu");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("dosya kapatılırken hata oluştu.");
            }
        }

    }
}
