package SundayLiveClass.week15;

import SundayLiveClass.week10.earth.Person;

import java.util.*;

public class MapType {
    public static void main(String[] args) {



    Map<Integer, Person> residents = new LinkedHashMap<>();

    residents.put(1,new Person("Erik" , 20 ));
    residents.put(2,new Person("Kelly" , 30 ));
    residents.put(3,new Person("Helen" , 25 ));
    residents.put(2,new Person("Jane" , 31 )); //keys are unique , so the value is updated

        System.out.println(residents);

        for(int key: residents.keySet()){ //keySet returns a Set of keys
            System.out.println("In Apartment "+key+" "+ residents.get(key).name + " lives there");
        }

        System.out.println("-------------------------------------------------------");

        //key: String- Continent, value: list of String-countries
        Map<String, List<String>> continent = new HashMap<>();

        continent.put("North America",new ArrayList<>(Arrays.asList("US", "Canada","Mexico")));
        continent.put("Europa",new ArrayList<>(Arrays.asList("Germany", "France","Italy")));

        System.out.println(continent);

        for( Map.Entry<String, List<String>> each : continent.entrySet()  ){
            System.out.println("Continent: "+each.getKey());
            System.out.println("Continent: "+each.getValue());
        }

        //mini task: print the first and last letter of each country

        for( List<String> each : continent.values() ){ //the values ar List<String
            for(String eachCountry : each){ //iterating through the List<String>
                System.out.println(eachCountry.substring(0,1)+eachCountry.charAt(eachCountry.length()-1));
            }
        }

        continent.get("Europa").add("UK");//gets the list of Europa and adds the UK element into that list

        System.out.println(continent);

    }
}
