package practices.day31_practices.studentTask;

public class GraduateStudent extends Student {


    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    public void study(){
        System.out.println(getName()+ " is no more studying");
    }








}
