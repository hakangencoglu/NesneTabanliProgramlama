public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 =  new Ogrenci();
        ogr1.yas=45;
        ogr1.isim="Hakan";
        ogr1.soyisim="Gençoğlu";
        ogr1.dogumYili=1978;
        System.out.println("Ad: "+ogr1.isim+" Soyad: "+ogr1.soyisim+" Doğum Yılı: "+ogr1.dogumYili+" Yaş: "+ogr1.yas);
        System.out.println(ogr1.toString());

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.isim="Hakan";
        ogrenci.soyisim="Gençoğlu";
        ogrenci.yas=45;
        ogrenci.dogumYili=1978;
        System.out.println("Ad: "+ogrenci.isim+" Soyad: "+ogrenci.soyisim+" Doğum Yılı: "+ogrenci.dogumYili+" Yaş: "+ogrenci.yas);
        System.out.println(ogrenci.toString());



    }

}
