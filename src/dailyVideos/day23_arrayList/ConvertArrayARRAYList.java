package dailyVideos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayARRAYList {

    public static void main(String[] args) {


        String[] arr={"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list); //[A, B, C, D]

        System.out.println("---------------------------------------------------------------------------");

        //What are the difference between array and collection?

        //*Array´s advantages--->it supports any type(primitive and non-primitive)
        //                  ----> it can be multidimensional
        //                  ----> in terms of performance, array has the fastest performance

        //Array´s disadvantages--->the size of array is fixed-->you can not increase or decrease-->so you have to know the size
        //                    ---->we create Utility class on array, because they are still many methods that are not available in array

        //*Collection´s advantages----->the size is dynamic-->increase or decrease
        //                       ----->it is standard of the data structure because it has a lot of ready methods.

        //Collection´s disadvantages----->it can not support primitive types
        //                          -----> it can not be multidimensional
        //                          -----> performance of collection is not as fast as array is


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java" ,"Python","C#"));

        String[] languages2 = list2.toArray(new String[0] ); //this way can be used to convert ->[Java, Python, C#]
        System.out.println(Arrays.toString(languages2));//[Java, Python, C#]

        String[] languages3 = list2.toArray(new String[list2.size()] ); //this way can be also used-->[Java, Python, C#]
        System.out.println(Arrays.toString(languages3));//[Java, Python, C#]

        String[] languages = list2.toArray(new String[10] ); //before assigning the array, we need to convert with toArray method
        System.out.println(Arrays.toString(languages));//[Java, Python, C#, null, null, null, null, null, null, null]


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        Integer[] n = nums.toArray(new Integer[nums.size()]);
        System.out.println(Arrays.toString(n));//[1, 2, 3, 4, 5, 6, 7, 8]

         //if we try to convert int(primitive) to array
        // int[] n = nums.toArray(new Integer[nums.size()]);--->we will take compiler







    }
}
