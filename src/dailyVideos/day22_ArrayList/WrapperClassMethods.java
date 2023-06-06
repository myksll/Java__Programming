package dailyVideos.day22_ArrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        //parse method---> we call from wrapper class, to convert String to primitive.
        String str = "20"; //20 is text, not number
        System.out.println(str + 1); //201

        Integer num1 = Integer.valueOf(str); //String converts Integer(wrapper class) --->Auto boxing
        System.out.println(num1); //20

        int num2=Integer.parseInt(str); // String converts int -->turns primitive value
        System.out.println(num2+1); //21

        System.out.println("-------------------------------------------------------------------------------");

        //valueOf method--> we call from wrapper class, to convert String to Wrapper class
        String s = " 20.5";
        double s3 = Double.parseDouble(s); //parse method-->turns primitive class -->20.5
        Double s2 = Double.valueOf(s);    // valueOf method---> turns wrapper class--->20.5

        System.out.println(s3);
        System.out.println(s2);

        System.out.println("-------------------------------------------------------------------------------");

        String x = "true";    //if we write here Maybe, boolean returns false, because boolean can be eiter true or false
        boolean r1 =Boolean.parseBoolean(x);  //String-->boolean
        System.out.println(r1); //true

        Boolean r2= Boolean.valueOf(x);         //String---> boolean from wrapper class
        System.out.println(r2); //true

        System.out.println("-------------------------------------------------------------------------------");

        //isDigit() method
        char ch = '1';   //char--->boolean with isDigit()
        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit); //true

        char ch1 = 'A';   //char--->boolean with isDigit()
        boolean isDigitt = Character.isDigit(ch1);
        System.out.println(isDigitt); //false

        System.out.println("-------------------------------------------------------------------------------");

       //isLetter() method
        char ch3 = 'A';   //char--->boolean with isLetter()
        boolean isLetter = Character.isLetter(ch3);
        System.out.println(isLetter); //true

        System.out.println("-------------------------------------------------------------------------------");

       //isLowerCase() method  ~ isUpperCase() method

        char ch4 = 'A';   //char--->boolean with isLowercase()
        boolean isLowerCase = Character.isLowerCase(ch4);
        System.out.println(isLowerCase); //false

        boolean isUpperCase = Character.isUpperCase(ch4);
        System.out.println(isUpperCase); //true

        System.out.println("-------------------------------------------------------------------------------");

        //  ! isLetterOrDigit() --->means special character §,$,&,/.....

        char ch5 = '$';   //char--->boolean with isLetterOrDigit()
        boolean isLetterOrDigit= !Character.isLetterOrDigit(ch5); //special character
        System.out.println(isLetterOrDigit); //true

        System.out.println("-------------------------------------------------------------------------------");

        String string = "a1b2c3d4e5f";  // sum all digits

        int sum = 0 ;

        // we must create an Array(Data Structure) from string (String) by using toCharArray

         // 1.way --> char[] stringArray=  string.toCharArray();
        // 2. way---> we can use for each loop with toCharArray method together.

    for(char each : string.toCharArray()){        //we take each character

       if(Character.isDigit(each))  {  // we find  whether Character from Wrapper class is digit ,and then we convert char to int
             Integer.parseInt(""+each);     // we call Integer from Wrapper class and parseInt() method

            }

        }




    }
}
