public class TryVeCatchBloklari {
    public static void main(String[] args) {
        //int a = 30/0; //unchecked Exception
        //int[] dizi = {1,2,3,4,5};
        //System.out.println(dizi[6])



       /* try {
           Exception oluşturabilecek kodlar
        }
        catch (Exception_Türü e) {
            Exception durumunda yapılacak olan işlemler
        }

        */


        try {
            //int a = 30/0; //AritmeticException
            int[] a = {1,2,3,4,5};
            System.out.println(a[20]);

            int b = 30/0; //eğer farklı hata türü varsa birden çok catch bloğu yazarak hatalarımızı yakalamalıyız.
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0 a bölünemez.");
        }
        catch (Exception e){ //buraya aritmeticException da yazsak exceptiom da yazsak fark etmez çünkü zaten aritmeticException exceptiondan türüyor.
            System.out.println("Bir hata oluştu");
            e.printStackTrace(); //java kısmında hatanın ne olduğunu bize söyler.

            //eğer farklı catch blokları yazacaksak özelden genele doğru yazmalıyız örneğin exceptionu üste aritmeticEcxeptionu alta yazarsak hata verir

        }

        System.out.println("Burası çalışıyor mu?");
    }
}
