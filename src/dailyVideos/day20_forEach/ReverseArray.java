package dailyVideos.day20_forEach;


import dailyVideos.utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

            int[] array = {6,2,3,4,5};
            int[] reversedArray = new int [array.length]; //{5,4,3,2,1,}

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversedArray[j] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));

        System.out.println("-------------------------------------------------");

        int[] nums={100,200,300,400,500,600};

        nums= ArraysUtility.reversedArray(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------------------------------------");

        double[] a1 = {10.5,45.4,88.4,88.3};
        a1 = ArraysUtility.reversedArray(a1);

        System.out.println(Arrays.toString(a1));

        System.out.println("-------------------------------------------------");

        char[] ch ={'A','B','C'};

        ch= ArraysUtility.reversedArray(ch);

        System.out.println(Arrays.toString(ch));


    }
}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */