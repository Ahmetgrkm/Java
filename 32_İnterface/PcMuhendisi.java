//İnterface içinde yazdığımız tüm imza methodları burda kulanmak zorundayız o yüzden sağ tıklayıp generate e basıp implements method yapmalıyız.

public class PcMuhendisi implements I{
    private boolean askerlik;
    private boolean adli_sicil_var_mı;

    public PcMuhendisi(boolean adli_sicil_var_mı, boolean askerlik) {
        this.adli_sicil_var_mı = adli_sicil_var_mı;
        this.askerlik = askerlik;
    }

    @Override
    public void adli_sicil() {
        if (adli_sicil_var_mı){
            System.out.println("adli sicil kaydım var");
        }
        else{
            System.out.println("Adli sicilim temiz");
        }
    }

    @Override
    public void askerlik_durumu() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım");
        }
        else {
            System.out.println("Askerliğimi henüz yapmadım");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam :" + derece;
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak Şu şirketlerde çalıştım...");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

















