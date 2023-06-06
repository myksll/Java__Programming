package dailyVideos.day27_accessModifiers;

import java.sql.SQLOutput;

public class TestCydeoStudentObject {

    public static void main(String[] args) {


        //instance variables
        CydeoStudent student1 =new CydeoStudent("Ekaterina",29,'F');

        CydeoStudent student2 =new CydeoStudent("Alena",28,'F');


        System.out.println(student1);
        System.out.println(student2);

        //static variables
        System.out.println(student2.schoolName); // we can take true results. that is not the best way
        System.out.println(student1.secretCode);


        System.out.println(CydeoStudent.secretCode); //giving class name , taking static block-->that is better way.
        System.out.println(CydeoStudent.schoolName);






    }
}
