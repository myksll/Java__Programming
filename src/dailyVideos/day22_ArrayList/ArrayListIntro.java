package dailyVideos.day22_ArrayList;

import java.util.Arrays;
import  java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        //Array

       int[] array = new int [5]; //  array contains 5 elements , it is not possible to  more, or less element--->[0, 0, 0, 0, 0]

        array[0]=10;  // we can change the value of array by giving new value--->[10, 0, 0, 0, 0]
        array[1]=20;  //[10, 20, 0, 0, 0]

        System.out.println(Arrays.toString(array));// it gives default value for  index of 2,3,4 --->[10, 20, 0, 0, 0]

        System.out.println("---------------------------------------------------------------------------------------------------");


        //size()

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);//[]
        System.out.println(list.size()); //0











    }
}
