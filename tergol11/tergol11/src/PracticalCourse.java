public class PracticalCourse extends Course implements AttendanceTrackable {
    private int numOfSessions;
    private String requiredEquipment;
    private String assistantName;

    public PracticalCourse(String name, int courseId, int numOfSessions, String requiredEquipment, String assistantName)
            throws InvalidCourseDataException {
        super(name, courseId);
        if (numOfSessions <= 0) throw new InvalidCourseDataException("Number of sessions must be greater than 0");
        if (assistantName == null || assistantName.isEmpty()) throw new InvalidCourseDataException("Assistant name cannot be empty");
        this.numOfSessions = numOfSessions;
        this.requiredEquipment = requiredEquipment;
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

    @Override
    public String toCSV() {
        return getCourseId() + "," + getName() + ",Practical," + getTotalHours() + "," + requiredEquipment + "," + assistantName;
    }
}