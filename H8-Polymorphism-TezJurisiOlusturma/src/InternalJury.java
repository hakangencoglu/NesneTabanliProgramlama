public class InternalJury extends Jury {
    public InternalJury(String name) {
        super(name);
    }

    @Override
    public void evaluate(Thesis thesis) {
        int score = thesis.getRelevance() + thesis.getFeasibility() + thesis.getClarity();
        System.out.println("İç jüri " + getName() + " " + thesis.getStudentName() + " adlı öğrencinin tezini " + score + " puan vererek değerlendirdi.");
    }
}
