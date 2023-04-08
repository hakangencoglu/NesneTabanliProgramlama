public class Thesis {
    private String studentName;
    private String thesisTitle;
    private String advisorName;
    private int originality;
    private int relevance;
    private int feasibility;
    private int clarity;

    public Thesis(String studentName, String thesisTitle, String advisorName, int originality, int relevance, int feasibility, int clarity) {
        this.studentName = studentName;
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
        this.originality = originality;
        this.relevance = relevance;
        this.feasibility = feasibility;
        this.clarity = clarity;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public int getOriginality() {
        return originality;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getFeasibility() {
        return feasibility;
    }

    public int getClarity() {
        return clarity;
    }
}
