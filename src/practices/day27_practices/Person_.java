package practices.day27_practices;

public class Person_ {

    //instance
    String name;
    int age;
    char gender;
    String language;



    //Static
    static String planet;
    static boolean isHuman;
    static boolean hasNose;
    static int numberOfWings;
    static int numberOfHead;

    public Person_(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }


    static{
        planet="World";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }

    public static void printPlanetName(){
        System.out.println("They live in"+planet);
    }

    public void eat(String food){
        System.out.println(name+ " is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+drink);
    }

    public String toString() {
        return "Person_{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
