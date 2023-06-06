package dailyVideos.day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max=-2147483648;   //the smallest int number = -2147483648 // if max is equal to 0, o will be greater than all negative number. that will be wrong answer.

        for( int i = 0; i < 5; i++){

            System.out.println("Enter a number:");
            int num=input.nextInt();

            if(num > max){     //if the user entered entry is greater than the current maximum number that we have
                max = num;    //then user entered number should be the maximum number
            }
        }

        System.out.println("Maximum number = "+max);
input.close();
    }
}
/*
Warmup tasks:
	1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number

 */