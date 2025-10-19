public class FloatAndDouble {
    public static void main(String[] args) {

        /*double a=5.25;
        double b=4.0;
        double c=4d;
        double d=4.23d;

        float f= (float) 5.0;
        float h = 5f;*/

//------------------------------DOĞRULUK ORANI-------------------------------

        /*int a=22/7;
        float b=22f/7f;
        double c=22d/7d;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);*/


//-------------------------------OTOMATİK DÖNÜŞTÜRME-------------------------

        //otomatik dönüştürme = int --> float --> double

        /*int i = 5;
        float j = i;
        System.out.println(j); //ekranda 5.0 olarak çıktı verir.*/

        //float j = i şeklinde yazarsak hata verir çünkü soldan sağa doğru dönüştürme yapılır. bunu şöyle yazmalıyız => float j = (float)i


//---------------------------------İşlem Örneği-----------------------------------
        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;
        System.out.println("Ortalama: "+ (sayi1+sayi2+sayi3)/3);
    }
}

//double 64 bitlik yer kapladığı için daha büyük sayılarda da doğru şekilde verir. Ayrıca flooatda verdiği hatalardan dolayı double kullanmak daha mantıklıdır.


























