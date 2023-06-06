package practices.day19_practices;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        String[] array = {"java", "kö"};


       String[] reversedArray = new String[array.length]; // first reveredArray is assigned


         for (int i =array.length -1, j=0  ; i >=0 ; i--,j++) { // in loop, j and i are given a value

          reversedArray[j] = array[i];
           }


        System.out.print(Arrays.toString(reversedArray));

    }
}

/*
6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */