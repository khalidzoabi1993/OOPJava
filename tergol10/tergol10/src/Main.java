public class Main {
    public static void main(String[] args) {
        Course[] courses = new Course[3];

        courses[0] = new TheoreticalCourse("Math", 101, 30, "Algebra, Calculus", true);
        courses[1] = new PracticalCourse("Robotics Lab", 102, 10, "Arduino Kit", "Dana");
        courses[2] = new ExternalCourse("Photography", 103, 20, "External Studio");

        for (Course c : courses) {
            c.printInfo();
            System.out.println("Total Hours: " + c.getTotalHours());

            if (c instanceof AttendanceTrackable) {
                AttendanceTrackable attendanceTrackable = (AttendanceTrackable) c;
                ((AttendanceTrackable) c).trackAttendance();
            }

            System.out.println("---------------");
        }
    }
}
