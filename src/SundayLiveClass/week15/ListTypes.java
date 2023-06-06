package SundayLiveClass.week15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTypes {
    public static void main(String[] args) {

        List<String>list1 =new ArrayList<>() ; //accepts null, duplicates,
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add(null);
        list1.add("z");
        list1.add("b");

        System.out.println(list1); //[a, b, c, null, z, b]

        
        System.out.println("------------------------------------------------------");


        List<String>list2 =new LinkedList<>(); //accepts null, duplicates,

        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add(null);
        list2.add("z");
        list2.add("b");

        System.out.println(list2); //[a, b, c, null, z, b]

        System.out.println("------------------------------------------------------");


        List<String>list3 =new Vector<>(); //accepts null, duplicates,

        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add(null);
        list3.add("z");
        list3.add("b");

        System.out.println(list3); //[a, b, c, null, z, b]

        System.out.println("------------------------------------------------------");







    }
}
