package practices.dAy24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecialChar {

    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        Character[] list2 =list.toArray(new Character[(list.size())]);
      /*  //special Characters
        list.removeIf(p-> (p>='0' && p<= '9') ||  (p>='A'&& p<='Z'));
        System.out.println(list);//[$, @, !]
       */

      list.removeIf(p-> ! Character.isLetterOrDigit(p));
        System.out.println(list);//[A, B, 1, 2, C, D, 3, 4]


    }
}
/*
4. Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']

	Note: DO NOT use any loops

 */

