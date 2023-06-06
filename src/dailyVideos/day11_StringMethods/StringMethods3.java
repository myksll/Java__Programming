package dailyVideos.day11_StringMethods;

public class StringMethods3 {
    public static void main(String[] args) {

        //All these Methods return boolean.(true or false)

        //isEmpty()  ---> if the String is empty , it will return true, otherwise false.

       String word= " Java";   // that is not 0 and empty.

      boolean r1 =word.isEmpty();

        System.out.println(r1);//false

        //--------------------------------------------------------------------------------------

        String word2= "";   //it is equal to 0 and empty so true. if int is equal to 0, it means that it is empty.

        boolean t1=word2.isEmpty();

        System.out.println(t1);

        //----------------------------------------------------------------------------------------

        // isBlank()   -----> white spaces

        String str="           ";   //it is blank , not empty

        boolean r2= str.isEmpty();  // it is not empty. it has characters.
        System.out.println(r2);     //false

        boolean r3=str.isBlank();
        System.out.println(r3);     //true

        //----------------------------------------------------------------------------------------

         //equals()

      String str1= "Cydeo";         //these two objects are not same. 2 different objects.

      String str2=new String ("Cydeo");

      System.out.println(str1==str2); //false

      System.out.println(str1.equals(str2));   //true ---> compare to string of texts. same characters. same cases.


      String str3= new String("cydeo"); // have str3 and str2 same character? //no there is case difference."C" and"c"

      System.out.println(str2.equals(str3));  //false

        //----------------------------------------------------------------------------------------


         // equalsIgnoreCase()  without case Sensibility

      String s1="JAVA";
      String s2="java";

      System.out.println(s1.equals(s2)); //false because of case sensibility
      System.out.println(s1.equalsIgnoreCase(s2));  //true because of not case sensibility


        //----------------------------------------------------------------------------------------

       //contains()   if one String included to another String, returns boolean.(has)

        String students = "Hasan Naran Sumeye Nataliia" ;

        boolean hasAhmed= students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);  // hasAhmed = false


        
        
        String sentence="My favorite programming language is JAVA";
        
        boolean hasjava=sentence.contains("java");

        System.out.println("hasjava = " + hasjava); // hasjava = false


        boolean hasjavaa=sentence.toLowerCase().contains("java");    //does this sentence contains to java's lowercase

        System.out.println("hasjavaa = " + hasjavaa); // hasjavaa = true

        //----------------------------------------------------------------------------------------

        //startsWith () ----> checks if the String is started with given str. , returns boolean.

        String name = "Micheal";

        boolean l= name.startsWith("Da");

        System.out.println(l); //false


        String url= "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid); //true

        //----------------------------------------------------------------------------------------

        //endsWith()  ----> checks if the String is ended with given str., return boolean.


        boolean t = url.endsWith("com");
        System.out.println(t); //true

        String email="CydeoSchool@gmail.com";

        boolean isGmail =email.endsWith("gmail.com") ; //true
        boolean isYahoo= email.endsWith("yahoo.com"); // false
        boolean isHotmail=email.endsWith("hotmail.com"); //false

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);
    }
}
