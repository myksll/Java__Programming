package dailyVideos.day26_statics.studentTask;

public class TestStudentObjects {

    public static void main(String[] args) {


        Student student1=new Student("Sebestian", 23, 'M', "A27");
        Student student2=new Student("Sebile", 29, 'F', "B27");
        Student student3=new Student("Sery", 27, 'F', "C27");
        Student student4=new Student("Sebo", 23, 'M', "d27");

        Student[] students ={student1,student2,student3,student4};  //public void addStudent(Student[] students){}1.way easy



        StudentsGroup group1 = new StudentsGroup("Java Turtles",1); // public void addStudent(Student student) {}2.way
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);


        group1.addStudent(students); //--ARRAY OF STUDENT--->  Student[] students ={student1,student2,student3,student4};

        group1.addStudent("Khashayar", 34,'M',"F34");//public void addStudent(String name, int age, char gender , String id){
        System.out.println(group1);

        System.out.println("--------------------------------------------------------------------------");
        group1.removeStudent("F34");
        System.out.println(group1);

        group1.removeStudent("d27");
        System.out.println(group1);

        System.out.println("--------------------------------------------------------------------------");
        //   can I display names of every single student in group1? --> array + for each loop
        for (Student each : group1.students) {
            System.out.println(each.name);
            System.out.println(each.age);
            System.out.println(each.id);
        }

        System.out.println("---------------------------------------------------------------------------");
        //How many groups do we have in this batch?
        StudentsGroup group2 = new StudentsGroup("Java Turtles",1);
        StudentsGroup group3 = new StudentsGroup("Java Turtles",1);

        StudentsGroup[] groups = {group1,group2,group3};
    }

}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */