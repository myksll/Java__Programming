package dailyVideos.day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        String str="Cydeo";
        // index:   01234

        // CHAR METHOD



        char firstChar=str.charAt(0);
        char secondChar=str.charAt(1);
        char thirdChar=str.charAt(2);
        char fourthChar=str.charAt(3);
        char fifthChar=str.charAt(4);

       // char sixthChar=str.charAt(5); //(1~4) String index out of range: 5   --> so that is error



        System.out.println("firstChar = " + firstChar);  //C
        System.out.println("secondChar = " + secondChar); //y
        System.out.println("thirdChar = " + thirdChar);   //d
        System.out.println("fourthChar = " + fourthChar); //e
        System.out.println("fifthChar = " + fifthChar);   //o


        System.out.println("------------------------------------------------------------------");

        //LENGTH METHOD

        String sentence= "Java Programming Language";
          //index:        012345678910111213141516171819202122232425   25characters
        int length= sentence.length();

        System.out.println(length);   //25 characters in this string sentence

        int lastIndex=  length-1;    //24
        System.out.println(lastIndex);

        System.out.println("-------------------------------------------------------------------");

//practices

        String s1= "Java is the best Programming language";

        char firstCha= s1.charAt(0);

        int lasIndex= s1.length()-1;

        char lastCha=s1.charAt(lasIndex);

        System.out.println("firstCha = " + firstCha);
        System.out.println("lastCha = " + lastCha);
        System.out.println("lasIndex = " + lasIndex);
        System.out.println(firstCha+" : "+lastCha);

        System.out.println("--------------------------------------------------------------------------");

        //Equals

        String name1="Umran";
        String name2=new String("Umran");

        System.out.println(name1==name2);  //false
        System.out.println(name1.equals(name2));   //true   ---> compare to those String values. they are going to return literal


        System.out.println("-----------------------------------------------------------------------------");

       /*
        String r1="Java";
        String r2="Java";
        String r3="Java";

        System.out.println(r1==r2); //true  they are in string pool. there is one "Java".
        */
        String r1="Java";
        String r2="Java";

        String r3=new String("Java");

        System.out.println(r1==r2);  //true
        System.out.println(r1==r3);  //false
        System.out.println(r2==r3);  //false

        System.out.println(r1.equals(r3));  //true
        System.out.println(r2.equals(r3));  //true

        System.out.println("----------------------------------------------------------------------");

        Scanner input=new Scanner(System.in);

        System.out.println("How old are you");
        int age = input.nextInt();

        System.out.println("Are you a US citizen yes/no");
        String UsCitizen=input.next();


       /* if(age>=21 && UsCitizen=="yes") {

        //equal operator ---> this object is created by using the new keyboard. this "yes" and yes on the output are not same. yes(new keyboard)== yes on the output(String pool) not equal.

            System.out.println("Eligible to vote");
        }else{
            System.out.println("not eligible to vote");        whatever i write here, it gives the result "not eligible to vote".
        }
        */

        if(age>=21 && UsCitizen.equals("yes")){

        // we have to use always equals method to compare as strings. otherwise you will have a bug.

        System.out.println("Eligible to vote");

        }else{

        System.out.println("not eligible to vote");
       }

        input.close();

    }
}
