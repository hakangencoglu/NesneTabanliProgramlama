import Paket1.TV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM");
        System.out.println("Yıl: "+simpleDateFormat.format(date)+" Ay: "+ simpleDateFormat1.format(date));


        SimpleDateFormat simpleDateFormat2  =new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Tarih: "+simpleDateFormat2.format(date));

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH.mm.s");
        System.out.println("Saat: "+ simpleDateFormat3.format(date));

       // Date dun = new Date("27.04.2023");
        String dun = "27.02.2023";


        Date d = null;
        try {
            d = simpleDateFormat2.parse(dun);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Dünün Tarihi: "+d);
        long fark = date.getDay() - d.getDay();
        System.out.println(date.getDate()+ "  "+d.getDate()+ " "+ fark);

        int ayFarki = date.getMonth()-d.getMonth();
        System.out.println(ayFarki);








        //Test test = new Test();
        //TV


        //System.out.println("Hello world!");
    }
}