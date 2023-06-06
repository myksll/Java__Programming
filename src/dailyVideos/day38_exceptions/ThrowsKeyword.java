package dailyVideos.day38_exceptions;


public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {//when we use throws method one time, all same exceptions will be handled

        /*
        System.out.println("Program1 started");

        //System.out.println(100/0);// THROWS IS NEVER BE USED ON UNCHECKED EXCEPTION.


        try{ //disadvantage; we use 6 lines to get rid of the exception, it is not the good choice

            Thread.sleep(3000); //unhandled exception--> Interrupted Exception
        }catch(InterruptedException e){
            e.printStackTrace();

        }

        System.out.println("Program1 ended");


        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Program2 started");

        try{ //disadvantage; we use 6 lines to get rid of the exception, it is not the good choice

            Thread.sleep(3000); //unhandled exception--> Interrupted Exception
        }catch(InterruptedException e){
            e.printStackTrace();

        }


        System.out.println("Program2 ended");

         */

        System.out.println("Program1 started");

        Thread.sleep(3000); //unhandled exception--> Interrupted Exception

        System.out.println("Program1 ended");

        System.out.println("-----------------------------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(3000); //unhandled exception--> Interrupted Exception

        System.out.println("Program2 ended");

        System.out.println("-----------------------------------------------------------");

        System.out.println("Program3 started");

       // FileInputStream file = new FileInputStream("");

        System.out.println("Program3 ended");


    }




}
