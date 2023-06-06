package SundayLiveClass.week4;

import java.util.Scanner;

public class PennyMachine {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the numbers of pennies you have");
         int cents =input.nextInt();


         if(cents>0 && cents<=1200){
             int dollars,quarters,nickles,dimes;

             String msg= cents+" was converted to ";

             dollars=cents/100;
             cents%=100;
             msg+=dollars>0 ? dollars +" dollars, " : "";

             quarters=cents/25;
             cents%=25;
             msg+=quarters>0 ? quarters+" quarters," : "";

             dimes=cents/10;
             cents%=10;
             msg+=dimes>0 ? dimes + " dimes," :"";

             nickles=cents/5;
             cents%=5;
             msg+=nickles>0 ? nickles+" nickles, ": "";

             msg+= cents>0 ? cents+" pennies " : "";
             System.out.println(msg);
         }else{

             System.out.println("Sorry we cannot process your request");
         }


    }
}
/*

 PennyMachine [scanner, if, operators]

	Create a program that will ask the user to enter the number of pennies they have.
	 Use the number of cents they give and convert them to dollars, quarters, dimes, nickles,
	 and left over pennies. This machine can only handle from 1-1200 cents at a type

	-> if the given cents is not in our defined range (1-1200) print "Sorry we cannot process your request"

	-> if the cents are valid print the result in the following format:
		$initial_cents was converted to $dollars, $quarters, $dimes, $nickles, and $pennies

	Extra challenge: If there is 0 of a specific type do not include it in the final output
            1 dollar=100 cent
            1 penny=1 cent
            1 nickel=5 cent
            1 quarter =25 cent

 */