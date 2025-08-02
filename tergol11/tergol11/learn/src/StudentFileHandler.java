import java.io.*;
import java.util.*;

public class StudentFileHandler {

    public static void saveToFile(List<Student> students, String filename) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        for (Student s : students) {
            writer.println(s.toCSV());
        }
        writer.close();
    }

    public static List<Student> loadFromFile(String filename) throws IOException {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Student s = Student.fromCSV(line);
            list.add(s);
        }
        sc.close();
        return list;
    }
}
