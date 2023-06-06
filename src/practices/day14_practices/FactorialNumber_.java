package practices.day14_practices;

import java.util.Scanner;

public class FactorialNumber_ {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        double num= scan.nextDouble();

        double result=1;
        for (int i = (int)num; i>=1 ; i--) {
            result *= i;
        }
    }

}