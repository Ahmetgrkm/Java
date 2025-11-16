public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] dizi = {{1,2,3},{4,5,6}};
        int satir = 2;
        int sutun = 3;

        System.out.println("Matrisin kendisi:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*************************");
        System.out.println("Matrisin transpozu:");

        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = dizi[j][i];
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
