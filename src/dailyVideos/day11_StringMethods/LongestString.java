package dailyVideos.day11_StringMethods;


import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first String ");
        String first = input.nextLine();

        System.out.println("Enter the second String ");
        String second = input.nextLine();

         input.close();


//  !!! if(first>second)---> it can not used on this way. Relational operator are used only with numbers.

         if(first.length()> second.length()){       //------>    it is going to give the number
             System.out.println("first string is the longest");
         }else if(second.length()>first.length()){
             System.out.println("second string is the longest");
         }else{
             System.out.println("Equal");
         }









    }
}
/*
 Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
 */