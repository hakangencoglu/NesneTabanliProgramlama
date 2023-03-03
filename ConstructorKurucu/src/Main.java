public class Main {
    public static void main(String[] args) {
        Otomobil o1 = new Otomobil();
        //o1.metot1();
        //System.out.println(o1.metot2());
        //Otomobil o2= new Otomobil( 57);
        //Otomobil o3 = new Otomobil("Renault","Clio");
        //Otomobil o4 = new Otomobil(1496.0,2023);
        System.out.println(o1.marka+" "+o1.model+" "+o1.uretimYili+" "+o1.motorGucu);

        Binek b = new Binek();
        b.metot1();
    }
}
