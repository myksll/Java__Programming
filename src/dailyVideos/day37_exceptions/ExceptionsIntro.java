package dailyVideos.day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        //unchecked exception, unknown compile

        String str = "Java";

        // char ch = str.charAt(250); //unchecked exception, unknown compile
        // System.out.println(ch); //.StringIndexOutOfBoundsException

        Pizza pizza=null; //unchecked exception, unknown compile
        System.out.println(pizza);
        //pizza.calcCost(); //.NullPointerException


        //System.out.println(50/0);//.ArithmeticException


        System.out.println("Hello"); //it can not be executed because of compile

        System.out.println("-------------------------------------------------------------------");

        int score =100;

        if(score >59){
            System.out.println("Your grade is D");
        }else if( score > 70){
            System.out.println("Your grade is C");
        }

        System.out.println("-------------------------------------------------------------------");

        //FileInputStream file = new FileInputStream( ""); //--> we are getting error. checked exception

        //Thread.sleep(300); //checked exception. Intellij says always this compile


    }

}
