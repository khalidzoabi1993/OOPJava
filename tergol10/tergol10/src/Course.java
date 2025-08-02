public abstract class Course {
    private String name;
    private int courseId;

    public Course(String name, int courseId) {
        this.name = name;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void printInfo() {
        System.out.println("Course: " + name + " (ID: " + courseId + ")");
    }


    public abstract int getTotalHours();
}
