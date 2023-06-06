package practices.day22_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-56,1,2,3,4,5,6,8));  // adding multiple elements at once by using bulk operation



      int max = list.get(0);
      int min=list.get(0);

      for (int i = 0 ; i < list.size(); i++){

        Integer each = list.get(i);
          if(each>max){
              max=each;
          }

          if(each<min){
              min=each;
          }
      }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */