package practices.day22_practices;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";  //size

      int upperCase =0;     int lowerCase=0;

        for (int i = 0; i < str.length(); i++) {

             char each =  str.charAt(i);

             if(Character.isUpperCase(each)){
                 upperCase++;
             }else if(Character.isLowerCase(each)){
                 lowerCase++;
             }else{
                 continue;
             }




        }

        System.out.println(   upperCase== lowerCase);



    }

}
/*
2. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

 */