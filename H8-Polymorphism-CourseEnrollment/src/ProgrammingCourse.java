public class ProgrammingCourse extends Course {
    public ProgrammingCourse(String courseName, int courseCode, String instructorName) {
        super(courseName, courseCode, instructorName);
    }

    @Override
    public void sinavYap() {
        System.out.println("Programlama sınavı yapılıyor.");
    }
}
