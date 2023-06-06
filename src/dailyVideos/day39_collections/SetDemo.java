package dailyVideos.day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); //Arraylist has an order , and accepts duplicates. keeps insertion order, has index

        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);

        System.out.println("------------------------------------------------------------------------------");

        Set<Integer> set1 = new HashSet<>(); //accepts null key
        set1.addAll(Arrays.asList(10,200,300,40,90)); //order is random --<on console-->[200, 40, 10, 90, 300]
        System.out.println(set1);

        set1.addAll(Arrays.asList(10,200,300,40,90)); //hash set can not be duplicated. output will be ony one set1 hash set
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(null,null, null));

        System.out.println(set1);

        System.out.println("------------------------------------------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>(); //keeps insertion order, accepts null key

        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null,null, null));

        System.out.println(set2);

        System.out.println("------------------------------------------------------------------------------");

        Set<Integer> set3 = new TreeSet<>(); //keeps sorted order, does not accept duplicate

        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
       // set3.addAll(Arrays.asList(null,null, null));  NullPointerException

        System.out.println(set3);

        System.out.println("------------------------------------------------------------------------------");

        String[] words = {"Java","Java","Java","Python","Python","C#"};

        LinkedHashSet<String> result = new LinkedHashSet<>();

        result.addAll(Arrays.asList(words));


        System.out.println(result); //same order but only once time used--[Java, Python, C#]


        /*
        //System.out.println(result.get(1));--> linkedHashset has not index numbers, so we can not get method with it.

        for (String each : result){
            System.out.println(each);
        }
         */  // instead of using loop , if i get second element --<  use arraylist constructor

        System.out.println(new ArrayList<>(result).get(1)); //arraylist has all element of the linked list--->Python

        //i need to print only unique words --< toArray -->it comes from Collection
        words = result.toArray(new String[0]);

        System.out.println(Arrays.toString(words));


        System.out.println("------------------------------------------------------------------------------");

        List<Integer> numbers =new ArrayList<>();

        numbers.addAll(Arrays.asList(10,10,10,20,20,30,30,30,40,40,50,50,5,5,5,2,2,9,9));//i want to remove duplicates and sort them, so i use "treeList"

        Set<Integer> n = new TreeSet<>(numbers); //List to the Set

        //n.addAll(Arrays.asList(numbers)); --<false

        System.out.println(n);//[2, 5, 9, 10, 20, 30, 40, 50]

    }
}
