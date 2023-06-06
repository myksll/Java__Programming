package practices.day09_practices;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age=input.nextInt();

        System.out.println("Enter your gender");
        String gender= input.next();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("Enter your phone number");
        long phoneNum=input.nextLong();

        System.out.println("Enter your  zip code");
        int zipCode=input.nextInt();

        input.nextLine();

        System.out.println("Enter your School name");
        String schoolName=input.nextLine();

        System.out.println("Enter your city name");
        String cityName= input.nextLine();

        System.out.println("Enter your state name");
        String stateName= input.next();

        System.out.println("Enter your building number");
        int buildingNum=input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName=input.nextLine();

        input.close();

        String result="1. "+fullName+"\n2. "+ age+"\n3. "+gender+"\n4. "+phoneNum+"\n5. adress:\n\t"+buildingNum+" "+streetName+"\n\t"+ cityName+","+zipCode+"\n6. "+schoolName;

        System.out.println(result);
    }
}
