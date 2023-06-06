package dailyVideos.day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1=new Student("MERVE", 30,'F','A',"Cydeo School");

        System.out.println(student1);//Age can not be negative

        student1.setSchoolName("Harvard"); //school name is changed
        student1.setGrade('B');

        System.out.println(student1);



    }
}
