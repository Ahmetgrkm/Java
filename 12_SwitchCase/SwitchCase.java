import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-4 arasında bir işlem seçiniz :");
        int islem = sc.nextInt();
        switch (islem) {
            case 1:
                System.out.println("1.işlemi seçtiniz");
                break;
            case 2:
                System.out.println("2.işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                break;
            case 4:
                System.out.println("4.işlem");
                break;
                default:
                    System.out.println("Geçersiz işlem");
        }
    }
}
