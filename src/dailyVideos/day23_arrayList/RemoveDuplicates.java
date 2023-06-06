package dailyVideos.day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("Vasyl");   //0
        names.add("Vasyl");   //1
        names.add("Sumeyye"); //2
        names.add("Sumeyye"); //3
        names.add("Ali");     //4
        names.add("Sumeyye"); //5

        //same names will be removed

        System.out.println(names); //[Vasyl, Vasyl, Sumeyye, Sumeyye, Ali, Sumeyye]

        ArrayList<String> nonDuplicate=new ArrayList<>();

        for (String each : names) {

            /*   //1.way
             if(nonDuplicate.contains(each)){
                continue;
            }
             */

            if(!nonDuplicate.contains(each)){
                  nonDuplicate.add(each);
            }
        }

        names=nonDuplicate;

        System.out.println(names); //[Vasyl,Sumeyye, Ali]






    }
}
