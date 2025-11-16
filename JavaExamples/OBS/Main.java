package OBS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("********ÖĞRENCİ OBS SİSTEMİ*******");
            String islemler ="1- Öğrenci Ekle \n" +
                    "2- Listeyi göster\n" +
                    "3- Öğrenci Sil\n" +
                    "4- Öğrenci Güncelle\n" +
                    "5-Çıkış";
            System.out.println(islemler);
            System.out.print("Bir işlem seçiniz(1-5) :");

            int secim = sc.nextInt();

            if (secim == 1) {
                System.out.println("Eklemek istediğiniz öğrencinin İD si :");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Eklemek istediğiniz öğrencinin Adı :");
                String name = sc.nextLine();
                System.out.println("Eklemek istediğiniz öğrencinin yaşı :");
                int age = sc.nextInt();
                sc.nextLine();

                sms.addStudent(new Student(name,age,id));
            }
            else if (secim == 2) {
                sms.listStudents();
            }
            else if (secim == 3) {
                System.out.println("Silinecek öğrencinin id sini girin :");
                int id = sc.nextInt();
                sms.deleteStudent(id);
            }
            else if (secim == 4) {
                System.out.println("Güncellenecek öğrenci id sini girin :");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Yeni isim :");
                String name = sc.nextLine();
                System.out.print("yeni yaş :");
                int age = sc.nextInt();
                sms.updateStudent(id,name,age);
            }
            else if (secim == 5) {
                System.out.println("sistemden çıkılıyor...");
                break;
            }
            else {
                System.out.println("Geçersiz işlem girdiniz!!!!!");
            }


        }
    }
}
