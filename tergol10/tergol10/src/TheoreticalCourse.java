public class TheoreticalCourse extends Course implements AttendanceTrackable {
    private int hours;
    private String topics;
    private boolean hasFinalExam;

    public TheoreticalCourse(String name, int courseId, int hours, String topics, boolean hasFinalExam) {
        super(name, courseId);
        this.hours = hours;
        this.topics = topics;
        this.hasFinalExam = hasFinalExam;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public boolean isHasFinalExam() {
        return hasFinalExam;
    }

    public void setHasFinalExam(boolean hasFinalExam) {
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
    public String toString() {
        return "TheoreticalCourse{" +
                "name='" + getName() + '\'' +
                ", courseId=" + getCourseId() +
                ", hours=" + hours +
                ", topics='" + topics + '\'' +
                ", hasFinalExam=" + hasFinalExam +
                '}';
    }


}
