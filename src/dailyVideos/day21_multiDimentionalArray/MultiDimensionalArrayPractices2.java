package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractices2 {
    public static void main(String[] args) {

        int[][] arr2D1= { {1,2},{3,4,5} };
        int[][] arr2D2= { {6,7,8,9},{10,11},{12,13,14} };
        int[][] arr2D3= { {15,16,17,18}};




//index number of elements     0  1   0 1 2     0 1 2  3    0  1   0  1  2     0  1  2   3   --->System.out.println();
// index of 1d array            0       1          0        1         2           0        ------> toString
            int[][][] arr3D= {{{1,2},{3,4,5}}, {{6,7,8,9},{10,11},{12,13,14}},{{15,16,17,18}}};
// index number of 2d array:3        0                        1                       2       ---->deepToString

 // [index number of 2d array][ index of 1d array] [index number of element]

  System.out.println(Arrays.deepToString(arr3D));//[[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11], [12, 13, 14]], [[15, 16, 17, 18]]]

        System.out.println(Arrays.deepToString(arr3D[1])); //[[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        System.out.println(Arrays.toString(arr3D[0][1])); //one dimensional Array--> toString [3, 4, 5]
        System.out.println(Arrays.toString(arr3D[1][0])); //[6, 7, 8, 9]
        System.out.println(arr3D[0][1][2]); //5


        System.out.println("-------------------------------------------------------------------------------");
        // every single array will be applied

        for (int i = 0; i < arr3D.length; i++) { //i: index number of each 2 dimensional array
                int[][] arr2D= arr3D[i];

            for (int j= 0; j < arr2D.length; j++) {//j: index number of each 1 dimensional array
                 int[] arr1D  =arr2D[j];

                for (int k = 0; k< arr1D.length; k++) { //k: index number of each 2 element
                    int elements= arr1D[k];

                    System.out.println(elements);
                }


            }

        }

    }
}
