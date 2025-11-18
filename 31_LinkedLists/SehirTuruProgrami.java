import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuruProgrami {
    public static void sehir_turla(LinkedList<String> sehirler) {
        ListIterator<String> it = sehirler.listIterator();
        int islem;
        islemleri_bastir();

        Scanner sc = new Scanner(System.in);

        if (!it.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor");
        }
        boolean cikisi = false;
        boolean ileri = true;
        while (!cikisi) {
            System.out.println("Bir işlem seçiniz(0-4) :");
            islem = sc.nextInt();

            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if (it.hasNext()) {
                        if (!ileri) { /*Bu kontrolü şundan dolayı yaptık biz hangi adımdaysak iteratorumuz bir sonraki adımı gösterir ve biz geri gittiğimizde yani
                        bir ileri bir geri gittiğimizde tekrar kendi yerine gelir. Bu yüzden bu kontrolü yaptık.*/

                            if (it.hasNext()) {
                                it.next();
                            }
                            ileri = true;
                        }
                        System.out.println("Şehre gidiliyor..." + it.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı...");
                        ileri = true;
                    }
                    break;


                case 2:
                    if (it.hasPrevious()) {
                        if (ileri) {
                            if (it.hasPrevious()) {
                                it.previous();
                            }
                            ileri = false;
                        }
                        System.out.println("Önceki şehre gidiliyor..." + it.previous());
                    }
                    else {
                        System.out.println("Geriye dönülecek şehir kalmadı...");
                    }
                    break;

                case 3:
                    cikisi = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }
        }
    }

    public static void islemleri_bastir() {
        System.out.println("0: Tekrardan işlemleri görüntüle...");
        System.out.println("1: Bir sonraki şehre git...");
        System.out.println("2: Bir önceki şehre git...");
        System.out.println("3: uygulamadan çık...");
    }

    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");

        sehir_turla(sehirler);
    }
}
