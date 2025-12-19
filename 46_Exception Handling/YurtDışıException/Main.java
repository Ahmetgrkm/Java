package YurtDışıException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Havaalanına hoşgeldiniz.....");
        String sartlar = "Yurt Dışı Çıkış Kuralları \n" +
                "Herhangi bir siyasi yasağınız olmamalı\n" +
                "Harç bedelinizi tam olarak yatırmalısınız\n" +
                "Gideceğiniz ülkeye vizenizin bulunması gerekir";

        String message ="Yurt dışı şartlarından hepsini eksiksiz sağlamalısınız.";

        while (true){
            System.out.println("**********************************");
            System.out.println(sartlar);
            System.out.println("***********************************");


            Yolcu yolcu = new Yolcu();
            System.out.println("Harç Bedeli Kontrol ediliyor....");
            Thread.sleep(3000); //Programı 3 sn ye bekletir.
            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }


            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                continue;
            }


            System.out.println("Vize Durumu kontrol ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("İşlemleriniz tamam! Yurt Dışına çıkabilirsiniz.");
            break;
        }

    }
}
