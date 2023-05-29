public class AltSinif extends Sinif{

    public void setMetodu(int degisken){
        super.setStatikDeger(degisken);
    }

    public int getMetodu(){
        //return super.getStatikDeger();
        return super.statikOlmayanDeger;
    }

    /*@Override
    public void finalMetot(){
        System.out.println("Alt sınıftaki final metodu çalıştı");
    }*/

}
