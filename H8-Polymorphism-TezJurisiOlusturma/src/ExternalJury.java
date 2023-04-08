public class ExternalJury extends Jury {
    public ExternalJury(String name) {
        super(name);
    }

    @Override
    public void evaluate(Thesis thesis) {
        int score = thesis.getOriginality() + thesis.getRelevance() + thesis.getFeasibility();
        System.out.println("Dış jüri " + getName() + " " + thesis.getStudentName() + " adlı öğrencinin tezini " + score + " puan vererek değerlendirdi.");
    }
}
