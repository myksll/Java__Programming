package SundayLiveClass.week6;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        //my solution
        Scanner scan = new Scanner(System.in);

             String shoppingList="";
             String answer="";

            do{
                System.out.println("ENTER THE ITEM PLEASE");
                String item=scan.nextLine();

                shoppingList += "\n\t*" + item;  // = shoppingList += scan.nextLine();
                System.out.println("Do you want to add more items?");
                answer = scan.nextLine();


            }while(answer.equals("yes"));

        System.out.println(shoppingList);

            //saims solution
    }
}
/*
Shopping List [do while, String] [Simpler Version of the advance replit task]

	create a program that create a shopping list for the user. The program will ask the user to enter the items one by one.

	the flow:
		ask the user for the item
		add item to the shopping list
		ask user if they want to add more items

	when the user is done creating the list print it
 */