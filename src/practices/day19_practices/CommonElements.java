package practices.day19_practices;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5,8,7};  //4 5
        int[] arr2 = {4, 5, 6, 7, 8,2,3};



        for (int i = 0; i < arr1.length; i++) {

            for (int i1 = 0; i1 < arr2.length; i1++) {

                if(arr1[i] == arr2[i1]){

                    System.out.println(arr1[i]);


                }

            }

        }


    }
    }

/*
8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */