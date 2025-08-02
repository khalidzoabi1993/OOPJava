public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // מחזיר מחרוזת CSV עבור הסטודנט
    public String toCSV() {
        return id + "," + name + "," + grade;
    }

    // בונה סטודנט משורת CSV
    public static Student fromCSV(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double grade = Double.parseDouble(parts[2]);
        return new Student(id, name, grade);
    }

    // מציג את פרטי הסטודנט
    public void printInfo() {
        System.out.println("Student: " + id + ", " + name + ", Grade: " + grade);
    }
}
