package SundayLiveClass.week4;

import java.util.Scanner;

public class ModifyWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);
        String middle=word.substring(1,word.length()-1);


        if(first==last){
            System.out.println(middle);
        }else{
            System.out.println("*"+middle+"#");
        }


    }
}

 /*
    ModifyWord [indexes, conditional]
	Create a program that will ask the user to enter a word. Check if the word starts and ends with the same character. If they are the same delete those characters
	if the characters we not the same replace the first charter to be '*' and the last character to be #
	print the results
     */