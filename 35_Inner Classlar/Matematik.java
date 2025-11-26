import java.util.Scanner;

public class Matematik { // bu bizim çerçeve classımızdır ve inner classları burda yazarız.
    private double pi= Math.PI;

    public class Factoriyel{ //bu bizim inner classımızdır.
        public void faktoriyel(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Bir sayı giriniz :");
            int sayi = sc.nextInt();
            int fakt = 1;

            for (int i = 2; i <= sayi; i++) {
                fakt *= i;
            }
            System.out.println("Faktöriyel :" +fakt);
        }

    }
    public class Asal{
        public boolean asal_mi(int sayi){
            int i = 2;
            while(i<sayi){
                if (sayi%i==0){
                    return false;

                }
                i++;
            }
            return true;
        }
    }
    public class Alan{
        public void daire_alan(int yaricap){
            System.out.println("Daire alanı: "+ (yaricap*yaricap*pi));
        }
    }
}














