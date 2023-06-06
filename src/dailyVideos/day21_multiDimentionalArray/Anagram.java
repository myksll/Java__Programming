package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

         String str1="heart";  //  sortOf---> ---->according to Ascii table--> aehrt
         String str2="earth";   //  sortOf---> ---->according to Ascii table--> aehrt

          // we need to use sortOf() method. but so we need to convert String to array by using Split or toChar Array method
          //  String[] a1 = str1.split("");

         char [] a1 = str1.toCharArray();
         char [] a2 = str2.toCharArray();

         System.out.println(Arrays.toString(a1)); //[h, e, a, r, t, h] ---> each elements is split by empty string
         System.out.println(Arrays.toString(a2)); //[e, a, r, t, h]

        //now we will check if the array have same characters--> anagram

         Arrays.sort(a1);  // we use sort method
         Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));  // both of them ---<[a, e, h, r, t]

        boolean isAnagram= Arrays.equals(a1,a2);  // a1 and a2 are Array , so we use Array.equals(a1, a2) method

        System.out.println("isAnagram = " + isAnagram); //isAnagram = true

    }
}
//Anagram: same letters , same number of characters in random order