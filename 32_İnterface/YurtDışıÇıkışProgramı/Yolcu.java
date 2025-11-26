package YurtDışıÇıkışProgramı;

import java.util.Scanner;

public class Yolcu  implements YurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli :");
        this.harc = sc.nextInt();
        sc.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu?(evet-hayır) :");
        String cevap = sc.nextLine();
        if (cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else{
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu?(evet-hayır) :");
        String cevap2 = sc.nextLine();
        if (cevap2.equals("evet")){
            this.vizeDurumu = true;
        }
        else{
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lütfen harı tam yatırın...");
            return false;
        }
        else {
            System.out.println("Harç işlemi tamam...");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız var yurt dışına çıkamazsınız");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu==true){
            System.out.println("vize işlemleri tamam");
            return true;
        }
        else {
            System.out.println("Vizeniz bulunmuyor");
            return false;
        }

    }
}














