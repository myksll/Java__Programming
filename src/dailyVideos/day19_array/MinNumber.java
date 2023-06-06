package dailyVideos.day19_array;

public class MinNumber {


    public static void main(String[] args) {


        int[] numbers = {100,20,500,40,-10,30};

        int min = numbers[0]; //i: 0---> 100. assume that first element is the minimum number

        for (int i = 1; i < numbers.length; i++) { // i: 1,2,3,4,5

            if(numbers[i]< min){  // if ( index 1 <0 ) max=index[0], if(index 2 <1 ) max=index[1],if(index 3 <2 ) max=index[2],.....
                // compares the element of the array with current minimum number

                min = numbers[i]; // replace the current minimum number
            }

        }

        System.out.println("min: "+ min); //max: 500


    }
}
/*
	2. Write a program that can find the minimum number from an array
 */