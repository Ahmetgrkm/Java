import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static int[] arrayi_doldur(int sayi){ //arrayin boyu ile ilgili sayi parametresini verdik
        Scanner sc = new Scanner(System.in);
        int[] cikti = new int[sayi];//Çıktı referansına boyutu sayı kadar olan dizi atadık ve bellekte yer açtık.

        for (int i = 0; i < sayi; i++) {
            System.out.print("Bir değer giriniz :");
            cikti[i] = sc.nextInt();
        }
        return cikti;

    }
    public static void arrayi_bastir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
    }
    public static void array_sort(int[] array){ // arrayi sıralamak için yazdığımız method(Arrays sınıfını kullanarak)
        Arrays.sort(array);
        arrayi_bastir(array);
    }


    public static void main(String[] args) {
        /*int[] c = arrayi_doldur(5);
        arrayi_bastir(c);
        System.out.println("*************SIRALANMIŞ HALİ************************************");
        array_sort(c);
        System.out.println("*****************************************************************");
         */
//**********************************************************************************************************************************************************
        int[] c1 = {1,2,3,4,5,6};
        int[] c2 = {1,2,3,4,5,6}; //Bunlar eşit değil çünkü belleğin farklı kısımlarında yer tutar farklı objeleri gösterir o yüzden eşit değillerdir.

//EĞER 2 DİZİNİN İÇERİĞİ AYNI MI DEĞİL Mİ BUNA BAKMAK İSTİYORSAK Arrays sınıfı içinden  equals i kulanırız

        if (Arrays.equals(c1, c2)) {
            System.out.println("Eşitler");
        }
        else{
            System.out.println("eşit değiller");
        }
    }
}
