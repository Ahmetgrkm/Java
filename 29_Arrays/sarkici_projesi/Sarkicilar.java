package sarkici_projesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilari_bastir(){
        System.out.println("şarkıcı Listesinde " + sarkici_listesi.size() + " kadar şarkıcı var");
        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println(i+1 + ".Şarkıcı :" + sarkici_listesi.get(i));
        }
    }
    public void sarkici_ekle(String isim){
        sarkici_listesi.add(isim);

        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    public void sarkici_guncelle(String yeniisim, int position){
        sarkici_listesi.set(position,yeniisim);
        System.out.println("Şarkıcı Listesi güncellendi...");
    }
    public void sarkici_sil(int position){
        String isim = sarkici_listesi.get(position);
        sarkici_listesi.remove(position);

        System.out.println(isim + " isimli şarkıcı listeden silindi");
    }
    public void sarkici_ara(String sarkici_ismi){
        int position = sarkici_listesi.indexOf(sarkici_ismi);
        if (position>=0){
            System.out.println("Şarkıcı bulundu");
            System.out.println("Şarkıcı ismi " + sarkici_ismi + (position+1) + " .pozisyonda");
        }
        else{
            System.out.println("Şarkıcı bulunamadı...");
        }
    }
}
