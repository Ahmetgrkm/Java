package staticInnerClass;

public class Matematik {

    private double PI= Math.PI;
    public static class Alan{ // classı static tanımladığımız için matematikten obje oluşturmadan kullanabiliriz.
        public  void daire_alan(int yaricap){
            System.out.println("Alan daire :" + (yaricap*yaricap*Math.PI));
        }

    }
}
