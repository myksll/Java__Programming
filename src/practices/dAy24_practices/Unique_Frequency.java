package practices.dAy24_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique_Frequency {
        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1,2,2, 3, 3, 4, 5, 6,7,7));

            //for loop
            String result="";
            for(Integer each : list){
                int count = Collections.frequency(list,each);
                if(count==1){
                    result+=each+" ";
                }
            }
            System.out.println(result);

            System.out.println("--------------------------------");


            //without for loop
            list.removeIf(p-> Collections.frequency(list,p)>1);
            System.out.println(list);

            //nums.removeIf(p -> nums.indexOf(p) != nums.lastIndexOf(p));--->System.out.println(nums);



        }

    }
/*
1. Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops

 */

