package dailyVideos.day12_customsMethods;

import java.util.Scanner;

public class formatFullName {
    public static void main(String[] args) {


     Scanner input=new Scanner(System.in);

     System.out.println("Enter your first name");
     String firstName=input.nextLine().trim().replace(" ","");

     // trim() & replace() methods will make sure that the white spaces & additionals spaces between character will be removed.

     System.out.println("Enter your last name");
     String lastName=input.nextLine().trim().replace(" ","");

     input.close();

     firstName = firstName.substring(0,1).toUpperCase()  +  firstName.substring(1).toLowerCase(); //'C'+"ydeo"-->output
     //          getting first character of first name   +  the remaining character of the first name


     lastName = lastName.substring(0,1).toUpperCase()  +  lastName.substring(1).toLowerCase();


     System.out.println(firstName+" "+lastName);
    }
}

/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */