package dailyVideos.day25_constuctor;

public class ConstructorInfo {  //no parameter  so, that is default constructor, no argument

    public  ConstructorInfo(){  //multiple Constructors, same Constructor=different parameter-->it has to be overloaded

        System.out.println("Object is created by using no argument constructor");

           }


    public ConstructorInfo(int a){//no return type(void), no specifier(static)

        System.out.println("Object is created by using int argument");
    }



    public static void add(){ //static is optional , instance  method

    }


    public static void main(String[] args) { //main method

        new ConstructorInfo();

        ConstructorInfo obj1=  new ConstructorInfo(10); //each object has a different memory

        ConstructorInfo obj2=  new ConstructorInfo(10);

        ConstructorInfo obj3=  new ConstructorInfo(10);
    }


    public static class Employee {




    }
}
