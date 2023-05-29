import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer klavyedenOkunanVeri;
        try{
            klavyedenOkunanVeri = scanner.nextInt();
            //hata olması olası kodların yazıldığı blok
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally bloğu çalıştı");
        }

        System.out.println("Sonuc: "+klavyedenOkunanVeri*klavyedenOkunanVeri);

        //System.out.println("Hello world!");
    }
}