//Child-Türetilmiş-Çocuk sınıf
public class Ticari extends Otomobil{

    Ticari(){
        super("WolksWagen","Caddy");

    }

    public void TicariOtomobilMetotu(String Marka, String Model){
        System.out.println(Marka+ " "+Model);
    }

    @Override
    public void metot(){
        System.out.println("Ticari Metot");
    }
}
