package Matematik_Fizik_Problemleri;

public class Problem {
    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("Dairenin alanı :" + (yaricap*yaricap*Math.PI));
        }
        public static void ucgen_cevresi(int kenar1, int kenar2, int kenar3){
            System.out.println("Üçgen Çevresi :" + (kenar1+kenar2+kenar3));
        }
    }

    public static class Fizik{
        public static void ic_carpim(vek vek1,vek vek2){
            int iccarpim = vek1.getI()*vek2.getI() + vek1.getJ()*vek2.getJ() + vek1.getK()*vek2.getK();
            System.out.println(vek1.getIsim() + " ile " +vek2.getIsim() + " in iç çarpımı = " +  iccarpim );
        }
    }
}
