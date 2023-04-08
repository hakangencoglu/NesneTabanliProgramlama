import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jury> juries = new ArrayList<Jury>();
        juries.add(new InternalJury("İç Jüri 1"));
        juries.add(new InternalJury("İç Jüri 2"));
        juries.add(new ExternalJury("Dış Jüri 1"));
        juries.add(new ExternalJury("Dış Jüri 2"));

        Thesis thesis = new Thesis("Ahmet Yılmaz", "Makine Öğrenimi ile Hava Kirliliği Tahmini", "Prof. Dr. Ali İhsan Kaya", 8, 7, 9, 8);

        for (Jury jury : juries) {
            jury.evaluate(thesis);
        }
    }
}
