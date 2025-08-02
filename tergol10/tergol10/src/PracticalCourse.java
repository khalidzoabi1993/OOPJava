public class PracticalCourse extends Course implements AttendanceTrackable {
    private int numOfSessions;
    private String requiredEquipment;
    private String assistantName;

    public PracticalCourse(String name, int courseId, int numOfSessions, String requiredEquipment, String assistantName) {
        super(name, courseId);
        this.numOfSessions = numOfSessions;
        this.requiredEquipment = requiredEquipment;
        this.assistantName = assistantName;
    }

    public int getNumOfSessions() {
        return numOfSessions;
    }

    public void setNumOfSessions(int numOfSessions) {
        this.numOfSessions = numOfSessions;
    }

    public String getRequiredEquipment() {
        return requiredEquipment;
    }

    public void setRequiredEquipment(String requiredEquipment) {
        this.requiredEquipment = requiredEquipment;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    @Override
    public int getTotalHours() {
        return numOfSessions * 2;
    }

    @Override
    public void trackAttendance() {
        System.out.println("Attendance recorded for practical course: " + getName());
    }
}
