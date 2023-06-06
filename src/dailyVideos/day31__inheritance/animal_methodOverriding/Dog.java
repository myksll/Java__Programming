package dailyVideos.day31__inheritance.animal_methodOverriding;

public class Dog extends Animal{

    //constructor
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    //overriding
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    public void sleep() {
        System.out.println("Dog "+getName()+" is sleeping 10 hour");
    }

    //method
    public void bark(){
        System.out.println("Dog "+getName()+" is barking");
    }



}
