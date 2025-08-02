public class ExternalCourse extends Course {
    private int externalHours;
    private String providerName;

    public ExternalCourse(String name, int courseId, int externalHours, String providerName)
            throws InvalidCourseDataException {
        super(name, courseId);
        if (externalHours <= 0) throw new InvalidCourseDataException("External hours must be greater than 0");
        if (providerName == null || providerName.isEmpty()) throw new InvalidCourseDataException("Provider name cannot be empty");
        this.externalHours = externalHours;
        this.providerName = providerName;
    }

    @Override
    public int getTotalHours() {
        return externalHours;
    }

    @Override
    public String toCSV() {
        return getCourseId() + "," + getName() + ",External," + externalHours + ",," + providerName;
    }
}