import java.util.Scanner;

public class ElseIfConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz");
        int yas = sc.nextInt();

        if (yas < 18) {
            System.out.println("Bu mekana giremezsiniz");
        } else if (yas > 18 && yas < 35) {
            System.out.println("Bu mekana girebilirsiniz");
        }else {
            System.out.println("Bu mekan için çok yaşlısınız");
        }
    }
}
