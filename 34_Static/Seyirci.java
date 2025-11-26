public class Seyirci {
    private String isim;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++; //her obje oluştuğunda seyirci sayımız 1 artar
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void oyun_seyret(){
        System.out.println( getIsim() +"  oyun seyrediyor...");
    }
    private static int seyirci_sayisi = 0;

    public static int getSeyirci_sayisi() {
        return seyirci_sayisi;
    }
}
