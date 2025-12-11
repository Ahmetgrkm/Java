public class Hasta implements Comparable<Hasta>{
    private String isim;
    private String sikayet;

    private int oncelik;
    
    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        this.oncelik = oncelik;
        
        if (sikayet.equals("Apandisit")){
            this.oncelik=3;
        } else if (sikayet.equals("Yanık")) {
            this.oncelik=2;
        }
        else {
            this.oncelik=1;
        }
    }

    @Override
    public String toString() {
        String bilgiler ="Hasta adı :" + isim +
        "\n Şikayet :" + sikayet +
        "\n Öncelik :" + oncelik;

        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {
        if (this.oncelik > hasta.oncelik) {
            return -1; //hastalığı öne geçirmek için -1 dedik
        }
        if (this.oncelik < hasta.oncelik) {
            return 1; //1 yazarak bu hastalığı arkalara attık.
        }
        return 0; //kim önde gelmişse o kullanılır
    }
}


















