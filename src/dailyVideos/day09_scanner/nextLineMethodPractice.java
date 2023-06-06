package dailyVideos.day09_scanner;

import java.util.Scanner;

public class nextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);//EntetEnter

        System.out.println("Enter your full name: "); //Aaron Daniel+ Enter
        String full_name= input.nextLine();


        System.out.println("Enter your school name");
        String school_name= input.nextLine();     //Cydeo School+ Enter

        System.out.println("Enter your gender: ");
        char gender=input.next().charAt(0); //Male/female

        System.out.println("Enter your age: "); //28+Enter
        int age=input.nextInt();

        input.nextLine(); // we must add this code between nextLine method and before the nextLine method (but nextLine+nextline =ok)

        System.out.println("Enter your street name: ");
        String street_name=input.nextLine();


        System.out.println("full_name = " + full_name);
        System.out.println("school_name = " + school_name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("street name = " + street_name);

    }
}
