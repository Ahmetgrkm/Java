public class MakineMuhendisi implements I,ICalisma{ //Aynı class içinden 2 farklı interface bu şekilde implemente edilebilir ve methodları kullanılabilir.

    private boolean askerlik;
    private boolean adli_sicil_var_mı;

    public MakineMuhendisi(boolean adli_sicil_var_mi, boolean askerlik) {
        this.adli_sicil_var_mı = adli_sicil_var_mi;
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
        if (array.length == 0){
            System.out.println("Herhangi bir iş tecrübem yok");
        }
        else{
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım :");
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }
    }
    public void referansGetir(String[] array) {
        if (array.length == 0){
            System.out.println("Referansım yok");
        }
        else{
            System.out.println("Referanslarım :");
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine mühendisi çalışıyor...");
    }
}


















