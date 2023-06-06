package practices.day06_practices;

public class CharacterIdentity {
    public static void main(String[] args) {

    char ch ='@';

    boolean isDigit= ch>='0' && ch<='9';
    boolean isLetter= (ch>='A'&& ch<='Z') || (ch>='a'&& ch<='z');
    boolean isSpecialCharacter= !isDigit && !isLetter;

    String result="" ;


       if (isDigit){
        result="Digit";
       }
         if (isLetter){
            result="Alphabetic";
        }

        if (isSpecialCharacter){
            result="Special Character";
        }
        System.out.println(result);












    }
}
