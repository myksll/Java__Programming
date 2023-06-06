package dailyVideos.day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        System.out.println(person1);//{name=Arthur, gender=M, age=32, job_title=Developer, salary=100000.5, hired_date=2021-01-15, married=true}

        System.out.println("------------------------------------------------------------------------------------------");
        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        System.out.println(person2.get("name"));//we need to write key in get
        System.out.println(person2.get("job_title"));

        System.out.println("------------------------------------------------------------------------------------------");
        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        System.out.println("------------------------------------------------------------------------------------------");
        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        System.out.println("------------------------------------------------------------------------------------------");
        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        System.out.println("------------------------------------------------------------------------------------------");


        List<Map<String,Object>> listOfMap = new ArrayList<>();

        /*
        listOfMap.add(person1);
        listOfMap.add(person2);
        listOfMap.add(person3);
        listOfMap.add(person4);
        listOfMap.add(person5);
         */

        listOfMap.addAll(Arrays.asList(person1,person2,person3,person4,person5));

        System.out.println(listOfMap);
        System.out.println(listOfMap.size());//5

        System.out.println("------------------------------------------------------------------------------------------");
        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);

            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("------------------------------------------------------------------------------------------");

        //display the names of the employee who are hired this year(2023)
        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
              if(  eachEntry.getKey().equals("hired_date")){
                  if(( (LocalDate)eachEntry.getValue() ).getYear() ==2022){  //down casting
                      System.out.println(eachEntry);//eachMap --> gives all information
                   //  System.out.println(eachMap.get("name"));

                  }
              }
            }
        }
        System.out.println("------------------------------------------------------------------------------------------");

        //replace the names with another
        // System.out.println(listOfMap);

        listOfMap.get(0).replace("name","Vasyl") ; //first object of Map
        System.out.println(listOfMap);

       // for the last person , increase salary by 50000$
        listOfMap.get(listOfMap.size()-1).replace("salary", ( Integer )listOfMap.get(listOfMap.size()-1).get("salary")+50000) ;//last index

        //for second person
        listOfMap.get(1).replace("age",((Integer)listOfMap.get(1).get("age") +4));  //age's reference type object, so we need to use down casting


        System.out.println(listOfMap);

        /*
        for (Map<String, Object> eachPerson : listOfMap) {
            if(eachPerson.equals(person1)){
                eachPerson.replace("name","Ali");
            }
        }
         */

        System.out.println("-------------------------------------------------------------------------------------------");

        Map<String, Object> car1 = new LinkedHashMap<>();

        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year",2021);
        car1.put("color","Red");
        car1.put("price",45000.5);

        Map<String, Object> car2= new LinkedHashMap<>();
        Map<String, Object> car3= new LinkedHashMap<>();
        Map<String, Object> car4= new LinkedHashMap<>();


       List<Map<String, Object>> cars = new ArrayList<>();
       cars.addAll(Arrays.asList(car1,car2,car3,car4));





    }
}
