package dailyVideos.day19_array;

public class MaxNumber {

    public static void main(String[] args) {


        int[] numbers = { 100,20,500,40,-10,30};

        int max = numbers[0]; //i: 0---> 100. assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) { // i: 1,2,3,4,5

            if(numbers[i]> max){  // if ( index 1 >0 ) max=index[1], if(index 2 >1 ) max=index[2],if(index 3 >2 ) max=index[3],.....
             // compares the element of the array with current maximum number

                max = numbers[i]; // replace the current maximum number
            }

        }

        System.out.println("max: "+ max); //max: 500










    }
}
/*
1. Write a program that can find the maximum number from an array
 */