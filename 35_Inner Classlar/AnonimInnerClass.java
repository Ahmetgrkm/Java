public class AnonimInnerClass {
    public static void main(String[] args) {
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders çalışıyorum");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum");
            }
        }; //class tanımlaması gibi olduğu için noktalı virgül koyduk

        ogrenci.ders_calis();
        ogrenci.derse_gir();
        System.out.println("***************************************");

        AOgrenci ogrenci1 = new AOgrenci("Ahmed Görkem ",315) {
            @Override
            void kayit_yaptir() {
                System.out.println("Kayıt yapılıyor " + getIsim() + " " + getNumara());
            }
        };
        ogrenci1.kayit_yaptir();
        ogrenci1.selamla();

    }
    public abstract static class AOgrenci{ //içinde gövdeli bir method tanımladığımız için mutlaka static yapmalıyız.
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.setIsim(isim);
            this.setNumara(numara);
        }

        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("selamlar");
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
    }


    public interface IOgrenci{
        void ders_calis();
        void  derse_gir();
    }
}
