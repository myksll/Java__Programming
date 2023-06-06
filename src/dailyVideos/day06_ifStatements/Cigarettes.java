package dailyVideos.day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {


        int age=20;

        boolean isELigible= age>=21 && age< 100;

        if(isELigible) {

            System.out.println("You are eligible to buy Cigarettes");

        }


        if(!isELigible) {

            System.out.println("You are not eligible to buy Cigarettes");

        }
        System.out.println("------------------------------------------------------------------------");


       if (age>= 21 && age<100) {

           System.out.println("You are eligible to buy Cigarettes");
       }


        if(age<21 || age>100) {

            System.out.println("You are not eligible to buy Cigarettes");
        }













    }
}
