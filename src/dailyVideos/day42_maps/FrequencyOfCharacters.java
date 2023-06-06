package dailyVideos.day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";//they are same order so use Linked Hash map

        //Map<String,Integer> map = new LinkedHashMap<>();if we write the code in String, each is String , that will no problem, but if we write with Character, we use charAt(0) method. it will give char.
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {   //str.split--> String array, so we need to convert to Collection type(List) by using as lIst method from arrays utility  class
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            //System.out.println(each+ " : "+ frequency);

            map.put(each.charAt(0),frequency);

        }
        System.out.println(map);//{b=2, c=3, a=5}










    }
}
/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */