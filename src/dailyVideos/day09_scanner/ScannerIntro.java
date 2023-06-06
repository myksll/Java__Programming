package dailyVideos.day09_scanner;

import java.util.Scanner;
//import java.util.*;                //wild import

public class ScannerIntro {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number: ");

        byte num1= input.nextByte();         //-128 ~ 127

        System.out.println("Enter your second number: ");

        short num2=input.nextShort();

        System.out.println("Enter your third number: ");

        int num3= input.nextInt();

        System.out.println("Enter your fourth number: ");

        long num4=input.nextLong();     // int num4= (int).input.nextLong();   explicit casting  long~int

        input.close ();   // scanner is closed, can not read users inputs again.

   /*
        System.out.println("enter your fifth number: ");
        int num5=input. nextInt();
        System.out.println("Your fifth number: "+num5);    Scanner is closed at line 28, once it is closed can not read inputs.
*/

        System.out.println("Your first number: "+num1);
        System.out.println("Your second number: "+num2);
        System.out.println("your third number: "+num3);
        System.out.println("Your fourth number: "+num4);
    }
}
