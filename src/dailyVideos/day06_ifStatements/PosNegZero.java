package dailyVideos.day06_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number= 5;

        boolean isPositive= number>0;
        boolean isNegative= number<0;
        boolean isZero= number==0;

        if (isPositive){
            System.out.println("Positive");
        }

        if (isNegative){
            System.out.println("Negative");
        }


        if (isZero){
            System.out.println("Zero");
        }

        System.out.println("-----------------------------------------------------------------------");

        String result= "";

        if (isPositive){
            result="Positive";
        }

        if (isNegative){
           result="Negative";
        }


        if (isZero){
            result="Zero";
        }


        System.out.println(result);















    }
}
