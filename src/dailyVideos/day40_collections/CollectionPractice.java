package dailyVideos.day40_collections;

import java.util.*;



public class CollectionPractice {

    public static void main(String[] args) {

        //list is reference type
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        List<Integer> list3 = new Stack<>();

        List<Integer> list4 = new Vector<>();

        //collection call its methods,   object type can not call its unique method(get)
        Collection<Integer> collection = new ArrayList<>();

        collection.add(10);
        collection.addAll(Arrays.asList(10,20,3,0,45,54));

        System.out.println(collection);//[10, 10, 20, 3, 0, 45, 54]

        //i can call collection with get method only by casting new Arraylist() down casting super-->sub  ***upcasting--<sub-->super
        System.out.println(new ArrayList<Integer>(collection).get(1));

       // System.out.println( ((Stack) collection) .pop() );//class cast exception-->no relationship

        System.out.println("----------------------------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();

        Collection<Integer> collection3 = new LinkedHashSet<>();

        Collection<Integer> collection4 = new HashSet<>(); ////class cast exception-->no relationship
        collection4.addAll(Arrays.asList(100,200,300,400,500,100,100));

        System.out.println(collection4);//400, 100, 500, 200, 300] no duplicates

       // System.out.println(((ArrayList) collection4).get(4)); //arraylist and hashset have not relationship so class cast exception

        System.out.println(new ArrayList<>(collection4).get(4)); //it will be eligible for Garbage collection

        List<Integer> l = new ArrayList<>(collection4);


        System.out.println("----------------------------------------------------------------------");




    }
}
