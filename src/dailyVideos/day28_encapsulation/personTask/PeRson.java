package dailyVideos.day28_encapsulation.personTask;

public class PeRson {

    //instance-->different values
    public String name;
    public int age;
    public char gender;
    public String language;


    //Static --->value is common
    public static String planet;
    public static boolean isHuman, hasNose, hasWings;
    public static int numberOfWings, numberOfHead;

    public PeRson(String name) { //Allows us to create Person object just by setting the name of the person -->name
        this.name = name;
    }

    public PeRson(String name, int age) { //name, age
        this(name);
        this.age = age;
    }

    public PeRson(String name, String language) { //name, language
        this(name);
        this.language = language;
    }

    public PeRson(String name, char gender) { //name, gender
        this(name);
        this.gender = gender;
    }

    public PeRson(String name, int age, char gender) { //name, age, gender
        this(name,age);
        this.gender = gender;
    }

    public PeRson(String name, int age, char gender, String language) { //name, age, gender, language
        this(name, age, gender);
        this.language = language;
    }

    static {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }


    public static void printPlanetName(){ //static method--> we can not always use instance because....>objects takes memory, memory takes resource, resource costs.
        System.out.println("Planet name is "+planet);
    }

    public void eat(String food){ //instance method
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {  //instance variable will be automatically written in toString method
        return "PeRson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +      //we should write static variable manually
                '}';
    }
}
/*
		Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */