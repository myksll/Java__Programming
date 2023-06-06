package dailyVideos.utilities;

//import  dailyVideos.day27_accessModifiers.Data; 1.way to call statics and instance

import static dailyVideos.day27_accessModifiers.Data.*;  //2.way to use astra*

public class Test2 {

    public static void main(String[] args) {

// would it be possible for all the statics & instances  without import statement(at first done)  --> it is not necessary--->import dailyVideos.day27_accessModifiers.Data;

        //we can call static methods and variables through *

        System.out.println(d);

        method3();

        System.out.println(e);
        System.out.println(f);

        method4();



        /* but we can not call instance methods and variables through *
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);

         method1();
         method2();
       */
    }
}
