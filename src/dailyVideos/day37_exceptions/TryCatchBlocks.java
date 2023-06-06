package dailyVideos.day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program1 started"); //it will be printed

      //  System.out.println(9/0);//unchecked exception-->//write that on try block
      //  System.out.println("Program ended"); //because of exception, program will be executed, not printed

        try{
            System.out.println(9/0);//unchecked exception
            System.out.println("Try block");

        }catch( ArithmeticException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program1 ended"); //because of exception, program will be executed, not printed

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

       // System.out.println(str.toLowerCase()); //write that on try block

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");

        }catch( RuntimeException e){ //NullPointerException-Exception-Throwable--> Runtime exception is best
            System.out.println("Catch Block2");
            }

        System.out.println("Program2 ended");

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Program3 started");

        //Thread.sleep(3000);//InterruptedException --> checked exception

        try {
             Thread.sleep(3000);
            System.out.println("Try block3");

        }catch( InterruptedException e){ //
            System.out.println("Catch Block3");
        }


        System.out.println("Program3 ended");
    }
}
