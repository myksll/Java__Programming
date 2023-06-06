package dailyVideos.day35_polymorphism;

import dailyVideos.day34_abstraction.animalTask.*;
import dailyVideos.day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "Bengal", 'M',5,"Large", "Orange");//that is not polymorphism
        //if there is no polymorphism , i can call any methods in this class,

        tiger.eat();
        tiger.drink();
        tiger.hunt();
        tiger.sleep();


       Animal tiger1 = new Tiger("Sher Khan", "Bengal", 'M',5,"Large", "Orange");//that is polymorphism
        //if there is  polymorphism , i can only call methods in Animal class, hunt is  in tiger class(object class), so i can not call hunt method
         // tiger1.hunt();-->does not exist in Animal class(reference type)

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();

        Animal animal = new Eagle("Kasimir", "American Eagle",'M',3,"Small", "Black-White");
        //animal.fly();-->i can not call fly method that does not exist in reference class(Animal class) fly exists in object class(Eagle)

        animal.sleep();
        animal.drink();
        animal.eat();

        Flyable eagle= new Eagle("Kasimir", "American Eagle",'M',3,"Small", "Black-White");

        eagle.fly();
        System.out.println(eagle.canFly);

        /* these methods do not exist in reference class
        eagle.sleep();
        eagle.drink();
        eagle.eat();
         */

        //Array list
        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle2 = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot, eagle2, duck};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};


        //instanceof keyword-->it must be a relationship between 2 objects
        //boolean isAnimal= cydeoCar instanceof Animal; -->it gives compiler error
        boolean isAnimal= dog instanceof Animal;
        System.out.println("isAnimal = " + isAnimal);



        System.out.println("------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020,55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar= car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot=car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);





    }

}
