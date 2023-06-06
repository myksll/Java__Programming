package dailyVideos.day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="aaabbbbccccc";

        String result="";     // output:a3b4c5

        //how can I create Collection out from String?
        //--> we can not create directly , however we can create Array out from the String-->by using str.split()method

        for (String each : str.split("")) { //String array-->that is non-primitive ,so it can be created Collection type

          int frequency =  Collections.frequency(Arrays.asList(str.split("")) , each );

            if(! result.contains(each)){
                result+= each+frequency;
            }
        }
        System.out.println(result);//a3b4c5


        System.out.println("-----------------------------------------------------------------------------");














    }
}
