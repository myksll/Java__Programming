package practices.day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllTheMatching {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);//[John, Daniel, James, Muhammed]

    }
}
/*
2. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */