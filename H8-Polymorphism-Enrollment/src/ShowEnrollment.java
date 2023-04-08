import java.util.ArrayList;

public class ShowEnrollment extends Enrollment {
    private ArrayList<String> enrolledParticipants;

    public ShowEnrollment(String enrollmentName, int enrollmentCode, String organizerName) {
        super(enrollmentName, enrollmentCode, organizerName);
        this.enrolledParticipants = new ArrayList<>();
    }

    @Override
    public void enroll(String participantName) {
        this.enrolledParticipants.add(participantName);
    }

    @Override
    public void showEnrollment() {
        System.out.println("Gösteri kayıtları:");
        for (String participant : enrolledParticipants) {
            System.out.println(participant);
        }
    }
}
