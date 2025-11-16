import java.util.ArrayList;

public class TersDizi {
    public static void main(String[] args) {

        int[] dizi = {1,2,3,4,5};

        ArrayList<Integer> ters_dizi = new ArrayList<>(dizi.length);

        for (int i = dizi.length - 1; i >= 0; i--) {
            ters_dizi.add(dizi[i]);
        }

        System.out.println(ters_dizi);
    }
}
