package SundayLiveClass.week4;

import java.util.Scanner;

public class Url {
    public static void main(String[] args) {

   Scanner input= new Scanner(System.in);

        System.out.println("Enter a url"); //www.google.com
        String url=input.nextLine();


        boolean validStarts= url.startsWith("www");
        boolean validEnds=url.endsWith(".com") || url.endsWith(".edu")||url.endsWith(".gov")||url.endsWith(".org");

        if(validStarts&&validEnds){

            System.out.println(url+ " is a valid url for "+ url.substring(url.indexOf(".")+1, url.lastIndexOf(".com")));
        }else{

            System.out.println("Sorry, "+ url +" is not a valid because it is missing these: ");

            if(!validStarts){
                System.out.println("www. in the beginning");
            }

            if(!validEnds){
                System.out.println(".com , .org, .edu or .gov in the end");
            }
        }



















    }
}
/*
Url [Scanner, String methods, conditional]

	Create a program that will allow the user to enter a url.
	The program will verify if the given url is valid and if it is print the domain name

	A url is valid if it has "www." in the beginning and has either .com, .org, .edu. or .gov at the end

	If the url is valid print the domain name part: $url is a valid url for google

		ex: www.google.com
			www.google.com is a valid url for google

	If the url is not valid print the reason it is not valid:

		ex: amazon.com
		Sorry, amazon.com is not valid because it is missing these:
			www. in the beginning

		ex: youtube
		Sorry, youtube is not valid because it is missing these:
			www. in the beginning
			.com, .org, .edu, or .gov in the end
 */