package dailyVideos.day11_StringMethods;

public class StringMethod1 {
    public static void main(String[] args) {


        String str1 = "CYDEO SCHOOL";   // that CYDEO SCHOOL is immutable, so that will be created new String

        //toLowercase Method

        str1 = str1.toLowerCase();         //  that will be created new String als "cydeo school". So str1 will assign the new String

        System.out.println(str1);

        //---------------------------------------------------------------------------------------------------

        String str2 = "java programming";

        str2 = str2.toUpperCase();  // "JAVA PROGRAMMING"

        System.out.println(str2);

        /*  =
        String str2="java programming";
        String str3 = str2.toUpperCase();  // "JAVA PROGRAMMING"

        System.out.println(str2); //java programming
        System.out.println(str3); //JAVA PROGRAMMING
         */


        //-----------------------------------------------------------------------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase();  // "WOODEN SPOON"

        word = word.toLowerCase();  // "wooden spoon"


        System.out.println(word);  // wooden spoon

        //-----------------------------------------------------------------------------------------------------

        // trim()

        String str4 = "            Cydeo School";    //            Cydeo School-----> there is spaces

        str4 = str4.trim();                         //"Cydeo School"  ----->   no spaces via trim

        System.out.println(str4);

        //-----------------------------------------------------------------------------------------------------

        //indexOf ()  -  lastIndexOf()

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);  //21


        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');
        System.out.println(firstA); //8

        int secondA = s1.indexOf("a ");  //10 ---> "a "--> a and then space--> (Java Pro)
        System.out.println(secondA);

        int thirdA=s1.indexOf("amm"); //17
        System.out.println(thirdA);


        //--------------------------------------------------------------------------------------------

          String s2="Java Python JavaScript Cydeo Python";

          int a1=s2.indexOf('a') ;
          System.out.println(a1);  //1

          int a2=s2.indexOf("a Python");
          System.out.println(a2);  //3

          int a3=s2.indexOf("avaS");
          System.out.println(a3);  //13

          int a4=s2.indexOf("aS");
          System.out.println(a4);      //15
          System.out.println(s2.indexOf("aS"));  //15

        //---------------------------------------------------------------------------------------------

        String w="Java";

        System.out.println(w.indexOf('a')); //1
        System.out.println(w.lastIndexOf('a'));  //3

        //---------------------------------------------------------------------------------------------

        String w2="Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a')); //15  ---> a ist the last a
        System.out.println(w2.lastIndexOf('P')); //29   ----> P is the last P
    }
}