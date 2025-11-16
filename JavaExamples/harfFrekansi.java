import java.util.Scanner;

public class harfFrekansi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Kullanıcıdan cümleyi al
        System.out.print("Bir cümle giriniz: ");
        String cumle = sc.nextLine();

        int uzunluk = cumle.length();
        char[] harfler = new char[uzunluk]; // her karakteri alacağız
        int[] tekrar = new int[uzunluk];    // kaç kez tekrar ettiğini saklayacağız

        // 2️⃣ Diziyi doldur
        for (int i = 0; i < uzunluk; i++) {
            harfler[i] = cumle.charAt(i);
            tekrar[i] = 0; // başlangıçta tüm sayılar 0
        }

        // 3️⃣ Her karakterin kaç kez tekrar ettiğini bul
        for (int i = 0; i < uzunluk; i++) {
            if (harfler[i] == '0') continue; // zaten sayılmışsa atla

            int sayac = 1;
            for (int j = i + 1; j < uzunluk; j++) {
                if (harfler[i] == harfler[j]) {
                    sayac++;
                    harfler[j] = '0'; // sayıldı olarak işaretle
                }
            }
            tekrar[i] = sayac;
        }

        // 4️⃣ Sonucu yazdır
        System.out.println("Harflerin tekrar sayıları:");
        for (int i = 0; i < uzunluk; i++) {
            if (harfler[i] != '0') {
                System.out.println(harfler[i] + " -> " + tekrar[i]);
            }
        }
    }
}
