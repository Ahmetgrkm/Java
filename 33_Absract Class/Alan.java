public class Alan {
    public static void main(String[] args) {

        //Sekil sekil = new Sekil() şeklinde Sekil sınıfından obje oluşturamayız çünkü o absract bir class.

        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1",3);

        kare1.alan_hesapla();
        daire1.alan_hesapla();

        Sekil sekil;
        sekil = new Kare("Kare2",6); //Absract sınıfından bir referans ürettik ve alt sınıflara direk referans olarak eşitlenebilir.
        sekil.alan_hesapla();
        kare1.cevre_hesapla();

    }
}
