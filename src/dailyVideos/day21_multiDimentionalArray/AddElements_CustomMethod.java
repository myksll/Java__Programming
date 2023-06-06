package dailyVideos.day21_multiDimentionalArray;

import dailyVideos.utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements_CustomMethod {
    public static void main(String[] args) {

         int[] array= {1,2,3,4,5};
         int element = 6;

         //{1,2,3,4,5,6}    I want to put 6 in array ,so I need a new array. we want to use a few times, so we need custom method

         int[] newArray= Arrays.copyOf(array,array.length+1) ; // ---> [1, 2, 3, 4, 5, 0]
         newArray[newArray.length-1] =element;  //last index=6


         System.out.println(Arrays.toString(newArray));

        System.out.println("--------------------------------------------------");

         int[] numbers = {100,90,80,70,60};

        numbers= ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));//[100, 90, 80, 70, 60, 50]

        System.out.println("--------------------------------------------------");

        double[] nums = {1.5,2.5,3.5};

        nums= ArraysUtility.addElement(nums, 5.5);
        System.out.println(Arrays.toString(nums));//[1.5, 2.5, 3.5, 5.5]

        System.out.println("--------------------------------------------------");

        String[] array1= {"merve", "feyza"};

        array1= ArraysUtility.addElement(array1,"karaca");

        System.out.println(Arrays.toString(array1));

        System.out.println("---------------------------------------------------");

        char[] arr2= {'A','B','C','D'};

        arr2=ArraysUtility.addElement(arr2, 'E');
        System.out.println(Arrays.toString(arr2));//[A, B, C, D, E]
        arr2=ArraysUtility.addElement(arr2, 'F');
        System.out.println(Arrays.toString(arr2));//[A, B, C, D, E,F]
    }

}
