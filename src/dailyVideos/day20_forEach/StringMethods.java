package dailyVideos.day20_forEach;


import dailyVideos.utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        // toCharArray()--->it will give you char  = length of String--> it will return each character of String

        String str="Cydeo School";

        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch)); //[C, y, d, e, o,  , S, c, h, o, o, l]--> we have the characters of String

        char[] cha = str.replace(" ",""). toCharArray();// if we do not want to space, replace space(" ") to empty("")

        System.out.println(Arrays.toString(cha)); //[C, y, d, e, o, S, c, h, o, o, l]-->no space

        System.out.println("--------------------------------------------------------------------------------------------------------");

        //split()---->evey single word from the String --> word by word

        String str2 =  "Today is a great day to learn java";

        String[] words =  str2.split(" "); //7spaces--> 8 elements of String
        System.out.println(Arrays.toString(words));//[Today, is, a, great, day, to, learn, java]

        String[] words2 = str2.split("is"); //  is will be splited
        System.out.println(Arrays.toString(words2)); //[Today ,  a great day to learn java]

        System.out.println("--------------------------------------------------------------------------------------------------------");

        //reverse

        String sentence="I love Java"; // "Java love I"

        // String[] split = sentence.split(" ");// [ I, love,Java] --->split

        //1. way---> calling method + split
       String[] arr  = ArraysUtility.reversedArray(sentence.split(" ") ) ; // [Java, love, I]
       System.out.println(Arrays.toString(arr)); //[Java, love, I]


        String reversedSentence=""; //[Java, love, I]

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i]+" ";
        }

        System.out.println(reversedSentence); //Java love I











    }

}
