public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1= new Ogrenci();
        ogrenci1.ad="Hakan";
        ogrenci1.soyad="Gençoğlu";
        ogrenci1.dogumYeri="Bursa";
        ogrenci1.yas=45;
        System.out.println(ogrenci1.toString());
        System.out.println("Ad:"+ogrenci1.ad+" Soyad:"+ogrenci1.soyad+" Dogum yeri:"+ogrenci1.dogumYeri+" yaş:"+ogrenci1.yas);


        Ogrenci ogrenci2 =  new Ogrenci();
        ogrenci2.yas=45;
        ogrenci2.ad="Hakan";
        ogrenci2.soyad="Gençoğlu";
        ogrenci2.dogumYeri="Bursa";
        System.out.println(ogrenci2.toString());
        System.out.println("Ad:"+ogrenci2.ad+" Soyad:"+ogrenci2.soyad+" Dogum yeri:"+ogrenci2.dogumYeri+" yaş:"+ogrenci2.yas);
        if(ogrenci1.equals(ogrenci2)) System.out.println("Nesneler aynı");
        else System.out.println("nesneler farklı");
        System.out.println(ogrenci1.hashCode());

    }

}
