package dailyVideos.day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

       //Alphabet letter ascending~descending


        char[] ascending = new char[26]; //index: 0 ~25
        char[] descending = new char[26]; //index: 0~25

        for (int i = 0 , j ='A', k = 'Z' ; i < ascending.length; i++, j++,k--) {
            ascending[i]= (char) j;
            descending[i]= (char) k;
        }

        System.out.println(Arrays.toString(ascending));   //  [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
        System.out.println(Arrays.toString(descending)); //   [Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]

        System.out.println("------------------------------------------------------------------------------------------------");


        //How many characters are there that are supported in Java? -->65000 characters
        //create char array that contains  all the characters

        char[] characters = new char[65535]; // how can I store it into  all these array characters?

        for (int i = 0; i < characters.length; i++) {
            characters[i] =(char) i;
        }

        System.out.println(Arrays.toString(characters));
    }



}
/*
    3. Create a char array and store all the alphabet letters in ascending order

	4. Create a char array and store all the alphabet letters in descending order
 */