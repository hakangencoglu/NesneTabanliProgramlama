//Child-Türetilmiş-Çocuk sınıf
public class Binek extends Otomobil{
    Binek(){
        super("Renault","Clio");
    }
    public void BinekMetotu(String Marka, String Model){
        System.out.println(Marka+" "+Model);
    }

    @Override
    public void metot(){
        //ana sınıftaki metotlara erişmemizi sağlar
        super.metot();
        //System.out.println("Binek Metot");
    }

}
