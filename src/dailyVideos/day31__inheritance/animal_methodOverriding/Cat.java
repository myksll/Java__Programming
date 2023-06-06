package dailyVideos.day31__inheritance.animal_methodOverriding;

public class Cat extends Animal{

    //constructor
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }



    //overriding
    // cat eats different food from the other animals~method overriding
    public void eat(){
        //super.eat();--> i can not use same implementation. i should change

        System.out.println("Cat "+ getName() + " is eating cat food"); //it is taken from Animal class. because we need to change some information(food)
    }

    public void sleep() {
        System.out.println("Cat "+getName()+" sleeps 12 hours in a day");
    }



    //method
    public void scratch(){  //that is not overriding method. in parent class, there is no this method.
        System.out.println("Cat "+getName()+" is scratching");
    }







}
