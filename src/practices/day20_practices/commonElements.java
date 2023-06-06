package practices.day20_practices;

import java.util.Arrays;

public class commonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int each : arr1){
            for (int element : arr2){
                if(each==element){
                    System.out.print(each+" ");
                }
            }
        }



  /*      String[] str1 = {"merve", "ku", "zu"};
        String[] str2 = {"mervel", "kut", "zu"};

        for (String each : str1){
            for(String element :str2){
               if(each.equals(element)) {
                   System.out.println(each+" ");
               }
            }
        }
   */
    }
}


/*
2. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */