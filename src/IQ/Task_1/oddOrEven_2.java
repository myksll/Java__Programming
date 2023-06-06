package IQ.Task_1;

import java.util.Scanner;

public class oddOrEven_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: " );//we will see on console

        int number = scan.nextInt();

        if( number>0 &&  number%2 ==0){
            System.out.println("The given number is even: "+number);
        }else{
            System.out.println("The given number is odd: "+number);
        }

       scan.close();


    }
}
