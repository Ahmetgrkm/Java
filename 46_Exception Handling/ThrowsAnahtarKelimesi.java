import java.io.IOException;
import java.util.Scanner;

public class ThrowsAnahtarKelimesi {
    public static void MekanKontrol(int yas) throws IOException { //checked bir method fırlattığımız için altta bunu yazmak zorundayız

        if (yas <18){
            throw new IOException();
        }
        else {
            System.out.println("Mekana hoşgeldiniz");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin :");
        int yas =  sc.nextInt();
        try {
            MekanKontrol(yas);
        }
        catch (IOException ex){
            System.out.println("IO exception oluştu");
        }



    }
}