import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCode;
    private String instructorName;
    protected ArrayList<Student> enrolledStudents;

    public Course(String courseName, int courseCode, String instructorName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorName = instructorName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void showCourseInfo() {
        System.out.println("Ders adı: " + courseName);
        System.out.println("Ders kodu: " + courseCode);
        System.out.println("Öğretmen adı: " + instructorName);
    }

    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public void sinavYap() {

    }
}
