package SundayLiveClass.week5;

public class iq_palindrome {


    public static void main(String[] args) {

        System.out.println(palindrome("merve"));
        System.out.println(palindrome("annanna"));
    }
   // 1. solution
    public static boolean palindrome(String str) {

        for (int begin = 0, end=str.length()-1 ; begin< str.length()/2; begin++,end--) {   //or end> str.length()


         if(str.charAt(begin) != str.charAt(end)){   // the characters are different
             return false;
         }

        }

          return true;
    }

  // 2. solution
    public static boolean palindrome2(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if( str.charAt(i) != str.charAt (str.length()-1-i) ){
                 return false;
            }
        }
        return true;
    }

    // 3.solution
}
/*
[IQ] Palindrome [method, String, loop]

	create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
	A palindrome is when the characters being read from the beginning match the characters being read from the end. In other words, it can be thought as the reverse of a word being the same as the original word

		Ex:
			racecar
			true

			anna
			true

			abc
			false

			abcba
			true
 */