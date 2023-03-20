/*import System;*/
import java.lang.System;

public class Main {

    public static void main(String[] args) {
        System.out.println("Deneme");

        Ogrenci ogrenci= new Ogrenci();
        ogrenci.id=1111;
        ogrenci.isim="Hakan";
        ogrenci.soyisim="Gençoğlu";
        System.out.println(ogrenci.isim+" "+ogrenci.soyisim+" "+ogrenci.id);
        System.out.println(ogrenci);
        System.out.println(ogrenci.hashCode());
        System.out.println(ogrenci.toString());

        /*Sinif s = new Sinif();
        s.HareketEttir(3,5);
        s.yazdir();*/

    }

}

/*class Sinif{
    int x,y;
    public void HareketEttir(int x, int y){
        this.x=x; this.y=y;
    }

    public void yazdir(){
        System.out.println( "x değeri: "+x + " **** y değeri: "+y );
    }

}*/