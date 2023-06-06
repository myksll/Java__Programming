package dailyVideos.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map  = new TreeMap<>();     //it is the best to use the unique as key

        map.put("C02","Josh");  //put() :  use for adding the pairs (the given value and key into the map (entry))+for updating the values of existing key
        map.put("B03","Nora");
        map.put("A02","Khashayar");
        map.put("A04","Tatiana");
        map.put("E04","Abidullah");
        map.put("E05","Abidullah");
        map.put("E06","Abidullah");

        System.out.println("map = " + map);
        System.out.println(map.size());  //size() : count number of pairs-->7

        System.out.println(map.get("A04")); //call the value by getting the key--> Tatiana

        //change the value -->we must know key that we can change the value
        map.put("A04","Merve");//Tatiana-->Merve
        System.out.println("map: "+map);

        //replace()-->replace the value, faster
        map.replace("C02", "Assel");
        System.out.println(map);

        //remove()
        map.remove("E04");
        System.out.println(map); //we do not have E04. it is removed

        //containsKey()  containsValue()
        System.out.println(map.containsKey("A02")); //true
        System.out.println(map.containsKey("A45")); //false

        System.out.println(map.containsValue("Assel")); //true
        System.out.println(map.containsValue("Assliel")); //false


        //isEmpty()
        System.out.println(map.isEmpty());//false

        //equals
        System.out.println(map.equals(map));//true

        //clear()
        map.clear();
        System.out.println(map);//{}

    }
}
/*
pair: id - name
 */