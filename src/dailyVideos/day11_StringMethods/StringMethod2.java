package dailyVideos.day11_StringMethods;

public class StringMethod2 {
    public static void main(String[] args) {

        // replace   --->all the matching words

        String sentence="I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence); //I love Java, Java is the best programming language, and Java is in high demand

        //-----------------------------------------------------------------------------------------------------------

        String word="java";

        //word=word.replace('a','e'); //jeve

        word=word.replace("a","e");

        System.out.println(word); // jeve

       //--------------------------------------------------------------------------------

        //replaceFirst()     ------>first matching one

        String sentence2 = "I love Java, Java is cool";

       // sentence2=sentence2.replace("Java","Python");   //replace------>  I love Python, Python is cool

        sentence2= sentence2.replaceFirst("Java","Python");

        System.out.println(sentence2);  // replaceFirst----->   I love Python, Java is cool.  only first word is replaced.

       //--------------------------------------------------------------------------------

       String sentence3="Java is fun, Java is cool, Java is amazing";

       // sentence3= sentence3.replace("Java", "Python");  //Python is fun,Python is cool, Python is amazing

       // sentence3= sentence3.replaceFirst("Java", "Python");  //Python is fun, Java is cool, Java is amazing

       sentence3= sentence3.replaceFirst(", Java", ", Python");   //Java is fun, Python is cool, Java is amazing

        System.out.println(sentence3);

       //-------------------------------------------------------------------------------------

        //substring()

         String sentence4="I love Java Programming";   //I want to create string "Java"  --->  J=7  A=10

        // sentence4=sentence4.substring(7,10); -----> it is also true ,but we have to add 1 for last word(10).10+1=11
         String languageName = sentence4.substring(7, 10+1);

         System.out.println(languageName); //Java

        //-------------------------------------------------------------------------------------

        String sentence5= "Today is Sunday, Tomorrow is Monday";   //for Sunday S=9  y=14
        //index Number     0123456789...

        String today=sentence5.substring(9,14+1);

        System.out.println(today);  //Sunday

        //-------------------------------------------------------------------------------------

        String email="CydeoSchoolJavaProgramming@gmail.com";

        int beginning= email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');

        String domain=email.substring(beginning,ending);
        System.out.println(domain);

        //-------------------------------------------------------------------------------------

        String sentence6= "I love Java programming";  //Java programming

       // String r1=sentence6.substring(7,sentence6.length()-1+1);

        String r1=sentence6.substring(7);

        System.out.println(r1);  //Java programming

      //-------------------------------------------------------------------------------------

        String sentence7="Today is Sunday, Tomorrow is Monday"; //Monday

        String tomorrow= sentence7.substring(sentence7.lastIndexOf(' ')+1);

        System.out.println(tomorrow); //Monday

      //-------------------------------------------------------------------------------------

        String sentence8= "I study at Cydeo School"; //Cydeo School

      //  String r2=sentence8.substring(sentence8.indexOf("C")); //Cydeo School

       String schoolName= sentence8.substring(11);

        System.out.println(schoolName); //Cydeo School

     //-------------------------------------------------------------------------------------

         //repeat()


        String str= "Python";

        String result= (str+"\t").repeat(10); //Python	Python	Python	Python	Python	Python	Python	Python	Python	Python

        System.out.println(result); //PythonPythonPythonPythonPythonPythonPythonPythonPythonPython



//I want to put space after each Python --------> String result2= ( str+"\n").repeat(10); alt alta 1o Python yazilacak.






















    }
}
