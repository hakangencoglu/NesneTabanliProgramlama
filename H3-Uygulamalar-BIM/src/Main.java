import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //2. Kısım
        Kitap k1= new Kitap();
        k1.setKitapAdi("Yüzüklerin Efendisi");
        k1.setKitapYazari("J.R.R. Tolkien");

        System.out.println(k1.getKitapAdi()+ " "+ k1.getKitapYazari());




        //1. Kısım
        /*Kitap k1 = new Kitap();
        k1.KitapAdi="Yüzüklerin Efendisi"; k1.KitapYazari="J.R.R. Tolkien";
        k1.KitapBasimYili="1978"; k1.KitapSayfaSayisi="324"; k1.KitapYayinEvi = "ABC Yayinevi";

        Kitap k3 = new Kitap();k3.KitapAdi="Suc ve Ceza";k3.KitapYazari="Fyodor Mihaylovic Dostoyevski";k3.KitapBasimYili="2006";
        k3.KitapSayfaSayisi="687";k3.KitapYayinEvi="Is Bankasi Kultur Yayinlari";

        Kitap k6 = new Kitap();
        k6.KitapAdi="Bir çift yurek";k6.KitapYazari="BLA BLA";k6.KitapBasimYili="1988";k6.KitapSayfaSayisi="150";k6.KitapYayinEvi="ABC yayinevi";

        Kitap k2 = new Kitap(); k2.KitapAdi= "Çalıkuşu"; k2.KitapYazari = "Reşat Nuri Güntekin";  k2.KitapSayfaSayisi = "409";
        k2.KitapBasimYili = "1922"; k2.KitapYayinEvi = "İnkılap";

        Kitap k4 = new Kitap();k4.KitapAdi="Harry Potter ve Felsefe Taşı";k4.KitapYazari="J.K. Rowling";k4.KitapBasimYili="1999";
        k4.KitapSayfaSayisi= "256";k4.KitapYayinEvi="Warner Bros.";

        List<Kitap> KitapListesi = new ArrayList(); KitapListesi.add(k1);KitapListesi.add(k2); KitapListesi.add(k3); KitapListesi.add(k4); KitapListesi.add(k6);

        for (int i=0; i<KitapListesi.size(); i++)
        {
            System.out.println(
            KitapListesi.get(i).KitapAdi + " "+KitapListesi.get(i).KitapYazari+ " "+ KitapListesi.get(i).KitapSayfaSayisi+" "
            +KitapListesi.get(i).KitapBasimYili+ " "+KitapListesi.get(i).KitapYayinEvi
            );
        }

        System.out.println(
                KitapListesi.get(0).KitapAdi + " "+KitapListesi.get(0).KitapYazari+ " "+ KitapListesi.get(0).KitapSayfaSayisi+" "
                        +KitapListesi.get(0).KitapBasimYili+ " "+KitapListesi.get(0).KitapYayinEvi
        );

        System.out.println(
                KitapListesi.get(1).KitapAdi + " "+KitapListesi.get(1).KitapYazari+ " "+ KitapListesi.get(1).KitapSayfaSayisi+" "
                        +KitapListesi.get(1).KitapBasimYili+ " "+KitapListesi.get(1).KitapYayinEvi
        );

        System.out.println(
                KitapListesi.get(4).KitapAdi + " "+KitapListesi.get(4).KitapYazari+ " "+ KitapListesi.get(4).KitapSayfaSayisi+" "
                        +KitapListesi.get(4).KitapBasimYili+ " "+KitapListesi.get(4).KitapYayinEvi
        );*/





        //System.out.println(k1.KitapAdi+" "+k1.KitapYazari+" "+k1.KitapSayfaSayisi+" "+k1.KitapBasimYili + " "+k1.KitapYayinEvi);


    }
}
