package dailyVideos.day27_accessModifiers;

public class AccessModifiers {

    //3 variables 3 methods

    public static int publicDate =200 ; //static variables = within the same class, I can access this variable
                                        // how about outside class?---> open Test_StaticInitializationBlock
    //what is the disadvantages of public: public Data is less restrictive(secure), less control



     //protected access modifiers -->protected is accessible within same package , but the outside of the package is not accessible
    protected static int protectedData =300;


    //default(no modifier)
    // default static int defaultData; //default is keyword for the method. Default is specifier , not access modifier
    static int defaultData = 400;  //default will not be written. but we will understand that is default


    //private
    private static int privateData = 500; ///it is only accessible within the same class



    public AccessModifiers(){  //constructor with public
    }


    //accessible in same class:  all of them
    //accessible in different class , within in same package : public, protected, default
    //accessible within in same package: public is always. but protected is not always accessible. the others never accessible
    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }
     static void defaultMethod(){
        System.out.println("Default");
    }
    private static void privateMethod(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicDate);// 200
        System.out.println(protectedData);
        System.out.println(defaultData); //default is accessible within the same class
        System.out.println(privateData );///it is only accessible within the same class
        new AccessModifiers();
    }







}
