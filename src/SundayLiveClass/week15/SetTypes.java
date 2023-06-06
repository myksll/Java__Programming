package SundayLiveClass.week15;

import java.lang.reflect.Array;
import java.util.*;

public class SetTypes {
    public static void main(String[] args) {

        Set<String>hashSet = new HashSet<>(); //accepts no duplicates, accepts null, random
        hashSet.add("zebra");
        hashSet.add("java");
        hashSet.add("8");
        hashSet.add("java");
        hashSet.add(null);
        hashSet.add("hi");

        System.out.println(hashSet);//[zebra, null, hi, java, 8]

        System.out.println("----------------------------------------------------");

        Set<String>  linkedHashSet =  new LinkedHashSet<>();//accepts no duplicates, accepts null,insertion order
        linkedHashSet.add("zebra");
        linkedHashSet.add("java");
        linkedHashSet.add("8");
        linkedHashSet.add("java");
        linkedHashSet.add(null);
        linkedHashSet.add("hi");

        System.out.println(linkedHashSet);//[zebra, java, 8, null, hi]
        Arrays.asList();

        System.out.println("-------------------------------------");

        Set<String>  treeSet =  new TreeSet<>();//accepts no duplicates, accepts no null,sorted order
        treeSet.add("zebra");
        treeSet.add("java");
        treeSet.add("8");
        treeSet.add("java");
        treeSet.add("hi");
      //  treeSet.add(null);
       /* try{
            treeSet.add(null);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        */

        System.out.println(treeSet);//[8, hi, java, zebra]

        System.out.println("-------------------------------------------------------");

        //mini task: remove duplicate characters from string

        String str ="AAABBBBBBCCCCCCDDDDDEEEEFF";

        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replace(",","").replace("[","").replace("]",""));//A B C D E F-->convert the String to an array, the array in converted to a List and that is the argument of the LinkedHashSet constructor

        System.out.println("---------------------------------------------------------");
/*
        //loop

        Set<String> tabs =new HashSet<>();

        tabs.add("INUN01");
        tabs.add("UBNUWB1");
        tabs.add("NIEJ3");

        //You are on tab "INUN01" and you need to switch to "UBNUWB1" , how do you do it?

        for(String each : tabs){
            if(each.equals( "UBNUWB1")){
               //switch to that tab.
            }
        }

        System.out.println(tabs);
 */



    }
}
