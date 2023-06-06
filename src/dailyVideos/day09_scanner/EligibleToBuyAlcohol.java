package dailyVideos.day09_scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age: ");

        int num=input.nextInt();

        if(num>=21 && num<=150){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible");
        }

 input.close();

    }
}
