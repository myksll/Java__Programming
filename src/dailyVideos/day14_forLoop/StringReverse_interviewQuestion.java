package dailyVideos.day14_forLoop;

public class StringReverse_interviewQuestion {
    public static void main(String[] args) {

        String str = "Java";
        //            0123

        //" avaJ "--->REVERSE OF Java

        String reverse= "";  //"a" "v" "a" "J"--->"avaJ"

        for (int i = str.length()-1; i >= 0 ; i--) {
          reverse += str.charAt(i) ;       // System.out.println(str.charAt(i)); alt alta avaJ yazisi cikar
        }

        System.out.println(reverse);

        System.out.println("------------------------------------------------------");

        String name = " Merve Feyza Karaca" ;

        String result = reverse(name);

        System.out.println(result);

    }

    public static String reverse(String str ){

        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i) ;
        }
        return reverse;
    }









}
