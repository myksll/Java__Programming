package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {

        int[] arr1D=new int[5];  // single dimensional Array...>contained for element
        //System.out.println(Arrays.toString(arr1D));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]...> element

        arr1D[0]=100;  //we assign arr1D numbers.
        arr1D[1]=200;
        arr1D[2]=300;
        arr1D[3]=400;
        arr1D[4]=500;

        System.out.println(Arrays.toString(arr1D)); //[100, 200, 300, 400, 500]

        System.out.println("------------------------------------------------------------------------");

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9,10};
        int[] arr4 = {11,12,13,14,15};
        int[] arr5 = {16,17,18,19,20};

        //int[] arr6 = {30,40,50,60,70,80}; ---that is exception. Only we can do 5 array

        int[][] arr2D = new int[5][] ;// 2 dimensional Array...>  index:0~4 ...>contained for array
       //System.out.println(Arrays.toString(arr2D)); //[null, null, null, null, null] ...>object

        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;



        System.out.println(Arrays.deepToString(arr2D));
        //[[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20]]




    }
}
