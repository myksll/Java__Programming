package dailyVideos.day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        //frequency
        String str = "aabcccdeeeef";//they are same order so use Linked Hash map


        Map<Character,Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            map.put(each.charAt(0),frequency);

        }
        System.out.println(map);//{b=2, c=3, a=5}

        System.out.println("-------------------------------------------------------------------------------------------");

        //unique
        String str2 = "aabcccdeeeef";//they are same order so use Linked Hash map

        Map<Character,Integer> map2 = new LinkedHashMap<>();

        for (String each : str2.split("")) {
            int frequency2 = Collections.frequency(Arrays.asList(str2.split("")), each);

            if(frequency2 == 1)
                map2.put(each.charAt(0),frequency2);//{b=1, d=1, f=1}
            }

             System.out.println(map2);//

    }
}
/*
	2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}

 */