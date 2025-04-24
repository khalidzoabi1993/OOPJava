
public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("david", "123");
		Student s2 = new Student("Yos", "456");
		Student s3 = new Student("Meni", "789");
		Student s4 = new Student("Avi", "983");
		Student s5 = new Student("Rony", "565");
		Student s6 = new Student("Sami", "565");
		Student s7 = new Student("Dina", "987");


		System.out.println("The Student name  is" +  s1.getStudentName() + " And the Id of the Student is " + s1.getStudentId());
		System.out.println("The Student name  is" +  s2.getStudentName() + " And the Id of the Student is " + s2.getStudentId());
		System.out.println("The Student name  is" +  s3.getStudentName() + " And the Id of the Student is " + s3.getStudentId());
		System.out.println("The Student name  is" +  s4.getStudentName() + " And the Id of the Student is " + s4.getStudentId());
		System.out.println("The Student name  is" +  s5.getStudentName() + " And the Id of the Student is " + s5.getStudentId());
		System.out.println("The Student name  is" +  s6.getStudentName() + " And the Id of the Student is " + s6.getStudentId());

	
		Course c = new Course("OOP", "34587878",5);
		c.addStudentToCoure(s1);
		c.addStudentToCoure(s2);
		c.addStudentToCoure(s3);
		c.addStudentToCoure(s4);
		c.addStudentToCoure(s5);
		c.addStudentToCoure(s6);
		c.addStudentToCoure(s7);







		
		

	}

}
