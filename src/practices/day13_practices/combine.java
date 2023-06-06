package practices.day13_practices;

public class combine {
    public static void main(String[] args) {


        System.out.println(combine("oneöpo","oeight"));

    }

    public static String combine(String word1, String word2){


      String lastOfWord1 = word1.substring(word1.length()-1);

      return ( word2.startsWith(lastOfWord1))? word1+word2.substring(1) : "invalid";

    }







}
