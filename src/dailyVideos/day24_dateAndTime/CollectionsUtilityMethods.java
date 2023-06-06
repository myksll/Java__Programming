package dailyVideos.day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        //replaceAll() method---> Collection.replaceAll(name of ArrayList(names),oldValue("Java"), newValue("Python"))
        //tasks: replace all Java with Python

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java","C#","Ruby","Swift", "Swift", "Java"));


        //1.way -->if we had not replaceAl method, we would use name.fori ,
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equalsIgnoreCase("Java")){  //[Python, Python, C#, Ruby, Swift, Swift, Python]
                names.set(i,"Python");
            }
        }
        System.out.println(names);
        
        
        //2.way--->use replaceAll method
        Collections.replaceAll(names,"Java","Python");
        System.out.println(names);//[Python, Python, C#, Ruby, Swift, Swift, Python]

        System.out.println("------------------------------------------------------------------------------------");

        //frequency with Collection.frequency()


        //frequency()method-->Collection.frequency(name of ArrayList(names),the number of object that we want to learn frequency(50))--->frequency value is always integer,so assign int-->example----> int count2 = Collections.frequency(words,"Swift");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,20,40,40,40,50,60,50,50,50));

        int count50 =Collections.frequency(list,50);
        System.out.println(count50); //4

        System.out.println("------------------------------------------------------------------------------------");

        ArrayList<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java","C#","Ruby","Swift", "Swift", "Java"));


        int countSwift = Collections.frequency(words,"Swift");
        System.out.println(countSwift);//2

        System.out.println("------------------------------------------------------------------------------------");

        //frequency with for loop

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,20,40,40,40,50,60,50,50,50));

        for (Integer each : numbers) {

            if(Collections.frequency(numbers,each) == 1){ //if each´ frequency is 1 , that is unique
                System.out.println(each);//10 30 60
            }
        }


    }
}
