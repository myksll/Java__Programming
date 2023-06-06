package SundayLiveClass.week14;

import java.sql.SQLOutput;

public class ExceptionExample {
    public static void main(String[] args) {




       // System.out.println(s.length());//NullPointerException

        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("String can not be null");
            System.out.println("Do these steps: ");
        }

        System.out.println("End");

        System.out.println("-------------------------------------------------------------------");

        try{
            System.out.println("Hello");
            Thread.sleep(2000);
            System.out.println("World");
        }catch(InterruptedException E){
            System.out.println();
        }

/*throws
       System.out.println("Hello");
        Thread.sleep(10000);
        System.out.println("World");
 */


        String str ="java";
        System.out.println(str.charAt(100));






    }
}
