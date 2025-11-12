import java.util.Scanner;

public class arrays {

    //Dizileri methodlara gönderme şöyle olur:
    public static void arrayi_bastir(int[] array){ //parantez içinde arrayi verdik parametre olarak ki şunu dedik sana bir arrayi vercez üzerinde işlem yap.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
    }

    public static void main(String[] args) {
//**********************************************************************************************************************
        //int [] a = new int[10]; // 10 değer depolayan dizi
        /*a[5]=10;
        a[10]=32;  Bu şekilde uzun uzun tek tek her indekse değer vermek olmaz
         */


        /*int [] a = {30,40,50,60,70};
        for (int i=0; i<5; i++){  //burda i<a.length yaparsak daha güzel olur dizi boyutu kadar döner.
            System.out.println(a[i]);
        }

         */
        /*Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        for (int i = 0; i < a.length; i++) { //Bu şekilde dizi elemanlarını kullanıcıdan alabiliriz.
            a[i] = sc.nextInt();
        }
         */
//**********************************************************************************************************************
        int [] a = new int[5];
        int [] b = {10, 20, 30, 40, 50};
        //System.out.println(a.length); //arrayimizin uzunluğunu bulmamızı sağlar.
        //System.out.println(b.length);
        arrayi_bastir(b);

//**********************************************************************************************************************
    }
}



























