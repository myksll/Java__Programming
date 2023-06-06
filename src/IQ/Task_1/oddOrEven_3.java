package IQ.Task_1;

import java.util.Scanner;

public class oddOrEven_3 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        while(true){

            System.out.println("Please enter a number: ");
            int number = input.nextInt();

            if(number>0 && number% 2 ==0){
                System.out.println("The given number is even: "+number);
            }else{
                System.out.println("The given number is odd: "+number);
            }

            System.out.println("Would you like to enter another number ? Yes/No");
            String answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Entry! Would you like to enter another number? Yes/No");

            answer= input.next().toLowerCase();

        }
        if(answer.equals("no")){
            break;
            }

    }

    }
}
