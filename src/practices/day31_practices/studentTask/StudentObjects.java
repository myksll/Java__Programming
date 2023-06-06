package practices.day31_practices.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        Student student = new Student("Maria kamonu",24,'F',"F44","Chemie", "Walt",'A');

        System.out.println(student);

        student.study();

        System.out.println("------------------------------------------------");

        GraduateStudent graduateStudent=new GraduateStudent("Micheal jordon",27,'M',"S47","IT", "Cydeo", 'D');
        System.out.println(graduateStudent);





    }
}
