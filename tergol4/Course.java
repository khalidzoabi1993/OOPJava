
public class Course {
	
	private String courseName;
	private String courseId;
	private int maxNumberStudentInCourse;
	private String [] arrStudents;
	private int studentsActive=0;


	
	public Course(String courseName, String courseId, int maxNumberStudentInCourse)
	{
		setCourseName(courseName);
		setCourseId(courseId);
		setMaxNumbersOfStudents(maxNumberStudentInCourse);
		setArrOfStudents();
		
		
		
	}
	public String getCourseName()
	{
		return courseName;
	}
	public String getCourseId()
	{
		return courseId;
	}
	public int getMaxNumberOfStudents()
	{
		return this.maxNumberStudentInCourse;
	}
	public String [] getArrStudents()
	{
		return this.arrStudents;
	}
	public void setCourseName(String newCourseName)
	{
		this.courseName = newCourseName;
	}
	public void setCourseId(String newCourseId)
	{
		this.courseId = newCourseId;
	}
	public void setMaxNumbersOfStudents(int newMaxNumbersOfStudents)
	{
		this.maxNumberStudentInCourse = newMaxNumbersOfStudents;
	}
	public void setArrOfStudents()
	{
		arrStudents = new String[this.getMaxNumberOfStudents()];
	}
	
	public void addStudentToCoure(Student s1)
	{
		boolean isStudentExist = false;
		
		if(studentsActive==this.getArrStudents().length)
		{
			System.out.print("Arr Students is Full\n");
			
		}
		else
		{
			for(int i = 0 ; i < this.studentsActive ; i++)
			{
				if(this.arrStudents[i].equals(s1.getStudentId()))
				{
					System.out.print("This student is allready Exist\n");
					isStudentExist= true;
					break;
				}
			}
			if(!isStudentExist)
			{
				this.arrStudents[studentsActive]= s1.getStudentId();
				studentsActive++;
			}
		}
	}
	
	

}
