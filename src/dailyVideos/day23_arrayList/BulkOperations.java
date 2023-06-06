package dailyVideos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        //They are the methods of the collections . They will be used in this method
        //containsAll()--->
        //addAll---->
        //removeAll()--->
        //retainAll()--->

        //1.) addAll----> we can not use with primitive

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //list1.addAll(numbers);
        // System.out.println(list1);//[1, 2, 3, 10, 20, 30, 40]

        list1.addAll(1,numbers);
        System.out.println(list1);//[1, 10, 20, 30, 40, 2, 3] ---<index numbers 1,2,3 of list1 will be shifted after numbers

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        //scores.addAll(75,85,95);-->compiler error-->we should use aslist()

        scores.addAll(Arrays.asList(75,85,95,75,65,55));
        System.out.println(scores);

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hanna", "Abidullah"));
        System.out.println(students);//[Gadir, Hanna, Abidullah]

        //which Index that you want to add the numbers

        students.addAll(2,Arrays.asList("kazim"));

        System.out.println(students); //[Gadir, Hanna, kazim, Abidullah]

        System.out.println("-----------------------------------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> l1 = new ArrayList<>();

        // l1.addAll(nums); --> after addAll method we can use collection method but Array is not a collection type

        //1.way
        l1.addAll(Arrays.asList(nums));
        // it has to be wrapper class or non-primitive, otherwise primitive will not be accepted-->int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(l1);//[1, 2, 3, 4, 5, 6, 7, 8]

        // ArrayList<Integer> l2 = new ArrayList<>(nums); //compiler -->we can all elements in this curly braces, but Array is not collection.

        //2.way
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(nums)); //we can do like that

        System.out.println("-----------------------------------------------------------------------");

        //2.) containsAll()method---> All the elements are contained in Array list-->.containsAll(Arrays.asList)

        ArrayList<String>  employeesList=new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        boolean hasAlena = employeesList.contains("Alena");
        System.out.println(hasAlena); //true

        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));
        System.out.println(hasAlenaGadir);//true

        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar","Ali","Kuzzat"));
        System.out.println(hasMuhtarAliKuzzat); //false

        System.out.println("-----------------------------------------------------------------------");

        //3.) removeAll()---->if you remove more element than one, removeAll(Arrays.asList())

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,40,50,60,70,80,90,10,10,10));

        list.remove(10); //it removes only one 10 element
        System.out.println(list);//[10, 10, 20, 40, 50, 60, 70, 80, 90, 10, 10]

        list.removeAll( Arrays.asList(10,20));
        System.out.println(list);//[40, 50, 60, 70, 80, 90]

        System.out.println("-----------------------------------------------------------------------");

        //4) retainAll() method---> the elements we would like to keep, retainAll is opposite to removeAll

        ArrayList<String>  developers =new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali","Khashayar","Madiyar", "Muhtar", "Muhtar","Alena"));

        developers.retainAll(Arrays.asList("Alena", "Khashayar"));

        System.out.println(developers); //[Alena, Khashayar, Alena]-->wil be retained, rest of them will be removed

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<String>  groceriesList =new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Milk", "water", "Eggs", "Bread","Potato","Tomato", "Cheese", "Rice","Milk"));

        groceriesList.retainAll(Arrays.asList("Milk", "water", "Eggs", "Bread"));
        System.out.println("groceriesList = " + groceriesList);//[Milk, water, Eggs, Bread, Milk]

        groceriesList.removeAll(Arrays.asList("Potato","Tomato", "Cheese", "Rice"));
        System.out.println("groceriesList = " + groceriesList);//[Milk, water, Eggs, Bread, Milk]





















    }
}
