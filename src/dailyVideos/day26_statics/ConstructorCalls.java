package dailyVideos.day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){


        System.out.println("Default Constructor"); //how can we have more than one constructor?--->by overloading
    }

    public ConstructorCalls(int a){
        this();       //public ConstructorCalls(){
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        this(5);    // public ConstructorCalls(int a){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){

        this(5.5);   //public ConstructorCalls(double b){
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {
        method1();

        System.out.println("---------------------------------------");

        method2();



    }

     public static void method1(){
         System.out.println("Method 1");
     }

     public static void method2(){//for the regular method,we can use one method in the other one,but it is not valid for constructor method
         method1();

        System.out.println("Method 2");
     }




}
