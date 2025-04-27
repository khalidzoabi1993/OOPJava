public class Studenttemp {
    private String studentName;
    private String studentId;

    public Studenttemp(String name,String id){
        this.studentName = name;
        this.studentId = id;
    }

    public Studenttemp(String name){
        this.studentName = name;
        this.studentId = "12345678";
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public void setStudentId(String id){
        this.studentId = id;
    }

    public void printDetails(){
        System.out.println("The name of the student is " + this.getStudentName() + " The studentId is " + this.getStudentId());
    }
}
