package dailyVideos.day28_encapsulation.encapsulation;

public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();

        //student.age=-20; //invalid but we can not control because of public access modifier

        //student.age=-20;//it is not accessible outside the class for the private

        //System.out.println(student.getAge()); //but now with Getters , it is accessible  //output : default value:0


        student.setAge(25); //25
        System.out.println(student.getAge()); //but now with Getters and setters , it is accessible  //output : 25 after setters method

        System.out.println("--------------------------------------------------------");


        student.setName("1Merv4e");
        System.out.println(student.getName()); //if I did not write setName(), it prints null

        System.out.println("--------------------------------------------------------");








    }
}
