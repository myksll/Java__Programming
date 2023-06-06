package dailyVideos.day16_nestedLoop;

public class frequencyOfCharacter {
    public static void main(String[] args) {

        String str = "ccccccccaabdcbbcccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index number of str

            if( str.charAt(i) == ch ){ // if the character of the String is equal to the given character , it means the given character has appeared
                count++;
            }
        }

        System.out.println(count);
    }
}
/*

        2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */