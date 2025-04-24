
public class Course {

	private String courseName;

	private String courseId;

	public int maxNumberStudentInCourse;

	private String[] arrStudent;

	private int studentCounter = 0;

	private boolean isValid = true;

	public int getStudentCounter() {
		return studentCounter;
	}

	public void setStudentCounter(int newStudentCounter) {
		this.studentCounter = newStudentCounter;
	}

	public int getmaxNumberStudentInCourse() {
		return this.maxNumberStudentInCourse;
	}

	public Course(String courseName, String courseId, int maxNumberStudentInCourse) {
		this.courseName = courseName;
		this.courseId = courseId;
		setMaxNumberStudentInCourse(maxNumberStudentInCourse);
		arrStudent = new String[maxNumberStudentInCourse];

	}

	public void setMaxNumberStudentInCourse(int maxNumberStudentInCourse) {
		if (Math.sqrt(maxNumberStudentInCourse) > 2) {
			this.maxNumberStudentInCourse = maxNumberStudentInCourse;
		} else {
			System.out.println("The value is not Valid");
			// Valid רק המידה והערך גדול מ -5 אז הוא יהיה 
			isValid = false;

		}
	}

	public void addStudentToCoure(Student s) {
		boolean isExist = false;
		if (isValid) {
			for (int i = 0; i < arrStudent.length; i++) {
				if (arrStudent[i] != null) {

					if (arrStudent[i].equals(s.getStudentId())) {
						System.out.println("The Student with the ID " + arrStudent[i] + " is allready Exist");
						isExist = true;
						break;
					}
				} else {
					break;
				}
			}
			if (!isExist) {
				if (this.getStudentCounter() < this.getmaxNumberStudentInCourse()) {
					arrStudent[this.getStudentCounter()] = s.getStudentId();
					System.out.println("The Student with ID " + s.getStudentId() + " is Added");
					this.setStudentCounter(this.getStudentCounter() + 1);
				} else {
					System.out.println(
							"The student quota for this course has been filled. No additional students can be added.");

				}
			}

		}
	}

}
