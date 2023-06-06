package practices.day09_practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double n1 = input.nextDouble();

        System.out.println("Enter the math operator");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number:");
        double n2 = input.nextDouble();

        input.close();

        switch (operator){
            case '-':
                System.out.println(n1-n2);
                break;

            case '+':
                System.out.println(n1+n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            case '/':
                System.out.println(n1-n2);
                break;

            default:
                System.out.println("Invalid Operator");

        }




    }
}
/*
Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"

 */