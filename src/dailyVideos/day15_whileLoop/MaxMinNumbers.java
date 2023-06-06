package dailyVideos.day15_whileLoop;

import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int max= -2147483648;  //Any integer number that user enter will always be greater than -2147483648
        int min=  2147483647;  // //Any integer number that user enter will always be less than 2147483647

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num > max){
                max = num;
            }

            if(num < min){
                    min = num;
                }
        }


        System.out.println("Minimum number= " + min);
        System.out.println("Maximum number= " + max);

        input.close();
    }
}
