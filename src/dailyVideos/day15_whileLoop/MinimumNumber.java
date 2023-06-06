package dailyVideos.day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int min=2147483647 ;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num=input.nextInt();

          if(num < min){
              min = num;
          }
        }

        System.out.println("Minimum number= "+min);
        input.close();
    }
}
/*
2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */