public class methodsOverloading {
    //bir fonksiyona birden fazla iş yüklemeye denir. aynı isimli fonksiyona farklı işler vermeye denir.

    public  static void toplama(int a,int c){
        System.out.println(a+c);
    }

    public static void toplama(int a, int d, int c){
        System.out.println(a+d+c);
    }

    public static void main(String[] args) {
        toplama(1,2,3);
        toplama(4,6);
    }
}
