package practices.day14_practices;

import java.util.Scanner;

public class sumOfAllNumber_ {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();


        if(num<0){
            System.out.println("invalid number");
        }else{

            int sum=0;

            for (int i = 1; i <= num ; i++) {
                sum += i;
            }
            System.out.println(sum);
        }



    }

}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275


 */