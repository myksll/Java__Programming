package dailyVideos.day16_nestedLoop;

public class frequencyOfWord {

    public static void main(String[] args) {

        //while loop

       String sentence = "java JAVA jAvA JAva";
       String word = "Java";

         int count = 0;

         while(sentence.contains(word)){

             count++;

         sentence = sentence.replaceFirst(word, ""); // "Java Java Java "

         }

        System.out.println(count);






    }
}
/*
	3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4

 */