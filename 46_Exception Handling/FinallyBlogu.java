// Try catch de exception oluşsa da oluşmasa da mutlaka ve mutlaka çalışmasını istediğimiz şeyleri bu blok içine yazarız.
public class FinallyBlogu {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e){
            System.out.println("Null Referans hatası");
        }

        finally {
            System.out.println("Burda finally çalışıyor, ne olursa olsun mutlaka çalışır");
        }
        System.out.println("Burası çalışmaz çünkü finally çalışıp program sonlanır, eğer istemiyorsak mutlaka catch yazmalıyız.");
    }
}
