import java.util.Scanner;

public class kullanici_girisi {

    //While döngüsü yardımı ile kullanıcı girişi yazma programı

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int giris_hakki=3;

        String sys_kullanici_adi = "ahmed";
        String sys_parola="12345";

        System.out.println("***************************");
        System.out.println("KULLANICI GİRİŞİNE HOŞGELDİNİZ");
        System.out.println("***************************");

        while(true){
            System.out.print("Kullanıcı adı :");
            String kullanici =  scanner.nextLine();
            System.out.print("Parola :");
            String parola =  scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("SİSTEME HOŞGELDİNİZ :"+kullanici);
                break;
            }else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolayı yanlış girdiniz");
                giris_hakki-=1;
                System.out.println("Kalan giriş hakkınız :" + giris_hakki);
            }else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı adınız yanlış girdiniz");
                giris_hakki-=1;
                System.out.println("Kalan giriş hakkınız :" + giris_hakki);
            } else {
                System.out.println("Kullanıcı adınız ve parolanız yanlış");
                giris_hakki=giris_hakki-1;
                System.out.println("Kalan giriş hakkınız :" + giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("!!!!!!!!!3 kere yanlış girdiniz SİSTEM BLOKE OLDU!!!!!!\n" +
                        "SİSTEMDEN ÇIKILIYOR");
                break;
            }
        }
    }
}



















