package practices.dAy24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf_Digits {

    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

//1.way
        list.removeIf(p-> p>='0' && p<='9');
        System.out.println(list);

//2.way
        list.removeIf(p-> Character.isDigit(p));
        System.out.println(list);


    }
}
/*
2. Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops

 */

