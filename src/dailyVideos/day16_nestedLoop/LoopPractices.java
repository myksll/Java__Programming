package dailyVideos.day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 0; i < 6 ; i++) {

            System.out.println("Hello"+ i);
        }

     /*
          int i = 10;
          System.out.println(i);
      */

        System.out.println("------------------");

        for (int i = 0; i < 5; i++) {  //the most suitable , most readable , understandable
            System.out.println("Hello " + i);
        }

        System.out.println("-------------------");


        int j = 0 ;
        while(j < 5){     // for infinite loop
            System.out.println("Hello "+j);
            j++;
        }
        System.out.println("--------------------");

        int k = 0;
        do{
            System.out.println("Hello "+k);
            k++;
        }while(k <5);

        System.out.println("---------------------");

        // while loop is suitable for this condition

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your grade:");
        int score = input.nextInt();

        while( score > 100 || score < 0){ //while the score is invalid
            System.err.println("Invalid score! Please re-enter your score");
            score = input.nextInt();
            break;
        }

        if(score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }











    }
}
