public class DizidekiTekrarEdenSayilar {

    public static void main(String[] args) {
        int[] kaynakDizi = {1, 5, 2, 8, 1, 5, 1, 9, 2, 7};
        int n = kaynakDizi.length;

        // Bu dizi, kaynak dizideki her elemanın sayılmış olup olmadığını kontrol eder.
        // Başlangıçta tüm değerler 0'dır (sayılmadı demektir).
        int[] kontrolDizi = new int[n];


        // Dış Döngü: Kaynak dizinin tüm elemanları üzerinde döner
        for (int i = 0; i < n; i++) {

            // Eğer bu eleman daha önce sayılmadıysa (kontrolDizi[i] == 0 ise)
            if (kontrolDizi[i] == 0) {

                int eleman = kaynakDizi[i];
                int sayi = 1; // Kendisi de bir sayım olduğu için sayaca 1 ile başlıyoruz.

                // İç Döngü: Elemanın kaç kez tekrar ettiğini bulmak için dizinin geri kalanına bakar
                for (int j = i + 1; j < n; j++) {

                    if (kaynakDizi[i] == kaynakDizi[j]) {
                        sayi++;

                        // ÖNEMLİ: Bu elemanı saydık, bir daha saymamak için işaretliyoruz.
                        kontrolDizi[j] = -1; // -1 sayıldı anlamına gelsin.
                    }
                }

                // Sonucu yazdır
                System.out.println("Eleman " + eleman + " -> Tekrar Sayısı: " + sayi);
            }
        }
    }
}