package FileReaderBufferedReaderveWriter;

import java.io.*;
import java.util.Scanner;

public class okuyucular {
    public static void main(String[] args) {
        /* try(FileReader reader = new FileReader("ogrenciler.txt")){  !!! Bu şekilde read. şeklinde yazınca satır okumak için herhangi bir methodumuz bulunmuyor.
        Yani tek bir satırı \n görene kadar okuyarak git diyemiyoruz. Bunu demek için bu file reader ı scannner yardımı ile yazmalıyız.
        */

        //try( Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))){ //FileReader kullanımı

        //Eğer çok büyük bir dosya okuyorsak ve hızlı okunmasını istiyorsak bufferedReader kullanırız.
        try( Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){ //BufferedReader kullanımı


        while (scanner.hasNextLine()){ //hasNextLine methodu okuyacak herhangi birşey kaldı mı diye bakar
            //System.out.println("Okunan satır :" + scanner.nextLine()) ; bu sayede tüm dosyayı satır satır okuruz

            String ogrenci_bilgisi = scanner.nextLine();
            String[] array = ogrenci_bilgisi.split(","); //split methodu girilen değere göre parçalar ve dönen değeri array dizisine atarız.
            if (array[1].equals("Yazılım Mühendisliği")){ //bu sayede sadece yazılım okuyanları alabiliriz.
                System.out.println("Öğrenci bilgisi :" + ogrenci_bilgisi);
            }

        }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken hata oluştu");
        }

        // BufferedWriter
        /*try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))) {
            writer.write(" Abdurrahman,Yazılım Mühendisliği \n");
        } catch (IOException e) {
            System.out.println("Dosya açılırken hata oldu");
        }
         */
    }
}
