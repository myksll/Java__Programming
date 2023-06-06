package practices.day11_practices;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a word");
        String word=input.next();


          if(word.charAt(0)=='x'){

              System.out.println(word.replaceFirst("x","a"));
          }



    }
}
/*
create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */