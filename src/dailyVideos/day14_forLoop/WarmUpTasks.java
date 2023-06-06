package dailyVideos.day14_forLoop;

public class WarmUpTasks {

    public static void main(String[] args) {

       // ----------------Three different methods with three different names----------------

        //1. System.out.println(combine("one","eight"));

        //2.
        String str3 = combine("one", "eight");
        System.out.println(str3);


        System.out.println("-------------------------------------------------------");

        System.out.println ( sumOf2IntegerNumbers(10,20));
        System.out.println ( sumOf3IntegerNumbers(10,20,30));
        System.out.println ( sumOf4IntegerNumbers(10,20,30,40));

    }

    public static String combine(String str1, String str2) {


        String result;

        /*  1. solution

         //     ""--> that is for converting char to String
        if (str1.endsWith("" + str2.charAt(0))) {  // if the first String ends with
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }
         */

        //2.solution

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) { //if the last character in the first String == the fist character of the last String

            result = str1 + str2.substring(1);        //first character of the second string should be excluded in the concatenation

        } else {
            result = str1 + str2;
        }
        return result;
    }


    public static int sumOf2IntegerNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static int sumOf3IntegerNumbers(int n1, int n2, int n3) {

        //1. return n1 + n1 + n3;

        //2.
        return sumOf2IntegerNumbers(n1,n2) + n3;

    }

    public static int sumOf4IntegerNumbers  (int n1 , int n2 , int n3 , int n4){

        //1.  return n1+n2+n3+n4;

        //2.  return sumOf3IntegerNumbers(n1,n2,n3) + n4;

        //3.  return  sumOf2IntegerNumbers(n1,n2)+sumOf2IntegerNumbers(n3,n4);

        //4.  return sumOf2IntegerNumbers( sumOf3IntegerNumbers(n1,n2,n3) , n4);

        //5.

        return sumOf3IntegerNumbers( sumOf2IntegerNumbers(n1,n2) , n3 , n4) ;

    }

}                      