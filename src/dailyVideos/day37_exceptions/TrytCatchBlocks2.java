package dailyVideos.day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrytCatchBlocks2 {


    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1,2,3,4};

       // System.out.println(arr[1000]); //ArrayIndexOutOfBoundsException


        try{
            System.out.println(arr[1000]);

        }catch(RuntimeException e  ){
            e.printStackTrace(); // display full details of the exception after the execution of program
        }

        System.out.println("Program1 ended");

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Program2 started");


        try{ //if try block will be right, it will be eligible for the GARBAGE COLLECTION
            System.out.println(9/0); //ArithmeticException
        }catch(RuntimeException e){  //   catch (RuntimeException e)
            e.printStackTrace();
        }

        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------------------------------------------------");

        System.out.println("Program3 started");

        try{
         Thread.sleep(3000);
       }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program3 ended");


/*--> multiple try blocks are not possible
        try{

        }catch(RuntimeException e){

        }try{

        }try{

        }try{

        }
 */

        System.out.println("-------------------------------------------------------------------------------------------------------");


    }
}
