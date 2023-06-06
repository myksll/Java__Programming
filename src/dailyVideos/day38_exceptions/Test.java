package dailyVideos.day38_exceptions;

import dailyVideos.utilities.Library_Exceptions;

import java.time.LocalTime;

public class Test {


    public static void main(String[] args) {  //throws InterruptedException

        System.out.println("Hello Cydeo");

         // Thread.sleep(3500);
        Library_Exceptions.sleep(3.5);

        System.out.println("How are you today?");


        System.out.println("--------------------------------------------------");

        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();
        }

        // throw new RuntimeException("Something went wrong");
         throw new BreakTimeException("It is time to go home");
        //throw new BreakTimeException();








    }
}
