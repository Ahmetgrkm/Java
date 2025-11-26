public class Static {
    public static void main(String[] args) {
        Seyirci seyirci1 = new Seyirci("Ahmed");
        Seyirci seyirci2 = new Seyirci("Görkem Çalışkan");

        seyirci1.oyun_seyret();
        seyirci2.oyun_seyret();
        System.out.println("Seyirci sayımız :" + Seyirci.getSeyirci_sayisi()); //static tanımladığımız için direk sınıf ismi üzeründen erişebildik.
        System.out.println("Seyirci sayımız :" + seyirci1.getSeyirci_sayisi()); //istersek obje üzeründen de erişebiliriz.

        /*System.out.println("Seyirci sayımız :" + Seyirci.seyirci_sayisi); // biz değiştirip private yaptığımız için ve non static yaptığımız için direk sınıf üzerinden
        erişemeyiz. Ama eğer methodumuzu static şeklinde yazarsak yine get methodu ile sınıf üzerinden erişebiliriz.
         */

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------");

        /*selamla(); //static olan bir methoddan static olmayan bir methodu çağıramazsın diye uyarı verir. Bunu çağırmak için onu da static yapmalıyız ki
        program çalıştığında direk oluşsun ve biz kullanabilelim. Selamla2 gibi tanımlarsak kullanırız.
         */

        selamla2();

    }
    public void selamla(){
        System.out.println("Selam");
    }
    public static void selamla2(){
        System.out.println("Selamlar");
    }
}
