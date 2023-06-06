package dailyVideos.day40_collections;

import dailyVideos.utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names= new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level" , "civic", "radar", "kayak", "reviver", "race")
        );//level,civic, radar, kayak, reviver

        //find palindromes from String List
        Iterator<String> it = names.iterator();

        while(it.hasNext()){
           String each = it.next();
            //i need reverse so another loop
          String reverse="";

          for(int i = each.length()-1; i>=0 ; i--){
              reverse += each.charAt(i);
          }

          if(each.equalsIgnoreCase(reverse)){
               it.remove();           //names.remove(each);we can not ´this
          }
        }
        System.out.println(names);//[Java, Python, Cydeo, Car, race]

        System.out.println("--------------------------------------------------------------------------------------------------");

        List<String> names2= new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level" , "civic", "radar", "kayak", "reviver", "race")
        );  //level,civic, radar, kayak, reviver

        names2.removeIf(p-> StringUtility.reverse(p).equalsIgnoreCase(p));
        // = names2.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)); //string builder - buffer short videos


        System.out.println(names2);//[Java, Python, Cydeo, Car, race]

        System.out.println("--------------------------------------------------------------------------------------------------");

















    }
}
