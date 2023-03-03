public class Otomobil {
    String marka, model;
    int uretimYili;
    double motorGucu;
    String adres;

    Otomobil(){
        marka="Renault"; model="Clio"; uretimYili=2023; motorGucu=1496.0;
    }
    Otomobil(String marka,String model){
        this.marka=marka; this.model = model;
    }

    Otomobil(int uy,double mg){
        uretimYili=uy; motorGucu=mg;
    }

    Otomobil(String marka, String model, int uretimYili, int motorGucu){
        this.motorGucu=motorGucu; this.model=model; this.marka=marka; this.uretimYili=uretimYili; adres=this.toString();
    }


}
