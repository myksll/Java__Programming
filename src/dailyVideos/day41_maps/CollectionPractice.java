package dailyVideos.day41_maps;

import dailyVideos.day26_statics.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(11,12,13,14,15));

        List<List<Integer>> lists = new ArrayList<>();//this is nested LIST-->LIST OF LIST, it accepts only list objects
       // lists.addAll(Arrays.asList(list1,list2)); =

        lists.add(list1);
        lists.add(list2);
        System.out.println(lists);

        System.out.println(lists.get(1).get(4));

        for( List<Integer> eachList : lists){
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("-------------------------------------------------------------------------------------------------");

        List<Set<Integer>> listOfSet = new ArrayList<>();
        listOfSet.add(new LinkedHashSet<>()); //0
        listOfSet.add(new LinkedHashSet<>()); //1
        listOfSet.add(new LinkedHashSet<>()); //2
        listOfSet.add(new LinkedHashSet<>()); //3
        listOfSet.add(new LinkedHashSet<>()); //4

        System.out.println(listOfSet);//[[], [], [], [], []]
        System.out.println(listOfSet.size());//5

        //{10,5,20}

       listOfSet.get(0).addAll(Arrays.asList(10,50,20,30,40,10));
       listOfSet.get(1).addAll(Arrays.asList(30,159,306));
       listOfSet.get(2).addAll(Arrays.asList(300,15,30));
       listOfSet.get(3).addAll(Arrays.asList(30,155,301));
       listOfSet.get(4).addAll(Arrays.asList(30,155,301,78));
        System.out.println(listOfSet);//[[10, 50, 20, 30, 40], [], [], [], []]-->duplicates not allowed

        System.out.println("-------------------------------------------------------------------------------------------");

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<int[]>  listOfArrays = new ArrayList<>();//list of Arrays-->This list can contain only array object that are in array
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

       // System.out.println(listOfArrays);

        listOfArrays.get(0)[2] = 35; //change 1. array 3. number
        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("-------------------------------------------------------------------------------------------");

      //  List<List<Employee>> teams = new ArrayList<>();


    }
}
