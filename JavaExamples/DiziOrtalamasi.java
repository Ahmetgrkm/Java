import java.util.Scanner;

public class DiziOrtalamasi {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz :");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i+1)+ ". elemanı giriniz :");
            numbers[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double result = sum/numbers.length;
        System.out.println("Dizideki elemanların ortalaması : " + result);
    }
}
