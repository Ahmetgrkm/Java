package Ders_6_İnheritence;

//Ana sınıf olduğu için buraya "Superclass" veya "baseclass" denir.
public class calisan {
    private String isim;
    private int maas;
    private String departman;

    public calisan(String isim, int maas, String departman) {
        this.setIsim(isim);
        this.setMaas(maas);
        this.setDepartman(departman);
    }
    public void calis(){
        System.out.println("Çalışan çalışıyor...");
    }
    public void BilgileriGoster(){
        System.out.println("İsim :"+ getIsim());
        System.out.println("Maas :"+ getMaas());
        System.out.println("Departman :"+ getDepartman());
    }
    public void departmanDegis(String yeni_departman){
        System.out.println("Departman değiştiriliyor...");
        this.setDepartman(yeni_departman);
        System.out.println("Yeni depatman"+ getDepartman());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
