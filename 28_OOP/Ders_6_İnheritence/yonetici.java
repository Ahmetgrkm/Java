package Ders_6_İnheritence;

public class yonetici  extends calisan {  //burası da alt sınıfımızdır yani "subclass"dır.

    private int sorumlu_kisi; //Extradan eklediğimiz özelliğimiz.


    public yonetici(String isim,int maas,String departman,int sorumlu_kisi) {
        /*this.isim=isim;
        this.maas=maas;
        this.departman=departman

Bu kısımda hata veriyor diyor ki sen private tanımladın öyle kafana göre erişemezsin diyor bu yüzden aşağıdaki gibi yapacağız ve dolaylı yoldan erişicez
calisan içindeki constructorı çağırmamız lazım YANİ SUPER KULLANMALIYIZ. Super demek şu demektir ben miras aldığım sınıfın constructorunu kullanmak istiyorum
demektir. Ve erişim hatasını ortadan kaldırır ki zaten bizim calisan sınıfımız superclass türü bir sınıf.
         */
        super(isim,maas,departman);
        this.sorumlu_kisi =sorumlu_kisi;
    }
    public void zamYap (int zam_miktari){  //Extradan yazdığımız method
        System.out.println("Çalışanlara " +zam_miktari +" kadar zam yapıldı");
    }
    /*
OVERRİDİNG = Eğer miras aldığımız methodları aynı isimle kendi classımızda da tanımlarsak yani extradan yazarsak kalıtım aldığımız yerdeki
değil kendi claassımızda aynı isimle bulunan çağrılır. Yani bu sayede superclassdaki methodu direk olarak iptal etmiş oluyoruz.
 */

    public void BilgileriGoster(){ //Override ettiğimiz method
        /*System.out.println("Sorumlu kisi sayısı :" +this.sorumlu_kisi);
        System.out.println("İsim :"+ getIsim());
        System.out.println("Maas :"+ getMaas());
        System.out.println("Departman :"+ getDepartman());
         */

        /*
Eğer biz hem normal methodu hemde kendi overriding yaptığımızı kullanmak istersek yani miras aldığımız methodu da kullanarak overriding etmek istersek
superclass içindeki bilgileri kullanmak istediğimizi extradan belirtmemiz gerekir ve şöyle yaparız.
         */
        super.BilgileriGoster();
        System.out.println("Sorumlu kisi sayısı :" +this.sorumlu_kisi);
    }
}














