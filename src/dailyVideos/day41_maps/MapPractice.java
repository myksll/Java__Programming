package dailyVideos.day41_maps;

import javax.lang.model.SourceVersion;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Object> person1 = new LinkedHashMap<>();

        //put() --> String, object
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println("person1 = " + person1);

        //get() method--> we use only for key , because key is unique
        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("gender"));
        System.out.println(person1.get("age"));
        System.out.println(person1.get("job_title"));
        System.out.println(person1.get("married"));

        //System.out.println(person1.get(0)); it is not going to -->it gives null


    }
}
