package staticInnerClass;

public class stInner {
    public static void main(String[] args) {
        Matematik.Alan alan = new Matematik.Alan(); //statik olduğu için Matematik classından oluşturmamıza gerek kalmıyo.
        alan.daire_alan(5);

        /*Matematik.Alan.daire_alan(3); eğer methodumuzu static yazarsak Şeklinde de tanımlayabiliriz Methodu static yazarsak
        extra obje oluşturmamıza gerek kalmadan yazabiliriz.
         */

    }
}
