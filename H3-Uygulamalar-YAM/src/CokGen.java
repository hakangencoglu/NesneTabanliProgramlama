public class CokGen {

    private int kenarSayisi, kenarUzunlugu;

    CokGen(int kenarSayisi, int kenarUzunlugu){ this.kenarSayisi=kenarSayisi;  this.kenarUzunlugu=kenarUzunlugu;  }

    int icAcilarinToplami(){        return (this.kenarSayisi-2)*180;    }

    int kosegenSayisi(){ return (this.kenarSayisi*(this.kenarSayisi-3))/2; }

    int icAciOlcusu(){ return ((this.kenarSayisi-2)*180 )/this.kenarSayisi;}

   int cevre(){ return this.kenarSayisi*this.kenarUzunlugu;}


}
