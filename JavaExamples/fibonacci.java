import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = sc.nextInt();
        int a = 0;
        int b = 1;
        int n = 1;

        System.out.println(a);
        System.out.println(b);

        while (n <= (sayi-2)) {
            int temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
            n++;
        }
    }
}
