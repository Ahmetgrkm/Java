package Ders_4_ATM_Projesi;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Ahmed","12345",2000);



        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
    }

}
