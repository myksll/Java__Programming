package dailyVideos.day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //new Map();->we can not create object from interface, so we should use classes
        Map<String,Integer> hashMap = new HashMap<>(); //RANDOM ORDER, accepts one null key and multiple null value

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Daniel", 80000);//the last Daniel will be printed, accepted
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null); //null is accepted by value
        hashMap.put(null,120000); //null is accepted by both of them(key and value)
        hashMap.put(null, 36000);
        hashMap.put(null, 45000); //but only the last  one null key will be accepted

        System.out.println("hashMap = " + hashMap);

        System.out.println("------------------------------------------------------------------------------");

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();//insertion order, accepts one null key and multiple null values

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Daniel", 80000);//the last Daniel will be printed, accepted
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null); //null is accepted by value
        linkedHashMap.put("Breana", null); //null is accepted by value
        linkedHashMap.put(null,120000); //null is accepted by both of them(key and value)
        linkedHashMap.put(null, 36000);
        linkedHashMap.put(null, 45000); //but only the last  one null key will be accepted

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("------------------------------------------------------------------------------");
        
        Map<String,Integer> treeMap = new TreeMap<>();//sorted order(Ascii table), does not accept null key, but accepts null value

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Daniel", 80000);//the last Daniel will be printed, accepted
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null); //value can be null in treeMap
        treeMap.put("Breana", null); //value can be null in treeMap
       // treeMap.put(null,120000); //null is not accepted by key
       // treeMap.put(null, 45000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("------------------------------------------------------------------------------");

        Map<String,Integer> hashTable = new Hashtable<>();//random order, does not accept null key and null value, synchronized

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Daniel", 80000);//the last Daniel will be printed, accepted
        hashTable.put("Arron", 78000);
        //hashTable.put("Chris", null); //value can not be null in hashTable
        //hashTable.put("Breana", null); //value can not be null in hashTable
        //hashTable.put(null,120000); //null is not accepted by key

        //how can we handle unchecked exception? -->1 way -->try catch block
        try{  //thanks to try catch , we can print the other hashtable on console
            hashTable.put(null, 45000);
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashTable = " + hashTable);


        System.out.println("------------------------------------------------------------------------------");














    }
}
/*
pair: name & salary
Daniel = 95000
Emily = 10000
Bella = 85000
 */