public class Kitap {
    private String KitapAdi;
    private String KitapBasimYili;
    private String KitapYazari;
    private String KitapSayfaSayisi;
    private String KitapYayinEvi;



    //2. Kısım get-set metotları

    public void setKitapAdi(String KitapAdi){ this.KitapAdi=KitapAdi;}
    public String getKitapAdi(){return this.KitapAdi;}

    public void setKitapYazari(String kitapYazari) {
        KitapYazari = kitapYazari;
    }

    public String getKitapYazari() {
        return KitapYazari;
    }
}
