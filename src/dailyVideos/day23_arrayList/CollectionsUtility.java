package dailyVideos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        //min() ~ max()

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,8));

        int max = Collections.max(list); //wrapper class to int--->unboxing
        System.out.println(max); //8

        int min = Collections.min(list);
        System.out.println(min); //1

        System.out.println("--------------------------------------------------------------------");

        //sort()

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alena", "Muhtar", "Kazim", "Ali"));

        Collections.sort(names);
        System.out.println(names); //[Alena, Ali, Kazim, Muhtar]-->from A to Z order-->ascending order

        System.out.println("--------------------------------------------------------------------");

        //reverse()
        Collections.reverse(names);
        System.out.println(names);//[Muhtar, Kazim, Ali, Alena]-->reverse of names

        System.out.println("--------------------------------------------------------------------");

        //swap()-->index

        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        Collections.swap(students,0,1); //index 0 and index 1 will be swapped.
        System.out.println(students);//[Muhtar, Alena, Gadir, Ali]

        System.out.println("--------------------------------------------------------------------");

        //swap in the first and last element

        Collections.swap(students,0,students.size()-1);
        System.out.println(students);//[Ali, Alena, Gadir, Muhtar]

        System.out.println("--------------------------------------------------------------------");

        //replaceAll()







        System.out.println("--------------------------------------------------------------------");

        //frequency()

    }
}
