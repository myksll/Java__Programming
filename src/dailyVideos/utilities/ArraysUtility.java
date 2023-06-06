package dailyVideos.utilities;

import java.util.Arrays;

public class ArraysUtility {


    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array ha enough capacity to contain all the elements of arr1 + arr2

        int k = 0;  // for index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i =  the index number of arr1
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i =  the index number of arr2

            arr3[k] = arr2[i];
        }

        return arr3;

    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array ha enough capacity to contain all the elements of arr1 + arr2

        int k = 0;       // for index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i =  the index number of arr1

            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i =  the index number of arr2

            arr3[k] = arr2[i];
        }

        return arr3;

    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array ha enough capacity to contain all the elements of arr1 + arr2

        int k = 0;  // for index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i =  the index number of arr1

            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i =  the index number of arr2

            arr3[k] = arr2[i];
        }

        return arr3;

    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array ha enough capacity to contain all the elements of arr1 + arr2

        int k = 0;  // for index number of arr3

        for (int i = 0; i < arr1.length; i++, k++) { // i =  the index number of arr1

            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i =  the index number of arr2

            arr3[k] = arr2[i];
        }

        return arr3;

    }

    public static int[] reversedArray(int[] array) {

        int[] reversedArray = new int[array.length]; //{5,4,3,2,1,}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    public static double[] reversedArray(double[] array) {

        double[] reversedArray = new double[array.length]; //{5,4,3,2,1,}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    public static char[] reversedArray(char[] array) {

        char[] reversedArray = new char[array.length]; //{5,4,3,2,1,}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    public static String[] reversedArray(String[] array) {

        String[] reversedArray = new String[array.length]; //{5,4,3,2,1,}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    public static int[] addElement(int[] array, int element) {


        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;

    }

    public static double[] addElement(double[] array, double element) {


        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;

    }

    public static String[] addElement(String[] array, String element) {


        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;

    }

    public static char[] addElement(char[] array, char element) {


        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;

    }
                                //    {1,2,3,4}  1

    public static boolean contains(int[] array, int element){

         for (int each : array) {
             if(each==element){
                 return true;
             }
         }
                 return false;
     }

    //    {1,2,3,4}  1
    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }

    //array={10,20,30,40} , index:2 ----> 20 will be removed
   // public static int[] remove (int[] array, int index){}





    //public static int[] removeDuplicates (int[] array, int index){}





}
