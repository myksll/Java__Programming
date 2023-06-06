package practices.day27_practices;

public class CydeoStudentt {

    //static
    public static String schoolName;
    public static String secretCode;
    public static String programmingLanguage;

    //instance
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    public CydeoStudentt(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        schoolName="Cydeo School";
        secretCode="Wooden Spoon";
        programmingLanguage="Java";
    }


    public static void printSchoolName(){
        System.out.println("School name: "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret Code: "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudentt{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
