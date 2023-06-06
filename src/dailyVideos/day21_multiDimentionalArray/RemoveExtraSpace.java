package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String str="  Hello world    I    love      Java      "; // Extra spaces should be removed

        //at the beginning and at the end of String can be removed by using Trim
           //str =  str.trim();
       // System.out.println(str); //Hello world    I    love      Java. no spaces at the beginning and at the end thank to Trim

        // we are converting String to Array
        String[] words = str.split(" "); // by using SPLIT, I can check every single elements in this Array

        System.out.println(Arrays.toString(words)); //[Hello, world, , , , I, , , , love, , , , , , Java] , ---> they are multiple spaces

        str = "";
        for( String each : words ){

            if(!each.isEmpty()){  //that means , if each is a word, not empty
                str+=each+" "; // at the last there is space so, we will use trim again
            }

        }
        str= str.trim();
        System.out.println(str);//Hello world I love Java



    }
}
