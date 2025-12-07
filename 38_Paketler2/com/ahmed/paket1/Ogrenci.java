package com.ahmed.paket1;

import com.ahmed.paket2.AdayOgrenci; //farklı paketlerden interface implemente etmek için import etmeliyiz.

public class Ogrenci implements AdayOgrenci {

    @Override
    public void ders_calis() {
        System.out.println("ders çalışıyorum");
    }
}
