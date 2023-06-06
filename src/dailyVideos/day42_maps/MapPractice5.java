package dailyVideos.day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {
    public static void main(String[] args) {
        Map<String, String> map  = new TreeMap<>();

        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("A02","Khashayar");
        map.put("A04","Tatiana");
        map.put("E04","Abidullah");

        map.forEach((k,v)-> { System.out.println(k+" : "+v); } );



    }
}
