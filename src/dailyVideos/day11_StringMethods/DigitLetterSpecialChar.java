package dailyVideos.day11_StringMethods;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {


         String str=new Scanner(System.in) .nextLine();    // String str="";---->it is also true //now output is 0. but at least that should be 1.


        if(str.length() >=1){            //if the string has at least one character

            char f=str.charAt(0);        //the first character of string

            if(f>='0' && f<='9'){
                System.out.println("first character is digit");
            }else if(f>='a'&& f<='z'){
                System.out.println("first character is lowercase letter");
            }else if(f>='A'&&f<='Z') {
                System.out.println("first character is uppercase letter");
            }else{
                System.out.println("first character is special character");
            }
        }else{
            System.out.println("String is empty");
        }










    }
}




       /* Scanner input= new Scanner(System.in);

        System.out.println("Enter a word");
        String word=input.next("first character is digit");


        char firstChar=word.charAt(0);

         if(word.equals(firstChar)>48 && word.equals(firstChar)<57){
         }
        */



/*
Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
 */