public class ExternalCourse extends Course {
    private int externalHours;
    private String providerName;

    public ExternalCourse(String name, int courseId, int externalHours, String providerName) {
        super(name, courseId);
        this.externalHours = externalHours;
        this.providerName = providerName;
    }

    public int getExternalHours() {
        return externalHours;
    }

    public void setExternalHours(int externalHours) {
        this.externalHours = externalHours;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public int getTotalHours() {
        return externalHours;
    }
}
