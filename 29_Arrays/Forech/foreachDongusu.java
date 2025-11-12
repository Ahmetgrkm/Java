package Forech;

public class foreachDongusu {
    public static void main(String[] args) {
        String array[] = {"elma", "armut", "Kiraz"};

        /*for (int i =0; i<array.length;i++) {
            System.out.println(array[i]);
            }
         */
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        for (int b : array2) {
            System.out.println(b);
        }


        for (String a : array) { //Burdaki a arrayimizin üzerinde dönerek tüm elemanlara tek tek sahip oluyor.
            System.out.println(a);
        }

        Deneme[] array3 = {new Deneme("Ahmet"), new Deneme("Görkem"), new Deneme("çalışkan")};
        for (Deneme d : array3) {
            d.yaz();
        }

    }
}

