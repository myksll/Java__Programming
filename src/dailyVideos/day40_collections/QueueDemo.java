package dailyVideos.day40_collections;

import java.lang.reflect.Array;
import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); //order is random, does not accept null
        queue1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
       // queue1.addAll(Arrays.asList(null,null));// it gives NullPointerException

        System.out.println(queue1);

       int num1 =  queue1.poll();//first in, first out
       int num2 =  queue1.poll();//first in, first out
       int num3 =  queue1.poll();//first in, first out

        System.out.println(num1); //10
        System.out.println(num2); //10
        System.out.println(num3); //10



        System.out.println("-------------------------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); //it keeps insertion order
        queue2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
       // queue2.addAll(Arrays.asList(null,null));// it gives NullPointerException

        System.out.println(queue2);

        int number =  queue2.poll();
        System.out.println(number);

        queue2.poll();
        System.out.println(queue2);


        System.out.println("-------------------------------------------------------------------------------");


        Queue<Integer> queue3 = new LinkedList<>(); //exact ,insertion order,allows duplicates,accepts null, has index numbers
        queue3.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue3.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue3.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        queue3.addAll(Arrays.asList(null,null));

        System.out.println(queue3);

        queue3.poll();

        System.out.println( ((LinkedList)queue3) .get(5));

        System.out.println("-------------------------------------------------------------------------------");

        List<Integer> list =new LinkedList<>();

        list.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(list.get(2));

        //list.poll(); reference type has not poll method

        ( (LinkedList)list).poll(); //it is possible with down casting
        System.out.println(list);

        //Last in first out
        ( (Stack )list).pop(); //ClassCastException














    }
}
