package dailyVideos.day15_whileLoop;

public class duplicatedInterview {
    public static void main(String[] args) {

        String str= "aabbbcccc";

        String result= "";   //"abc"

        for (int i = 0; i <str.length() ; i++) {     // i: index number of str

            char each = str.charAt(i);              // each character of the String str


            if (!result.contains(""+each)) { // if the String result does not contain the character of the string str yet
                result += each;  //then we will add the character to string result
            }

        }

        System.out.println(result);
    }
}

/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */