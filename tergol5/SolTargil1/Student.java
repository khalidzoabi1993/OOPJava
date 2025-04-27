
public class Student {
	
	private String studentName;
	
	private String studentId;
	
	public Student(String studentName, String studentId)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	public String getId()
	{
		return this.studentId;
	}
	public String getName()
	{
		return this.studentName;
	}
	public void setId(String newId)
	{
		this.studentId = newId;
	}
	public void setStudentName(String newStudent)
	{
		this.studentName = newStudent;
	}
	@Override
	public String toString()
	{
		return "The Id of the Student is " + this.studentId + " The student name is " + this.studentName;
	}
	@Override
	public boolean equals(Object studentObj)
	{
		if(studentObj == this)
		{
			return true;
		}
		if(studentObj != null && studentObj.getClass() == this.getClass())
		{

			Student s = (Student) studentObj;
			
			if(this.getId().equals(s.getId()))
			{
				return true;
			}
			
		}
		return false;
	}
	
}
