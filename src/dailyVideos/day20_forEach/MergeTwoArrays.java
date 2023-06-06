package dailyVideos.day20_forEach;

import dailyVideos.utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

      int[] arr1 = {1,2,3,4};
      int[] arr2 = {5,6,7};


      int[] arr3 = new int[arr1.length+ arr2.length] ;

      // to make sure that 3rd array ha enough capacity to contain all the elements of arr1 + arr2

        int k=0;  // for index number of arr3

        for (int i = 0; i < arr1.length; i++,k++) { // i =  the index number of arr1
          arr3[k] = arr1[i];
            }

        for (int i = 0; i < arr2.length; i++,k++) { //i =  the index number of arr2

                arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------");

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {70,80,90};

/* //1.way

        int[] a3 = new int[a1.length+a2.length];
        int p =0;

        for (int i = 0; i < a1.length; i++,p++) {
            a3[p]=a1[i];
        }

        for (int i = 0; i < a2.length; i++,p++) {
            a3[p]=a2[i];
        }

        System.out.println(Arrays.toString(a3));
*/

    //2.way---> calling method from ArraysUtility from utilities

    // you can find the methods -->ArraysUtility in utilities

       int[] a3 =  ArraysUtility.merge(a1,a2);

       System.out.println(Arrays.toString(a3));


       System.out.println("----------------------------------");

      double[] b1={10.5,5.5,3.5,6.5,8.5};
      double[] b2={20.5,15.5,13.5};

      double[] b3 =  ArraysUtility.merge(b1,b2);

      System.out.println(Arrays.toString(b3));

      System.out.println("----------------------------------");

     char[] ch1 ={'A','B','C'};
     char[] ch2 ={'D','E','F'};

     char[] ch3 =ArraysUtility.merge(ch1,ch2);

     System.out.println(Arrays.toString(ch3));

     System.out.println("----------------------------------");

    String [] str1 ={"merve", "feyza"};
    String[] str2 = {"karaca"};

    String[] str3 = ArraysUtility.merge(str1,str2);

    System.out.println(Arrays.toString(str3));
    }
}
/*
2. write a program that can
 two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}

 */