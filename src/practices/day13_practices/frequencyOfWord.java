package practices.day13_practices;

public class frequencyOfWord {
    public static void main(String[] args) {

       frequencyOfWord("merve     merve     ", "merve");

    }

    public static void frequencyOfWord (String sentence, String word){

       sentence = sentence.toLowerCase();
       word= word. toLowerCase();

       String sentenceWithoutWord = sentence.replaceAll(word," ");

       int frequencyOfWord = (sentence.length()-sentenceWithoutWord.length())/word.length();

        System.out.println(frequencyOfWord);

    }







}
