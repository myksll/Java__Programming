package practices.day26_practices;

public class CydeoStudent {

    //instances
    public String name;
    public int age;
    public char gender;
    public int id,  batchNumber, groupNumber;
    public char grade;


    //statics
    public static String schoolName= "Cydeo School";
    public static String magicWord= "Wooden Spoon";



    public CydeoStudent(String name, int age, char gender, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public void study(){
        System.out.println(name+ " is studying");
    }

    public void attendClass(){
        System.out.println(name+ " is attending class ");
    }

    public static void printSchoolName(){
        System.out.println("School name is: "+schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("The name of programming language is "+ magicWord );
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
