public class Otomobil {
    String marka,model;
    int uretimYili;
    double motorGucu;

    Otomobil(){
        //System.out.println("Kurucu Metot Çalıştı");
        marka="Renault"; model="Clio"; uretimYili=2023; motorGucu=1496;
    }

    /*Otomobil(int sayi1){
        System.out.println("Kurucu metot2 çalıştı. Gelen sayı değeri:"+sayi1);
    }

    Otomobil(String Marka, String Model){
        System.out.println("Marka: "+Marka+" Model:"+Model);
    }

    Otomobil(Double motorGücü, int modelYili){
        System.out.println("Motor Gücü: "+motorGücü+" Model Yılı: "+modelYili);
    }*/

    public void metot1(){
        System.out.println("Metot1 çalıştı");
    }

    public int metot2(){
        return 45;
    }
}
