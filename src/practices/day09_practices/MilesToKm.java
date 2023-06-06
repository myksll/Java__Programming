package practices.day09_practices;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles");
        double miles = input.nextDouble();

        input.close();

        double km = 1.609 * miles;

        System.out.println(miles+" miles equal to " + km + " kilometers" );

    }
}
/*
Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */