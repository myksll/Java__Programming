package dailyVideos.day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){

        this();  //calling the default constructor
       // this("a");-->it is going to give error. Constructor must be the first step
        System.out.println("Int arg");
    }

    public ConstructorCalls2(String a){
        this(10);
        System.out.println("String arg");
    }

   //what is the benefit to create more constructor?--->it gives you more options when you create objects

    public static void main(String[] args) {                                       //chains rules

        ConstructorCalls2 obj1= new ConstructorCalls2(); //default constructor    output--->default

        System.out.println("--------------------------------------------------");

        ConstructorCalls2 obj2= new ConstructorCalls2(10); //int argument      output-->default + int arg

        System.out.println("--------------------------------------------------");

        ConstructorCalls2 obj3= new ConstructorCalls2("m"); //int argument     output -->default + int arg + String arg

    }

}
