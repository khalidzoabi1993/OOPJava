public class Main {
	public static void main(String[] args) {

		
		Student s1 = new Student("A", "4546");
		Student s2 = new Student("B", "4");

		Student s3 = new Student("C", "5");

		Student s4 = new Student("D", "6");

		Student s5 = new Student("E", "7");
		Student s6 = new Student("f", "4546");

		s6.equals(s2);
		
		System.out.println(s1.toString());
		
		Course c = new Course("OPP", "6567");
		
		c.addStudent(s1);
		
		c.addStudent(s2);
		c.addStudent(s3);
		
		c.addStudent(s4);
		
		c.addStudent(s5);
		
		c.addStudent(s6);
		
		c.printStudent();





		
		
		
		
		
	}
}
