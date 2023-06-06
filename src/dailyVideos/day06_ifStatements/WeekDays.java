package dailyVideos.day06_ifStatements;

public class WeekDays {
    public static void main(String[] args) {

        int number=6;

        boolean isMonday= number==1;
        boolean isTuesday= number==2;
        boolean isWednesday= number==3;
        boolean isThursday= number==4;
        boolean isFriday= number==5;
        boolean isSaturday= number==6;
        boolean isSunday= number==7;


        if (isMonday){
            System.out.println("Monday");
        }

        if (isTuesday){
            System.out.println("Tuesday");
        }

        if (isWednesday){
            System.out.println("Wednesday");
        }

        if (isThursday){
            System.out.println("Thursday");
        }
        if (isFriday){
            System.out.println("Friday");
        }
        if (isSaturday){
            System.out.println("Saturday");
        }
        if (isSunday){
            System.out.println("Sunday");
        }


        System.out.println("------------------------------------------------------------");

        String result="";

        if (isMonday){
           result="Monday";
        }

        if (isTuesday){
           result="Tuesday";
        }

        if (isWednesday){
            result="Wednesday";
        }

        if (isThursday){
           result="Thursday";
        }
        if (isFriday){
            result="Friday";
        }
        if (isSaturday){
            result="Saturday";
        }
        if (isSunday){
           result="Sunday";
        }

        System.out.println(result);















    }
}
