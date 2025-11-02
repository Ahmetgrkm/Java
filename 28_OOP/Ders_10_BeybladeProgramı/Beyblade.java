package Ders_10_BeybladeProgramı;

public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int sadiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int sadiriGucu) {
        this.setBeybladeci(beybladeci);
        this.setDonusHizi(donusHizi);
        this.setSadiriGucu(sadiriGucu);
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSadiriGucu() {
        return sadiriGucu;
    }

    public void setSadiriGucu(int sadiriGucu) {
        this.sadiriGucu = sadiriGucu;
    }
    public void saldir(){
        System.out.println(beybladeci + " " + getDonusHizi() + " ve " + getSadiriGucu() + " ile saldırıyor.");
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beybladenin kutsal canavarı bulunmuyor.");
    }
    public void BilgileriGoster(){
        System.out.println("beyladeci ismi : " + beybladeci);
        System.out.println("Saldırı Gücü : " + sadiriGucu);
        System.out.println("Dönüş Hızı : " + donusHizi);

    }
}



















