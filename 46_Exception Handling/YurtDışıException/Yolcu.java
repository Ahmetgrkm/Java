package YurtDışıException;

import YurtDışıÇıkışProgramı.YurtDisiKurallari;

import java.util.Scanner;

class SiyasiException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor...");
    }
}
class VizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Vizeniz bulunmamaktadır...");
    }
}
class HarcException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Lütfen harcı tam yatırın");
    }
}
public class Yolcu {
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


    public void yurtdisiHarciKontrol() throws HarcException {
        if (this.harc < 15) {
            throw new HarcException();
        }
        else {
            System.out.println("Harç işlemi tamam...");

        }
    }


    public void siyasiYasakKontrol() throws SiyasiException {
        if (this.siyasiYasak==true){
            throw new SiyasiException();
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor");

        }
    }


    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu==true){
            System.out.println("Vizeniz bulunuyor...");
        }
        else {
            throw new VizeException();

        }

    }
}














