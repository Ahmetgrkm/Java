import java.util.Scanner;

public class UcgenYapimi {
    public static void main(String[] args) {
       int n = 6;
       for (int i = 1; i <= n; i++) { //satır sayısı
           for (int j = 1; j <= n-i; j++) { //boşluk sayısı
               System.out.print(" ");
           }
           for (int k = 1; k <= 2*i-1; k++) { //yıldız sayısı
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
