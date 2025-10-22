public class carpim {

    //iç içe for döngüsü ile çarpım tablosu oluşurma

    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println("**********************************************");
            for (int j=1; j<=10; j++) {
                System.out.println(i+"x"+j+ "=" + (i*j));
                if (j==10){
                    System.out.print("\n");
                }

            }
        }
    }
}
