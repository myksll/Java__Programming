package SundayLiveClass.week6;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        //my solution
        Scanner scan = new Scanner(System.in);

        String answer= "";

        while (!answer.equals("shutdown")) {

            System.out.println(">");
            String user = scan.nextLine();

            if (user.equals("hello")) {
                System.out.println("world");
            } else if (user.equals("what is your age")) {
                System.out.println("I was programmed in March");
            } else if (user.equals("who created you")) {
                System.out.println(" I was created by Merve");
            } else if (user.equals("what can we talk about")) {
                System.out.println("that is a menu of the options I can respond");
            } else if(user.equals("off")){
                System.out.println("haha you cannot turn me off I am invincible");
            }else {
                System.out.println("SHUTTING DOWN ");
                break;
            }
            }



        //saims solution

        }
    }
/*

Bot [while, Scanner, conditional]

	create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot

	user says | >bot responds

	hello | > world
	what is your age | > I was programmed in March
	who created you | > I was created by Saim (use your name)
	what can we talk about | > print a menu of the options the bot can respond to

	off | > haha you cannot turn me off I am invincible
	shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)
 */