import java.util.ArrayList;

public class Course {

	private String nameCourse;

	private String courseId;

	private ArrayList<Student> students;

	private int maxNumberStudentsInCourse = 5;

	public Course(String nameCourse, String courseId) {
		this.courseId = courseId;
		this.nameCourse = nameCourse;
		students = new ArrayList<Student>();
	}

	public String getStudent(String studentId) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(studentId)) {
				return students.get(i).getName();
			}
		}
		return null;
	}

	public void addStudent(Student s) {
		String isExist = this.getStudent(s.getId());
		if (maxNumberStudentsInCourse  > students.size()) {
			if (isExist == null) {
				this.students.add(s);
			} else {
				System.out.println("This student allready Exist in the list of students");
			}
		}
		else
		{
			System.out.println("The Max number for this course is 30, and it's full");
		}

	}

	public void printStudent() {
		System.out.println("The list of the Students that exists in the course is ");

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
	}

}
