package dailyVideos.day11_StringMethods;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        /*
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username= input.next();

        System.out.println("Enter your password");
        String  passWord= input.next();

        input.close();

        if ( username.equals("Cydeo") && passWord.equals("WoodenSpoon") ){
            System.out.println("You are log in");
        }else{
            System.out.println("Incorrect username or password. Please try again");
        }
        */


        String correctUsername="Cydeo",                     //literal   in the pool
               correctPassword="WoodenSpoon";               //literal


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username= input.nextLine();                 //new keyword   outside the pool


        System.out.println("Enter your password");
        String password= input.nextLine();

        input.close();

        if(username.equals(correctUsername) && password.equals(correctPassword)){             // if(username==correctPassword) two different object must be used equal method
            System.out.println("You are log in");
        }else {
            System.err.println("Incorrect username or password. Please try again");            //it will be written with the color red---> because of the err shortcut
        }



    }
 }
/*
Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon

 */