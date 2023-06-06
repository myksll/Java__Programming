package dailyVideos.day10_string;

import java.util.Scanner;

/*
if I take all import package from here, it will give an error "Scanner input=new Scanner (System.in);
 String str="java";
 */

public class StringIntro {
    public static void main(String[] args) {


         Scanner input=new Scanner (System.in);
         String str="Java";

         System.out.println();

         input.close();

         System.out.println("---------------------------------------");
         //there are 4 String literal object so far. but only 2 string literal object are created in pool.


        String s1="Cat";
        String s2="Dog";

        String s3= "Cat";
        String s4= "Cat";

        System.out.println(s1==s3);  // all of them are true
        System.out.println(s1==s4);
        System.out.println(s3==s4);

        System.out.println("----------------------------------------------");

        String str1=new String("Java");    // Creates two objects 1. String pool 2. heap (outside String)
        String str2=new String("Java");

        System.out.println(str1==str2);  //false

        System.out.println("----------------------------------------------");

        String t1 = "Python";

        String t2 = new String("Python");  //now there is created a Python in String pool and a python outside String pool in heap.

        String t3= new String ("Python");  //now there are two python outside String pool


        System.out.println(t1==t2);  //false
        System.out.println(t1==t3);  //false
        System.out.println(t2==t3);  //false

    }
}
