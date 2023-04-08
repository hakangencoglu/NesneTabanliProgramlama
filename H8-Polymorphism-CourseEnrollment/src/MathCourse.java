public class MathCourse extends Course {
    public MathCourse(String courseName, int courseCode, String instructorName) {
        super(courseName, courseCode, instructorName);
    }

    @Override
    public void sinavYap() {
        System.out.println("Matematik sınavı yapılıyor.");
    }
}
