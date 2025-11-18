public class interface1 {
    public static void main(String[] args) {
        PcMuhendisi muhendis1 = new PcMuhendisi(false,false);
        muhendis1.askerlik_durumu();
        muhendis1.adli_sicil();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel" ,"havelsan","arçelik"};
        muhendis1.is_tecrubesi(tecrube);
    }
}
