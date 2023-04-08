import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Enrollment courseEnrollment = new CourseEnrollment("Java Programlama", 101, "John Smith");
        Enrollment showEnrollment = new ShowEnrollment("Müzikal Gösteri", 201, "Jane Doe");

        courseEnrollment.enroll("Ali");
        courseEnrollment.enroll("Ayşe");
        showEnrollment.enroll("Fatma");
        showEnrollment.enroll("Mehmet");

        courseEnrollment.showEnrollment();
        showEnrollment.showEnrollment();
    }
}
