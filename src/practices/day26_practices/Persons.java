package practices.day26_practices;

public class Persons {

    //instance

     public String name;
     public int age;
     public char gender;

     //static

    public static boolean isHuman =true;
    public static boolean hasNose =true;
    public static boolean hasWings =false;

    public static int numberOfHead =1;
    public static int numberOfEyes= 2;


    static{
         isHuman =true;
         hasNose =true;
         hasWings =false;

         numberOfHead =1;
         numberOfEyes= 2;
    }

    public Persons(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
