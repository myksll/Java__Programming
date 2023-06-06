package dailyVideos.day07_ifStatements;

public class NestedIf {
    public static void main(String[] args) {

        int score = 65;

        if (score >= 0 && score <= 100) {   //if the score is valid


            if (score >= 60) {   // if the score is  greater or equal to 60
                System.out.println("Passed");
            } else {   //if the score is less than 60
                System.out.println("Failed");
            }
        } else {    //if the score is not valid
            System.out.println("Invalid score");
        }


        System.out.println("-------------------------------------------------------------------------------------");


        int age = 120;   // 1~150        what if the age is 1524? than--it is not logic .

        if (age >= 1 && age <= 150) {

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        } else {
            System.out.println("invalid age");
        }


        System.out.println("--------------------------------------------------------------------------------------------");

/*
1.solution

it is not the best solution. it is not recommended. During the run time, java executes the code from top to bottom.
All of them has to be checked.This is not practice,

                    int day=34;


                    if(day==1){
                        System.out.println("Monday");
                    }else if(day==2){
                        System.out.println("Tuesday");
                    }else if(day==3){
                        System.out.println("Wednesday");
                    }else if(day==4){
                        System.out.println("Thursday");
                    }else if(day==5){
                        System.out.println("Friday");
                    }else if(day==6){
                    System.out.println("Saturday");
                    }else if(day==7){
                        System.out.println("Sunday");
                    }else{
                        System.out.println("Invalid number");
                    }

 */
//2. solution

        int day = 51;

        if (day >= 1 && day <= 7) {

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

            } else {//if the precondition is failed
                System.out.println("Invalid number");
            }


        }

    }




