package SundayLiveClass.week6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IQ_PrimeInRange {
    public static void main(String[] args) {

        //saims solution ---->  important

        int range = 50;
        for (int j = 2; j <= range; j++) { //num = j

            boolean isPrime = true;

            for (int i = 2; i < j; i++) {
                //  System.out.println(num+"%"+i+" "+(num%i)); //you can control every step

                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            //  System.out.println(isPrime);

            if (isPrime) {
                System.out.print(j + ", ");
            }
        }
    }

    public static boolean isPrime(int j) {

        for (int i = 2; i < j; i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static String primeInRange(int range) {

        String prime = "";

        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                prime += i + ", ";
            }
        }

        return prime.substring(0, prime.length()-2);  // tekrar gercek koda bak olmadi bu

    }
}


   /* Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int num= scan.nextInt();

        for(int i=2; 6*i +1<=num; i++)

            if( num)



    }


    public static  int number(int num){
String prime=
"";
        if(num>1 && (num==(6*num+1) || num==6*num-1) ){
           prime= num+" is prime number";

        }else{
            System.out.println("false");

        }

        return num;
    }
}
/*
[IQ] Prime in range [nested loop, methods, conditional]

	create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

	a number is a prime number when it is only divisible by 1 and itself

	ex:
		Input:
			50
		Output:
			2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */