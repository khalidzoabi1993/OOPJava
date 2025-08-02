import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        // יצירת קורסים תקינים
        try {
            courses.add(new TheoreticalCourse("Math", 101, 30, "Algebra|Calculus", true));
            courses.add(new PracticalCourse("Robotics Lab", 102, 10, "Robotics Kit", "John Doe"));
            courses.add(new ExternalCourse("Photography", 103, 20, "PhotoWorld Academy"));
        } catch (InvalidCourseDataException e) {
            System.out.println("Invalid data: " + e.getMessage());
        }

        // הצגת מידע על הקורסים
        System.out.println("=== VALID COURSES ===");
        for (Course course : courses) {
            course.printInfo();
            System.out.println("Total Hours: " + course.getTotalHours());
            if (course instanceof AttendanceTrackable) {
                ((AttendanceTrackable) course).trackAttendance();
            }
            System.out.println("______________");
        }

        // כתיבה לקובץ תקני
        try {
            CourseFileHandler.saveCoursesToCSV(courses, "courses.csv");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        // קריאה מקובץ תקני
        System.out.println("\n=== LOADING FROM courses.csv ===");
        try {
            List<Course> loadedCourses = CourseFileHandler.loadCoursesFromCSV("courses.csv");
            for (Course c : loadedCourses) {
                c.printInfo();
            }
        } catch (IOException | InvalidCourseDataException e) {
            System.out.println("Error loading courses: " + e.getMessage());
        }

        // הדגמה של שגיאה ביצירת קורס לא תקין
        System.out.println("\n=== TESTING INVALID COURSE CREATION ===");
        try {
            Course brokenCourse = new TheoreticalCourse("", 104, -5, "", true);
        } catch (InvalidCourseDataException e) {
            System.out.println("Invalid data: " + e.getMessage());
        }

        // כתיבת קובץ CSV שגוי
        System.out.println("\n=== WRITING CORRUPTED CSV ===");
        try (PrintWriter writer = new PrintWriter("corrupted_courses.csv")) {
            writer.println("104,,Theoretical,-10,,true"); // שם ריק, שעות שליליות
            writer.println("105,Strange,Hybrid,15,,yes"); // סוג לא מוכר
        } catch (IOException e) {
            System.out.println("Failed to write corrupted test file: " + e.getMessage());
        }

        // קריאת קובץ CSV שגוי
        System.out.println("\n=== READING FROM corrupted_courses.csv ===");
        try {
            List<Course> corruptedCourses = CourseFileHandler.loadCoursesFromCSV("corrupted_courses.csv");
            for (Course c : corruptedCourses) {
                c.printInfo();
            }
        } catch (IOException | InvalidCourseDataException e) {
            System.out.println("Invalid data: " + e.getMessage());
        }
    }
}
