package dailyVideos.day29_inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        //parent class variables
        Dog dog = new Dog();
        System.out.println(dog); //Dog{name='null', breed='null', gender= , size='null', color='null', age=0}

        dog.setInfo("Max","Husky", 'M', "Large", "White", 4);
        System.out.println(dog); //Dog{name='Max', breed='Husky', gender=M, size='Large', color='White', age=4}


        Cat cat = new Cat();
        System.out.println(cat); //Cat{name='null', breed='null', gender= , size='null', color='null', age=0}

        cat.setInfo("Felicia", "Stray",'F',"Small", "Black and White",3);
        System.out.println(cat);


        Tiger tiger = new Tiger();
        System.out.println(tiger); //Tiger{name='null', breed='null', gender= , size='null', color='null', age=0}
        tiger.hunt();//null is hunting

        tiger.setInfo("Shere Khan", "Bangal",'M', "Large", "Orange", 5);
        System.out.println(tiger);

        System.out.println("----------------------------------------------------------------------------------------");

        //parent class method
        dog.eat();
        cat.drink();
        tiger.sleep();

        System.out.println("----------------------------------------------------------------------------------------");

        //child class method
        dog.bark();
        cat.meow();
        tiger.hunt();

        System.out.println("----------------------------------------------------------------------------------------");

        //getter method
        System.out.println(dog.getName());

        System.out.println(dog.getAge());

        //we can change the variable with setters method
        dog.setGender('F');
        System.out.println(dog.getGender());




    }

}
