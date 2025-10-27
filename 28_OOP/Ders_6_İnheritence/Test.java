package Ders_6_İnheritence;

public class Test {
    //İnheritence de "İS A" ilişkisi sağlar.

    public static void main(String[] args) {
        yonetici yonetici1 = new yonetici("ahmed",2500,"it",10);
        yonetici1.BilgileriGoster();
        //yonetici1.zamYap(100);
    }
}
