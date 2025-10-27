package Ders_3_Constructorlar;

public class Account {

    private String HesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;



    public Account() {
        //System.out.println("Kendi yazdığımız contsturctor.....");

        /*this.HesapNo = "Bilgi Yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi Yok";
        this.email = "Bilgi Yok";
        this.telefonNo = "Bilgi Yok"; //Bu şekilde bilgilerimize varsıyalan değerimizi girmiş oluruz.
         */

        //Eğer tek tek tanımlamak istemezsek yukardaki gibi bir constructoru çağırmak  için şöyle yaparız.
        this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");


    }
    public Account(String isim, String email, String telefonNo) {
        /*this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

        this.bakiye = 0.0;
        this.HesapNo = "Bilgi Yok"; Bu şekilde de yapabiliriz yine aşağıdaki gibi başka bir contructor da çağırabiliriz.
         */
        this("Bilgi Yok",0.0,isim,email,telefonNo);
    }



    public Account(String HesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.HesapNo = HesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }


    public void paraYatirma(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiye : " + bakiye);
    }

    public void paraCekme(double miktar){
        if (miktar > 1500){
            System.out.println("bir günde 1500 den fazla para çekemezsiniz");
        }
        if (bakiye-miktar<0){
            System.out.println("Yeterli bakiye yok!! Bakiyeniz :" + bakiye);
        }else {
            bakiye-=miktar;
            System.out.println("Yeni bakiye : " + bakiye);
        }
    }

    public void BilgileriGoster() {
        System.out.println("Hesap No : " + this.HesapNo);
        System.out.println("Bakiye : " + this.bakiye);
        System.out.println("Isim : " + this.isim);
        System.out.println("Email : " + this.email);
        System.out.println("TelefonNo : " + this.telefonNo);
    }


    public String getHesapNo() {
        return HesapNo;
    }

    public void setHesapNo(String hesapNo) {
        HesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
