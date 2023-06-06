package dailyVideos.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map  = new TreeMap<>();

        //put() :  use for adding the pairs (the given value and key into the map (entry))+for updating the values of existing key
        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("A02","Khashayar");
        map.put("A04","Tatiana");
        map.put("E04","Abidullah");

        //putAll(Map<>)
        Map<String,String > employees = new TreeMap<>(); //insertion order accepts duplicates

        employees.putAll(map);

        System.out.println(employees);//{A02=Khashayar, A04=Tatiana, B03=Nora, C02=Josh, E04=Abidullah}

        System.out.println(map == employees); //false. why false?--> there are 2 different map object ,so they are not equal

        //equals()
        System.out.println(map.equals(employees));//true---> we should use equals method instead of ==



    }
}
