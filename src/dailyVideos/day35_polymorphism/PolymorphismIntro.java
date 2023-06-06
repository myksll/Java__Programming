package dailyVideos.day35_polymorphism;

import dailyVideos.day27_accessModifiers.Circle;
import dailyVideos.day33_abstraction.employeeTask.Teacher;
import dailyVideos.day33_abstraction.employeeTask.Developer;
import dailyVideos.day33_abstraction.employeeTask.Driver;
import dailyVideos.day33_abstraction.employeeTask.Employee;
import dailyVideos.day33_abstraction.employeeTask.Tester;
import dailyVideos.day34_abstraction.animalTask.*;
import dailyVideos.day34_abstraction.carTask.Audi;
import dailyVideos.day34_abstraction.carTask.Car;
import dailyVideos.day34_abstraction.carTask.Honda;
import dailyVideos.day34_abstraction.carTask.Tesla;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky",'M',4,"Small","White");

        Cat cat = new Cat("Max", "Husky",'M',4,"Small","White");

        Tiger tiger = null;
        Lion lion = null;
        Eagle eagle = null ;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        //array supports objects but
        // Dog[] animals= {dog,cat,tiger,lion,eagle}; --> we can not store in the array all these objects, but except for dog objects, the others can not have any relationship between Dog.

        Animal[] animals = {dog,cat,tiger,lion,eagle,parrot,dolphin,shark,duck}; //it should be general, it should contain all animals
        //it is polymorphism--> parent references to the child objects

        Animal animal = cat; //Animal can have reference type with cat

       // Animal animal = new Tesla();--<there is no "IS A" relationship between Animal and Tesla.


        Animal animal1 = new Dog("Max", "Husky",'M',4,"Small","White");
        animal1.eat();
        animal1.drink();
        animal1.sleep();

        /*
        animal1.bark();--> these methods is in dog class, not animal class
        animal1.play();
        */

        System.out.println("---------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Teacher teacher = new Teacher("James",   'M', 'M',"B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);



        Object[] objects = {str, n,r,d,circle, honda, audi, tesla, teacher, developer,driver,tester};

        System.out.println(Arrays.toString(objects));
      //usually when we apply the polymorphism , this is a very real cases you will use (Object[] objects)-->this is useful , if the objects are not in same category.


       Object[] employees = { teacher,developer,driver,tester}; //benefit: it is going to be specified, in polymrphisim ,we can only call the variables and methods that are exited in reference type(Employee).

       Object obj = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

       /*
        //I can not call these methods that the objects have , so it is good to write specific objects(Employee) instead of Object
        obj.work();
        */


       Employee object = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
       object.work(); //this work method will be executed from Developer class


        Employee object1 = new Teacher("James",   'M', 'M',"B1", "Math Teacher", 75000);
        object1.work(); //this work method will be executed from Teacher class

        System.out.println("---------------------------------------------------");

        Tesla tesla1 =new Tesla("ModelY","White",2020,55000);//we call the methods from Tesla class
        tesla1.start();
        tesla1.autoPilot();


        /*
        Car tesla2 =new Tesla("ModelY","White",2020,55000); //we call the methods from Car class, so it is not called, because these methods are not in the Car class

        tesla2.start(); //start method has protected access modifier  ,outside the package, protected is visible only in subclass
        tesla2.autoPilot();
         */






















    }

}
