package dailyVideos.day40_collections;

import java.util.*;

public class IterablePractice_IQ {
    public static void main(String[] args) {

        //How Many iterator do we have?--> 0
        ArrayList<Integer> list =  new ArrayList<>();

        Iterator<Integer> iterator = list.iterator();

        System.out.println(iterator.hasNext());// false-->//How Many iterator do we have?--> 0. if hsa Next method is false , we can not take next() method.it gives -->NoSuchElementException

        ArrayList<Integer> list1 =  new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));

        Iterator<Integer> iterator1 = list1.iterator();

        System.out.println(iterator1.hasNext());// true-->//How Many iterator do we have?--> 1
        System.out.println(iterator1.next());//10
        System.out.println(iterator1.next());//20


        System.out.println("--------------------------------------------------------------------------------");

        //remove any Ahmed name(it is not important -> lowercase uppercase)
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Daniel", "Mustafa", "Mohommed", "Ahmed","ahmed","Chris"
        ));

        Iterator<String> it =names.iterator();

        while(it.hasNext()){
            String each = it.next();

            if(each.equalsIgnoreCase("Ahmed")){
                it.remove();
            }
        }
        System.out.println(names);//[John, Daniel, Mustafa, Mohommed, Chris]

        //removeIf
        // names.removeIf(p-> p.equalsIgnoreCase("Ahmed"));
        //  System.out.println(names);

        System.out.println("--------------------------------------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Daniel", "Mustafa", "Mohommed", "Ahmed","ahmed","Chris"
        ));

        names2.removeIf(p-> p.equalsIgnoreCase("Ahmed"));

        System.out.println(names2);//[John, Daniel, Mustafa, Mohommed, Chris]

        System.out.println("--------------------------------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        //find the nth largest number --> for example: 1. largest->9, 2. largest->8

        int n = 5; //fifth maximum number?

        for (int i = 0; i < n-1 ; i++) { // n-1--> remove four max numbers then rest max number will be our new max number
            numbers.removeIf(p-> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);
        System.out.println(max);

    }
}
