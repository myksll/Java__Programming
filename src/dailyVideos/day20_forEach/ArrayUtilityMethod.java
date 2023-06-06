package dailyVideos.day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethod {
    public static void main(String[] args) {
                                           //String Methods

        // toString method
        int[] score = {70,100,80,90,65};
        System.out.println(Arrays.toString(score));//[70, 100, 80, 90, 65]---- 1. way

        String result = Arrays.toString(score);
        System.out.println(result);//[70, 100, 80, 90, 65]---2.way

        System.out.println("-----------------------------------------------------------");

        //equals method
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,4,5};


        System.out.println(Arrays.equals(a1,a2)); //true ----1.way

        boolean r1=Arrays.equals(a1,a2);
        System.out.println(r1);  //true-----2.way


        char[] ch1 ={ 'A','B','C'};
        char[] ch2 ={ 'C','B','A'};

       boolean r2= Arrays.equals(ch1,ch2);
       System.out.println(r2); //false

       System.out.println("-----------------------------------------------------------");

        String[] s1= {"A","B","C"}; // s1 is referencing to array object. and in this array object, the elements are String
        String[] s2= {"A","C","B"};

        System.out.println(Arrays.equals(s1,s2)); //false

        System.out.println("-----------------------------------------------------------");

        //sort method
        int[] nums ={100,80,90,77,88,555,2,9,78};

        System.out.println(Arrays.toString(nums));//[100, 80, 90, 77, 88, 555, 2, 9, 78]

        Arrays.sort(nums);// the smallest number will be at the index zero . the largest will be at the last index
        System.out.println(Arrays.toString(nums));//[2, 9, 77, 78, 80, 88, 90, 100, 555]

        System.out.println("Minimum number: "+nums[0]); //first number is minimum  --->2
        System.out.println("Maximum number: "+ nums[nums.length-1]); // last number is maximum--->555

        System.out.println("-----------------------------------------------------------");

        String[] b1 = {"A", "B","C"};
        String[] b2 = {"A","C","B"};

        Arrays.sort(b1); // if we do not use sort array, b1 and b2 are not equal.
        Arrays.sort(b2);

        System.out.println(Arrays.toString(b1));  //[A, B, C]
        System.out.println(Arrays.toString(b2));  //[A, B, C]

        System.out.println(Arrays.equals(b1,b2)); //true

        System.out.println("-----------------------------------------------------------");

        String[] students = {"Madiyac","Ayse","Alena","Yaxier" };

        System.out.println(Arrays.toString(students)); //[Madiyac, Ayse, Alena, Yaxier]

        Arrays.sort(students);//if the first character of those String are same, next character will be compared.

        System.out.println(Arrays.toString(students)); //[Alena, Ayse, Madiyac, Yaxier]

        System.out.println("-----------------------------------------------------------");

        //copyOf()
        int[] array = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf(array,7);
        System.out.println(Arrays.toString(array2));  // [10, 20, 30, 40, 50, 60, 70]

        int[] array3 = Arrays.copyOf(array,4); // it is going to specify until new length
        System.out.println(Arrays.toString(array3)); //[10, 20, 30, 40]

        int[] array4 = Arrays.copyOf(array,10); // the length of array is 7. for 10, it is written 0
        System.out.println(Arrays.toString(array4)); //[10, 20, 30, 40, 50, 60, 70, 0, 0, 0]


        System.out.println("-----------------------------------------------------------");

        int[] n1 = {1,2,3,4,5,6};
        int[] n2 = {7,8,9,10,11};

        int[] n3 = Arrays.copyOf(n1,n1.length+n2.length);//[1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0] . we need n2.Use loop

        for (int i = 0, k = n1.length ; i < n2.length; i++, k++) { //k is assigned with n1.length, so we can write the rest of n1 with n2

            n3[k] = n2[i];
        }
      

        System.out.println(Arrays.toString(n3)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

        System.out.println("-----------------------------------------------------------");

                //copyOfRange

        char[] ch = {'A','B','C','D','E','F'};
      //index number  0   1   2   3   4   5

        char[] result1 =Arrays.copyOf(ch,4);  //copyOf
        System.out.println(Arrays.toString(result1));  //[A, B, C, D]

        char[] result2 =Arrays.copyOfRange(ch,3,5);
        System.out.println(Arrays.toString(result2));//  [D, E] --> index 3 and 4 is printed excluding 5.-->excludes ending index

        // if we print the last index, we use --->Arrays.copyOfRange(ch, 3, ch.length);
        char[] result3 = Arrays.copyOfRange(ch, 1, ch.length);
        System.out.println(Arrays.toString(result3)); //[B, C, D, E, F]




    }
}
