import java.util.Scanner;

public class cok_boyutlu_arrayler {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6}; //tek boyutlu array
        int[][] array1 = new int[2][2]; //çok boyutlu array -> 2 ye 2 matris

        array1[0][0] = 10; //0.satırın 0.sütununa 10 değerini atadık.
        array1[0][1] = 20; //0.satırın 1.sütununa 20 değerini ekledik.
        array1[1][0] = 30; //1.satırın 0.sütununa 30 değerini ekledik
        array1[1][1] = 40; //1.satırın 1.sütununa 40 değerini ekledik

        int[][] array2 = {{10,20},{30,40}};

        //System.out.println(array2[0][1]);

        int[][] array3 = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array3[i][j] = sc.nextInt();
            }
        }
        System.out.println("***********************");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
