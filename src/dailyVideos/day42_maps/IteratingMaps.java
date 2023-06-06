package dailyVideos.day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {

        //keySet() -->returns as a set, why?--> because set does not accept duplicates , keys of map can not be duplicated

        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Daniel", 80000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);//before the doubling the salary

        //Iteration the map by the keys
        for (String eachKey : map.keySet()) {
            //System.out.println(eachKey);  //Daniel Emily Bella Arron Jimmy Breanna

            map.replace(eachKey,map.get(eachKey)* 2);   //old value--> map.get(eachKey)
        }
        System.out.println(map);
        //for updating the value-->1. put()   2.replace()-->best way, faster

        System.out.println("---------------------------------------------------------------------------------------");

        //values()
        //Iterating the map by values
        for (Integer eachValue : map.values()) {

            System.out.println(eachValue); //160000 200000 170000 156000 156000 196000

        }

        System.out.println("---------------------------------------------------------------------------------------");
        //iterating the map by entries/by pairs
        //entrySet()= key and values im map

       for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {  //Entry-->interface
           // System.out.println(eachEntry);

        }

        System.out.println("---------------------------------------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
           String eachKey =  eachEntry.getKey();
           Integer eachValue = eachEntry.getValue();
           eachEntry.setValue(eachValue+10000);
            System.out.println(eachKey+" : "+eachValue);
        }

        System.out.println(map);

    }
}
