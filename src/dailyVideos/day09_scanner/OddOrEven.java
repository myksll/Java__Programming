package dailyVideos.day09_scanner;

import java.util.Scanner;
public class OddOrEven {

    public static void main(String[] args) {

     Scanner input= new Scanner(System.in);

     System.out.println("Enter a number: ");

     int num= input.nextInt();


     if(num>0 && num%2==0){
         System.out.println("The number is even");
     }else{
         System.out.println("The number is odd");
     }

input.close();
    }
}
