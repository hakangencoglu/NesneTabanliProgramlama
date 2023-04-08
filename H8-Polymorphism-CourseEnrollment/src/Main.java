import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new MathCourse("Calculus", 101, "John Smith");
        Course programmingCourse = new ProgrammingCourse("Java Programming", 201, "Jane Doe");

        mathCourse.showCourseInfo();
        programmingCourse.showCourseInfo();

        Student student1 = new Student("Ali", 1001);
        Student student2 = new Student("Ayşe", 1002);

        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        programmingCourse.enrollStudent(student1);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(mathCourse);
        courses.add(programmingCourse);

        for (Course course : courses) {
            System.out.println("Kayıtlı öğrenciler:");
            for (Student student : course.enrolledStudents) {
                System.out.println(student.getStudentName() + " " + student.getStudentID());
            }
            course.sinavYap();
        }
    }
}
