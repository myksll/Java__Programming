package practices.dAy24_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecondMaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6,-68, 7, 8, 8,89,-500,500, 8, 8));
//1.way
        //second max
        int max= Collections.max(list);
        list.removeAll(Arrays.asList(max));
        System.out.println(max);

        int secondMax =Collections.max(list);
        System.out.println(secondMax);

        //second min
        int min= Collections.min(list);
        list.removeAll(Arrays.asList(min));
        System.out.println(min);

        int secondMin=Collections.min(list);
        System.out.println(secondMin);

        //2.way (saim's way)

        list.removeIf(p-> p == Collections.max(list) || p == Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops

 */