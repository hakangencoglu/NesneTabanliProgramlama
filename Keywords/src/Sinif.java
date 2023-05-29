public class Sinif {

    public String isim;
    public int statikOlmayanDeger;


    //static, sınıftan türetilen her nesneye ait global bir şey (metot veya özellik)
    // tanımlar

    protected static int statikDeger;
    protected static void statikMetot(){
        System.out.println("Statik Metot Çalıştı");
    }

    protected void setStatikDeger(int deger){ this.statikDeger=deger;}

    protected int getStatikDeger() {
        return statikDeger;
    }
    //final anahtar kelimesi değiştirilememisini sağlar.
    public final  int a=5;

    public final void finalMetot(){
        System.out.println("Final Metot Çalıştı");
    }
}
