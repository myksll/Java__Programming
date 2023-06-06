package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 ={10,20,30} ; //single arrays are usually contained for elements
        int[] arr2 ={40,50,60,70,80} ;
        int[] arr3 ={90,100} ;
        int[] arr4 ={1000,2000} ;

        System.out.println("------------------------------------------------------------");

        // multi dimensions arrays are contained for arrays

   // index of elements    0  1  2 ,  0  1  2  3  4 ,  0   1  ,  0 1
         int[][] arr2D ={ {10,20,30},{40,50,60,70,80},{90,100}, arr4 }; // arr2D length is { how many single dimension array contained here
  //  index number of array    0           1             2       3

        System.out.println(arr2D.length); //4 -----> 4 single dimension array

        System.out.println(Arrays.toString(arr2D[1]));  //single dimension---->Arrays.toString().
        System.out.println(Arrays.toString(arr2D[2]));  //[90, 100]
        System.out.println(Arrays.toString(arr2D[0]));  //[10, 20, 30]

        System.out.println(arr2D[2][0]);// 90    multi dimension----> Arrays.
        System.out.println(arr2D[1][2]);// 60


    }
}


