import java.util.ArrayList;

public class LinkedList1 {
    public static void main(String[] args) {
        ArrayList<String> diller = new ArrayList<String>();

        diller.add("Java");
        diller.add("PHP");
        diller.add("C#");
        diller.add("Kotlin");
        diller.add("Python");

        for (String s : diller) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        diller.add(1,"C++");

        for (String s : diller) {
            System.out.println(s);
        }

    }
}
