package Ders_10_BeybladeProgramı;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;
    public Dragon(String beybladeci, int donusHizi, int sadiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, sadiriGucu);
        this.gizliYetenek = gizliYetenek;
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Kutsal canavar adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + " saldırısı:  Hayalet Kasırga");
    }
}
