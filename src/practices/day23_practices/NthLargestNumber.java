package practices.day23_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 5;

        for (int i = 0; i < n; i++) {

            arrayList.removeAll(Arrays.asList(Collections.max(arrayList)));
            //System.out.println(n);   //  5 5 5 5 5
            //System.out.println(i);   //  0 1 2 3 4
                                     //  8 7 6 5 4 -->3

        }


        System.out.println(arrayList);// the rest list after removing the first 5 maximum numbers --->[1,2,3]
        System.out.println(Collections.max(arrayList)); //3 -->max number of the rest list





    }
}
/*
4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */