public class interface1 {
    public static void main(String[] args) {
        PcMuhendisi muhendis1 = new PcMuhendisi(false,false);
        muhendis1.askerlik_durumu();
        muhendis1.adli_sicil();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel" ,"havelsan","arçelik"};
        muhendis1.is_tecrubesi(tecrube);

        System.out.println("--------------------------------------------------------------------------------");

        MakineMuhendisi muhendis2 = new MakineMuhendisi(false,true);
        String[] tecrube2 = {};
        String[] referans = {"Ahmet ","GÖrkem"};
        muhendis2.askerlik_durumu();
        muhendis2.adli_sicil();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.30));
        muhendis2.is_tecrubesi(tecrube2);
        muhendis2.referansGetir(referans);
        muhendis2.calis();
    }
}
