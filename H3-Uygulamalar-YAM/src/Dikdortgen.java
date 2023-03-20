public class Dikdortgen extends CokGen{
    int genislik,yukseklik;
    Dikdortgen(int genislik, int yukseklik) {
        super(4, (genislik+yukseklik)/2);
        this.genislik=genislik; this.yukseklik=yukseklik;
    }

    int dikdortgeninAlani(){return this.genislik*this.yukseklik;}

    @Override
    int cevre(){return 2*this.genislik+2*this.yukseklik;}






}
