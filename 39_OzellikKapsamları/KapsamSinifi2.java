public class KapsamSinifi2 {
    private int privateDegisken=30;

    public KapsamSinifi2(){

    }
    public void dahiliSinifControl(){
        DahiliSinif d =  new DahiliSinif();

        System.out.println("Kontrol ediliyor..." + d.a);
    }

    public class DahiliSinif{
        private int a = 3;


        //private int privateDegisken=20;    eğer bunu yazarsak(alttaki olmadan) 20 yi kullanır ancak yazmazsak KapsamSinifi2 nin özelliği olan 30 u kullanır.

        public void onileCarp(){

            int privateDegisken=10; // bunu yazarsak en localde olan 10 olduğu için 10 u kullanır.



            for (int i = 1; i <6; i++){
                System.out.println(i +  " * " + privateDegisken + " = " + (privateDegisken * i));

                System.out.println(i +  " * " + KapsamSinifi2.this.privateDegisken + " = " + (KapsamSinifi2.this.privateDegisken * i));
                /*yukardaki sout da eğer sadece this yazarsak Dahili sınıfın özelliğini kullanmak istediğimizi söyleriz eğer biz ana sınıfın yani
                KapsamSinifi2 nin özeliiğini kullanmak istersek yukardaki şekilde yapmalıyız.
                 */
            }
        }
    }

}
