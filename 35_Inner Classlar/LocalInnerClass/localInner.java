package LocalInnerClass;

public class localInner {
    public static void main(String[] args) {
        class Alan{
            public void daire_alan(int yaricap){
                System.out.println("daire Alanı :" + (yaricap*yaricap*Math.PI));
            }
        }
        Alan alan = new  Alan();
        Alan alan2 = new Alan();
        alan.daire_alan(5);
        alan2.daire_alan(3);
    }
    public static void deneme(){
        //Alan alan3 = new Alan(); şeklinde yazamayız çünkü yukarda yazdığımız class sadece o method içinde geçerlidir.
        //yani o method içinde tanımllanır ve method bitiminde yok olur.
    }
}
