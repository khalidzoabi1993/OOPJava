import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // יצירת רשימת סטודנטים
//            List<Student> students = new ArrayList<>();
//            students.add(new Student(101, "Alice", 88.5));
//            students.add(new Student(102, "Bob", 73.0));
//            students.add(new Student(103, "Charlie", 92.0));
//
//            // שמירה לקובץ
//            StudentFileHandler.saveToFile(students, "students.csv");

            // קריאה מהקובץ
            List<Student> loadedStudents = StudentFileHandler.loadFromFile("studentss.csv");

            // הצגת הנתונים שנקראו
            System.out.println("Loaded students:");
            for (Student s : loadedStudents) {
                s.printInfo();
            }

        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
