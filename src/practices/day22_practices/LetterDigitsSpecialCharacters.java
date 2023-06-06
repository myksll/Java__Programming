package practices.day22_practices;

public class LetterDigitsSpecialCharacters {
    public static void main(String[] args) {

       String str = "Wooden5 Spoonn!";

       String letters="", digits="", specialChars="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */