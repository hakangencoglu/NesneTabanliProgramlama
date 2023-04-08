public class Enrollment {
    private String enrollmentName;
    private int enrollmentCode;
    private String organizerName;

    public Enrollment(String enrollmentName, int enrollmentCode, String organizerName) {
        this.enrollmentName = enrollmentName;
        this.enrollmentCode = enrollmentCode;
        this.organizerName = organizerName;
    }

    public String getEnrollmentName() {
        return enrollmentName;
    }

    public int getEnrollmentCode() {
        return enrollmentCode;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void enroll(String participantName) {

    }

    public void showEnrollment() {

    }
}
