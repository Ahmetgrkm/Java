public class Database {
    public void baglanti_kur(final String username, final String password){
        //username = "root2"; eğer verilen değerin değişmesini istemiyorsak yukardaki gibi parametrelerin yanına final değerini koyarız böylece değerler değiştirilemez.
        System.out.println(username);
        System.out.println(password);
    }
    public final void baglanti_kur2(final String username, final String password){
        System.out.println(username);
        System.out.println(password);
    }
}
//Eğer biz classımıza final anahtar kelimesini eklersek o zaman bu sınıftan direkt olarak hiçbir alt sınıf üretemeyiz kalıtım alamayız.
