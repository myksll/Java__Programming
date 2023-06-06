package dailyVideos.day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

            Map<String, String> employeeMap = new HashMap<>();
            employeeMap.put("Ddene", "F");
            employeeMap.put("Winfred", "M");
            employeeMap.put("Jereme", "M");
            employeeMap.put("Glad", "F");
            employeeMap.put("Desirae", "F");
            employeeMap.put("Kakalina", "F");
            employeeMap.put("Bertrando", "M");
            employeeMap.put("Ajay", "F");
            employeeMap.put("Brigitte", "F");
            employeeMap.put("Derk", "M");
            employeeMap.put("Orlando", "M");
            employeeMap.put("Selle", "F");
            employeeMap.put("Marika", "F");

            System.out.println("---------------------------------------------");
            // how many female & male employees in the map?

        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;

        /*
        //that is not the best solution for this task
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployee++;
            }
        }


         */

        //best solution

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployee++;
            } else {
                countMaleEmployee++;
            }
        }
        System.out.println("countFemaleEmployee = " + countFemaleEmployee);//countFemaleEmployee = 8
        System.out.println("countMaleEmployee = " + countMaleEmployee);//countMaleEmployee = 5

        System.out.println("---------------------------------------------");
        //display the names of all the female employee

        /*1.
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }
         */
       // 2.
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------");

        //update all the "M" values with Male, "F" values with female

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);

        }
    }

