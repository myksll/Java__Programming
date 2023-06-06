package practices.day13_practices;

public class title {
    public static void main(String[] args) {

        title("merve");
    }


    public static void title ( String word){

        word= word.toUpperCase().charAt(0)+word.toLowerCase().substring(1);
        System.out.println(word);
    }
}
