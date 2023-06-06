package dailyVideos.day05_operators;

public class logicalOperators {
    public static void main(String[] args) {



 // && and
        String answer= "maybe";

    boolean validAnswer=  answer == "yes" && answer=="no";

        System.out.println(validAnswer); // false

         // || or

        String answer1= "maybe";

        boolean validAnswer1=  answer1 == "yes" || answer1=="no";

        System.out.println(validAnswer1); // false

        System.out.println("----------------------------");

        // ! logical not

        System.out.println( !true); // false


        System.out.println("-------------------------------------------");


        System.out.println( true == !false && false==!true && true != !true);

















    }
}