public class methodsWithReturn {


    /*public static int toplama(int a, int d, int c){
        return (a+d+c);
    }
     */

    public static int ikiyleCarp(int a){
        return a*2;
    }

    public static int ikiyleTopla(int a){
        return a+2;
    }

    public static int dortleCarp(int a){
        return a*4;
    }

    public static void main(String[] args) {

        //System.out.println("çıkan sonuç :"+ toplama(1,2,3));

        System.out.println("Sonuç :" + dortleCarp(ikiyleTopla(ikiyleCarp(8))));

    }
}























