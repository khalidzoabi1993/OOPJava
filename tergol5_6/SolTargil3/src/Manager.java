public class Manager extends Person{
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    @Override
    public String toString() {
        return "Manager {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", teamSize=" + getTeamSize() +
                '}';
    }
}
