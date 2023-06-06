package dailyVideos.day29_inheritance.AnimalTask;

public class Dog extends Animal {   // extends for inheritance-->Dog is an animal
      //    child        Parent

/*
    public void method() {
        System.out.println(name);   //7 Variables
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();  //5Methods
        eat();
        drink();
        sleep();
        toString();
        }
    */

    public  void bark(){
        System.out.println(getName()+ " is barking");
    }


}
/*
7 Variables
5 Methods
We do not declare them. we have ANIMAL CLASS
 */