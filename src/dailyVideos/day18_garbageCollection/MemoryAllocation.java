package dailyVideos.day18_garbageCollection;


import dailyVideos.day17_customClass.Employee;

class Car{

     public String brand;
     public String model;
     public String color;
     public int year;
}

public class MemoryAllocation {
    public static void main(String[] args) {

        int a = 100;  // local variable--->stack

                    Car car =  new Car();
// reference variable(stack)    heap


        System.out.println("------------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2=employee1;



    }


    public static void method1(){

        int b = 200; // local variable--->stack
    }


    public static void method2() {

        String c = "HeLLo World";
        //   stack    heap( String pool)


        String d = new String("Hello World");
        //   stack    heap ( outside the String pool)


    }
}