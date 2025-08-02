public abstract class Course {
    private String name;
    private int courseId;

    public Course(String name, int courseId) throws InvalidCourseDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidCourseDataException("Course name cannot be empty");
        }
        this.name = name;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void printInfo() {
        System.out.println("Course: " + name + " (ID: " + courseId + ")");
    }

    public abstract int getTotalHours();

    public abstract String toCSV();
}