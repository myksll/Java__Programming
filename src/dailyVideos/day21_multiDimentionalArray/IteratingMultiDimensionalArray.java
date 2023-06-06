package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

//for loop

//index of elements :     0  1   2  ,  0   1  2  3  4  ,   0  1
        int[][] arr2D ={ {10,20,30} , {40,50,60,70,80} , {90,100} };
 // index of 1D Array :       0          1               2           -------> that is the length of arr2D


        for (int i = 0 ; i < arr2D.length; i++){

                                                                              // System.out.println(arr2D[i]); ----> it gives hashcode
             int[] each1D = arr2D[i];
                                                            //System.out.print(Arrays.toString(arr2D[i])); //[10, 20, 30][40, 50, 60, 70, 80][90, 100]
            System.out.println(Arrays.toString(each1D)); //[10, 20, 30][40, 50, 60, 70, 80][90, 100]

            for(int j= 0 ; j < each1D.length; j++){  // j is the index number of elements -->j starts with 0 to last index

                int eachElement = each1D[j];

                System.out.println(eachElement);// 10, 20 , 30 ...

            }

        }
        System.out.println("----------------------------------------------------------------------");


//for each loop
         // if we want to print all numbers in array, use for each loop


        for ( int[] each1DArray :arr2D){  // we need each index with Data structure .--> we take index of elements

            System.out.println(Arrays.toString(each1DArray)); //[10, 20, 30][40, 50, 60, 70, 80][90, 100] ---we found array

            for( int eachElement : each1DArray){  //we found all element -->
                System.out.println(eachElement); //10,20,30...
            }
        }

        System.out.println("----------------------------------------------------------------------");

//shortcut:::> reverse ArrAY

        for (int i = arr2D.length - 1 ; i >= 0 ; i--) {
            for (int j = arr2D[i].length - 1 ; j >= 0 ; j--) {
                System.out.println(arr2D[i][j]); //100, 90.80.....
            }
        }

        System.out.println("----------------------------------------------------------------------");

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement); //10,20,30,..
            }
        }
        System.out.println("--------------------------------------------------------------------------");

        }
    }

