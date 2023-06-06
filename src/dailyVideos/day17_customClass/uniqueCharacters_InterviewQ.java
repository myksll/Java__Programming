package dailyVideos.day17_customClass;



public class uniqueCharacters_InterviewQ {
    public static void main(String[] args) {


// this solution is not the best solution

            String 	str = "aabcccd"; // output:bd
            String unique="";

        for (int i = 0; i < str.length();  i++) {  // i : index numbers of str
                char each= str.charAt(i);

                if(str.indexOf(each) == str.lastIndexOf(each) ){ //ex: a: first index;0 != last index;1                   // but b: first index == 2 last index:2 so: b can be added to unique
                    unique += each;
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