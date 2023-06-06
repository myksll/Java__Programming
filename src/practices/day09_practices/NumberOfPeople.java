package practices.day09_practices;

import java.util.Scanner;

public class NumberOfPeople {
    public static void main(String[] args) {

   Scanner input=new Scanner(System.in);

   System.out.println("How many people do you live with?");
   int num=input.nextInt();

   input.close();  // we no longer need scanner after this line

   String result=" ";

   if(num>0 && num<3){
       result="Live with less than 3 people";
   }else if(num>=3 && num<=6){
       result="Live with 3 - 6 people";
   }else{
       result="Live with more than 6 people";
   }

        System.out.println(result);

    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */