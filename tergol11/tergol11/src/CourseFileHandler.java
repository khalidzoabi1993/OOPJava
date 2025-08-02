import java.io.*;
import java.util.*;

public class CourseFileHandler {

    public static void saveCoursesToCSV(List<Course> courses, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (Course course : courses) {
            writer.write(course.toCSV() + "\n");
        }
        writer.close();
    }

    public static List<Course> loadCoursesFromCSV(String filename) throws IOException, InvalidCourseDataException {
        List<Course> courses = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String type = parts[2];
            switch (type) {
                case "Theoretical":
                    courses.add(new TheoreticalCourse(
                        parts[1],
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[3]),
                        parts[4],
                        Boolean.parseBoolean(parts[5])
                    ));
                    break;
                case "Practical":
                    courses.add(new PracticalCourse(
                        parts[1],
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[3]),
                        parts[4],
                        parts[5]
                    ));
                    break;
                case "External":
                    courses.add(new ExternalCourse(
                        parts[1],
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[3]),
                        parts[5]
                    ));
                    break;
                default:
                    throw new InvalidCourseDataException("Unknown course type: " + type);
            }
        }
        reader.close();
        return courses;
    }
}