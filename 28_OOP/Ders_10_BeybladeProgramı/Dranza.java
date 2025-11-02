package Ders_10_BeybladeProgramı;

public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int sadiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, sadiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();

        System.out.println("Kutsal canavar adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + " saldırısı:  alev kılıcı");
    }
}
