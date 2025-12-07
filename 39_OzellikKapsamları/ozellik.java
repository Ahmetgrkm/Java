public class ozellik {
    public static void main(String[] args) {
        //KapsamSinifi ks = new KapsamSinifi();
        //ks.onileCarp(); //bu methodu çağırınca en localde olan değişkeni alır yani biz 10 vermiştik onu alır üstteki 30 u almaz
        //***********************************************************************************************************************************

        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();
        kapsam.onileCarp();
    }
}
