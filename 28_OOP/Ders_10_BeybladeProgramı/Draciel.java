package Ders_10_BeybladeProgramı;

public class Draciel extends Beyblade{
    private String kutsalCanavar;
    public Draciel(String beybladeci, int donusHizi, int sadiriGucu , String kutsalCanavar) {
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
        System.out.println(getBeybladeci() + " savunnması:  Kale Savunması");
    }
}
