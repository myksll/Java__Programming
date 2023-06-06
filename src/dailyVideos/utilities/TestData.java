package dailyVideos.utilities;

import dailyVideos.day27_accessModifiers.AccessModifiers;
import dailyVideos.day27_accessModifiers.Data; //at First, we imported our class
public class TestData {

    public static void main(String[] args) {


        //I can call all static variables and method with class name(Data)
        System.out.println(Data.d);  //static variables
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();  //static classes
        Data.method4();


        //I can call instance variables and methods with objects(obj1)
        Data obj1= new Data();

        System.out.println(obj1.a); //instance variables
        System.out.println(obj1.b);
        System.out.println(obj1.c);

        obj1.method2(); //instance classes
        obj1.method1();

        // would it be possible for all the statics & instances  without import statement(at first done)  --> it is not necessary

        System.out.println("---------------------------------------------------");

        //AccessModifiers

        //public
        System.out.println(AccessModifiers.publicDate);  //public is always accessible outside the package

        //protected
        // System.out.println(AccessModifiers.protectedData); ///protected is not always accessible in different packages

        //default
        //System.out.println(AccessModifiers.defaultData); default--> default is never accessible through the different package

        new AccessModifiers(); // constructor is public. it is accessible in different packages. but the others not visible.

    }
}
