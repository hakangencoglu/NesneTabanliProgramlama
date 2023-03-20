import java.nio.file.attribute.UserDefinedFileAttributeView;

//Parent-Base-Temel-Ana Sınıf
public class Otomobil {
    String Marka, Model;
    Otomobil(String Marka, String Model){
        this.Marka=Marka; this.Model=Model;
        System.out.println(this.Marka+" "+this.Model);
    }

    public void OtomobilMetotu(String Marka, String Model){
        //this.Marka=Marka; this.Model=Model;
        System.out.println("Otomobilin Markası: " + this.Marka+ " Otomobilin Modeli: "+this.Model);
    }

    public void metot(){
        System.out.println("Otomobil Metotu");
    }

    public void metot2(){

    }



}
