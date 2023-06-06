package practices.day09_practices;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter cents");
        int cents=input.nextInt();

        input.close();

       int dollar = cents/100;

       cents -= dollar * 100;

        System.out.println( dollar + " dollars "+  cents +" cents");

        //  2. solution ---> System.out.println(cents + " cents equal to: " +(cents/100)+ " dollars "+ (cents%100)+" cents");

    }
}
/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225
                output:
                225 cents equal to: 2 dollars and 25 cents
 */