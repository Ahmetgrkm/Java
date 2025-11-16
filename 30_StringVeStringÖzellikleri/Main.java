public class Main {
    public static void main(String[] args) {
        String a = "Ahmed";

        String b = new String("Ahmed"); //bu şekilde de tanımlayabiliriz.

        System.out.println("Harf Sayısı :" + b.length()); //Stringin boyunu bize verir.

        System.out.println("0. indeks : " + a.charAt(0)); //içine girdiğimiz indeksin değerini yani o harfi verir.

        for (int i = 0; i < a.length(); i++) { // kelimenin indekseleri üzerinde gezinir ve her harfi yazdırır.
            System.out.println(i + " : " + a.charAt(i));
        }

        System.out.println(a.startsWith("du")); //Stringimiz du ile başlıyor mu aşlamıyor mu diye kontrol eder doğru ise true döndürür.
        System.out.println(a.endsWith("ed")); // Stringimiz ed ile başlıyor mu aşlamıyor mu diye kontrol eder doğru ise true döndürür.

        System.out.println(a.indexOf("e")); //baştan itibaren stringe bakar ilk gördüğü anda bize o indeksi verir.
        System.out.println(a.lastIndexOf("d")); //sondan başlayarak stringe bakar ve ilk gördüğü anda o indeksi verir.

        System.out.println(a.toLowerCase()); //stringin tüm büyük karakterlerini küçük yapar.
        System.out.println(a.toUpperCase()); // Stringin tüm küçük karakterini büyük yapar.

        String c = "1923";
        int d = Integer.parseInt(c); //Bir stringin içindeki tüm değerleri string türünden integera çevirmeyi sağlar.
        System.out.println(d);

        int k = 1923;
        String k1 = String.valueOf(k); //İnt değerdeki bir ifadeyi String türüne çevirir.
        System.out.println(k1);


    }
}
