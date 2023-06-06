package practices.day26_practices;

public class TestCydeoStudentsObjects {

    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("Kholupi",29,'M',12356,'A', 29,11);

        student1.study();
        student1.attendClass();

        System.out.println(student1.toString());

        student1.printSchoolName();

        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolName();






    }
}
