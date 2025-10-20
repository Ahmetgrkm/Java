import java.util.Scanner;

public class IfElseConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = sc.nextInt();

        if (yas < 18) {
            System.out.println("Bu mekana giremezsiniz");
        } else {
            System.out.println("Bu mekana girebilirsiniz");
        }
    }
}
