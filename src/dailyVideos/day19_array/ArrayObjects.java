package dailyVideos.day19_array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {


        int[] arr1 = {10,20,30,40,50};
          // this is an array object. the size of array:5 . the elements are between 10~50.this array is allocated in the Heap memory.

         //  int[] arr2 = {45,5,66};   //--->we are using new keyboard and independent object is created.

        int[]  arr2 = arr1;  // I assigned  first array object to the second array variable.
        int[]  arr3 = arr2;

        // in this situation , only one object is created in heap memory--> {10,20,30,40,50};
        // Three variables that are referencing to the array object --->arr1, arr2, arr3


        arr1[0]=1000; // I changed first array variable to first element
        arr2[2]=3000;  // at the end of the day there is one object so all of three variables will change.

        System.out.println(Arrays.toString(arr1));
        //if we do not use--> Arrays.toString(arr1), if we use System.out.println(arr1) , it will give hashcode
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------------------------------------------------------------------");

        String[] a1 = { "Umran", "Mehmet"};

        a1 = new String[]{"James", "Daniel"}; // we assigned with new array object to reference name(a1)

        System.out.println(Arrays.toString(a1));
















    }
}
