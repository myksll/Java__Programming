package practices.day27_practices;

public class Dog_ {

    //static
    static int numberOfLegs;
    static int numberOfEyes;
    static int numberOfWings;

    //instance
    String breed;
    String size;
    char gender;
    int age;
    String color;
    boolean isFriendly;

    public Dog_(String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }


    static{
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
    }


    public void eat(){
        System.out.println(breed+" is eating");
    }

    public  void drinking(){
        System.out.println(breed+" is drinking");
    }

    public void sleeping(){
        System.out.println(breed+" is sleeping");
    }

    public void playing(){
        System.out.println(breed+" is playing");
    }

    public void bark(){
        System.out.println(breed+" is barking");
    }

    public String toString() {
        return "Dog_{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
