package dailyVideos.day22_ArrayList;

import dailyVideos.utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //contains

        int[] numbers = {10,20,30,40,50,60,70,90};

        boolean has25=  ArraysUtility.contains(numbers,25);

        System.out.println(has25);  //false

        System.out.println("---------------------------------------------");

        String[] students={"Sumeye","Hamza" ,"Marika", };

        System.out.println(ArraysUtility.contains(students,"Kashyar")); //false





    }
}
