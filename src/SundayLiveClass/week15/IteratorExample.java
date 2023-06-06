package SundayLiveClass.week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        //mini task: remove all the element less than 5
        List<Integer> list = new ArrayList<>(Arrays.asList(4,2,5,4,8,9,6,3,2,2,5,5));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if( it.next() <= 5 ){
                it.remove();
            }
        }
        System.out.println(list);//[ 8, 9, 6]


    }
}
