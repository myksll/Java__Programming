package dailyVideos.day27_accessModifiers;

public class CydeoStudent {

    public String name; //instance variables
    public int age;
    public char gender;

    public static String schoolName; //static variables
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {  //to set the instance variables
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
     /*
       //what if I use static variables in Constructor, disadvantages:if you create 15 objects from CydeoStudent class, how many times this code fragments will be repeated 15 times. I need only one time Cydeo School and Wooden Spoon.

        schoolName = "Cydeo School";
        secretCode ="Wooden Spoon";
      */

        static{   //for the static variables we need to use static block
            schoolName ="Cydeo School";  //one time will be executed.
            secretCode ="Wooden Spoon";
        }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';



    }
}
