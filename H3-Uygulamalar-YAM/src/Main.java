import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.print("Lütfen çokgenin kenar sayısını giriniz: ");

        //klavyeden veri alma
        Scanner data = new Scanner(System.in);
        int kenarSayisi = data.nextInt();

        System.out.print("Lütfen çokgenin bir kenarının uzunluğunu giriniz: ");
        int kenarUzunlugu = data.nextInt();


        CokGen cg1 = new CokGen(kenarSayisi,kenarUzunlugu);

        System.out.println("Çokgenin iç açılarının toplamı: "+cg1.icAcilarinToplami());
        System.out.println("Çokgenin köşegen Sayısı: "+cg1.kosegenSayisi());
        System.out.println("Çokgenin bir iç açısının ölçüsü: "+cg1.icAciOlcusu());
        System.out.println("Çokgenin çevresinin ölçüsü: "+cg1.cevre());*/


        Dikdortgen d1 =  new Dikdortgen(3,4);
        System.out.println("Alan: "+d1.dikdortgeninAlani()+ " Çevre: "+d1.cevre()+" bir açı ölçüsü: "+d1.icAciOlcusu()+" Köşegen Sayısı: "+d1.kosegenSayisi());


    }
}
