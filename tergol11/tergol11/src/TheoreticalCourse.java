public class TheoreticalCourse extends Course implements AttendanceTrackable {
    private int hours;
    private String topics;
    private boolean hasFinalExam;

    public TheoreticalCourse(String name, int courseId, int hours, String topics, boolean hasFinalExam)
            throws InvalidCourseDataException {
        super(name, courseId);
        if (hours <= 0) throw new InvalidCourseDataException("Hours must be greater than 0");
        if (topics == null || topics.isEmpty()) throw new InvalidCourseDataException("Topics cannot be empty");
        this.hours = hours;
        this.topics = topics;
        this.hasFinalExam = hasFinalExam;
    }

    @Override
    public int getTotalHours() {
        return hours;
    }

    @Override
    public void trackAttendance() {
        System.out.println("Tracking attendance for theoretical course: " + getName());
    }

    @Override
    public String toCSV() {
        return getCourseId() + "," + getName() + ",Theoretical," + hours + "," + topics + "," + hasFinalExam;
    }
}