package dailyVideos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {


        ArrayList<Integer> arraylist= new ArrayList<>();
        arraylist.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6));


        for (int i = 0; i < arraylist.size(); i++) {
            Integer element =arraylist.get(i);

            int frequency=0;

            for (int j = 0; j < arraylist.size(); j++) {
                Integer each = arraylist.get(j);

                if (each == element) {
                    frequency++;
                }
        }
            if(frequency == 1){
                System.out.println(element);  //all the elements that are unique--->2,4,6
                break; //when we add break statement, it will print only first unique element. break; exit the loop.
            }

        }
    }
}
/*
3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */