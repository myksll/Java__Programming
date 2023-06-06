package dailyVideos.day17_customClass;

public class uniqueCharacters2 {
    public static void main(String[] args) {

        //2. solution is the best

        String str = "aabcccd"; //bd

        String unique = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has apperaed in str
                if (str.charAt(i) == ch) {  //if thr ch has appeared in the string
                    frequency++;  // increase the frequency by 1
                }

            }
            if (frequency == 1) {  // if the frequency is one , then it is unique
                unique += ch;
            }
        }

        System.out.println(unique);
    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */