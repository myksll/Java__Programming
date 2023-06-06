package dailyVideos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));


        int sum=0;

        for (int i = 0; i < arrayList.size(); i++) {
            int each = arrayList.get(i);
            sum+=each;
        }


        double average= sum/(double) arrayList.size();  //casting int to double
        System.out.println(average);




    }
}
/*
2. Write a program that can find the average number from an arrayList of integers
 */