package Ders_3_Constructorlar;

public class Test {
    public static void main(String[] args) {
//*************************************************** 1.CONSTRUCTOR DERSİ **************************************************************
        //Account account1 = new Account();
        /*
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Ahmed");
        account1.setEmail("ahmed@gmail.com");
        account1.setTelefonNo("1234");
        System.out.println("bakiye : " + account1.getBakiye());
         */

        //Account account2 = new Account("1234",1000.0,"ahmed","ahmed@gmail.com","12345");

        //account2.paraYatirma(500);
        //account2.paraCekme(3000);
//*************************************************** 2.CONSTRUCTOR DERSİ *************************************************************
        //Account account3 = new Account();
        //System.out.println(account3.getEmail());

        //Account account4 = new Account("Ahmed","example@gmail.com","12345");
        /*System.out.println(account4.getEmail());
        System.out.println(account4.getIsim());
        System.out.println(account4.getTelefonNo());
        System.out.println(account4.getBakiye());
         */

        //account4.BilgileriGoster();

//***************************************** 3.KISIM OBJE REFERANSLARI *****************************************************************
        /*Account account1 = new Account("Ahmed Görkem Çalışkan","example","12345");

        Account account2 = account1; //İki referans da aynı yeri göstersin demektir yani account2 de account1 in bellekte gösterdiği yeri gösterir.

        if (account1==account2) {
            System.out.println("Aynı yeri gösterirler");
        }
         */

        new Account("AhmedGrkm","Example@gmail.com","2345456").BilgileriGoster();
        //Eğer tek satırlık bir işlemimiz varsa yukardaki gibi yazabiliriz ancak daha sonra tekrar kullnamayız çünkü bir referansı yok.
    }
}






/*Biz obje oluşturduğumuz zaman methodları yukardaki gibi tek tek vermememek için constructorları(yapıcı methodları) kullanırız. Constructorlar objeler oluşturulurken
ilk oluşturulan fonksiyonlardır. Eğer biz yazmazsak java kendisi deafult oluşturur ama eğer biz oluşturursak bizim oluşturduğumuzu kullanılır.
 */
