
public class Student {
	
	private String studentName;
	
	private String studentId;
		
	public Student(String studentName, String studentId)
	{
		this.studentName = studentName;
		this.studentId = studentId;
		
	}
	public Student(String studentName)
	{
		this.studentName = studentName;
		this.studentId = "12345678";  // Default ID
	}
	public String getStudentName()
	{
		return this.studentName;
	}
	public String getStudentId()
	{
		return this.studentId;
	}
	public void seStudentName(String newStudent)
	{
		this.studentName = newStudent;
	}
	public void seStudentId(String newStudentId)
	{
		this.studentId = newStudentId;
	}
	public String toString()
	{
		return "The student name is " + this.getStudentName() + " The studnt ID is " + this.getStudentId();
	}
	
	
}
