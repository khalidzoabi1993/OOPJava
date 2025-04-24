
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
		this.studentId="12345678";
		
	}
	public String getStudentName()
	{
		return studentName;
	}
	public String getStudentId()
	{
		return this.studentId;
	}
	public void setStudentName(String newStudentName)
	{
		this.studentName = newStudentName;
	}
	public void setStudentId(String newStudentId)
	{
		this.studentId = newStudentId;
	}
	public void printDetails()
	{
		System.out.print("The name of the student is " + this.getStudentName() + " The studentId is " + getStudentId());
	}
	

}
