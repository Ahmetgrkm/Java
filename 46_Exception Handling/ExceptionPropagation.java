public class ExceptionPropagation {
    public static void ucuncuFonksiyon(){
        try {


            int a = 12 / 0;
        }catch (ArithmeticException e){
            System.out.println("Sayı sıfıra bölünemez ");
        }
    }
    public static void ikinciFonksiyon(){
        ucuncuFonksiyon();
    }
    public static void birinciFonksiyon(){
        ikinciFonksiyon();
    }

    public static void main(String[] args) {
        birinciFonksiyon();
    }
}
