package dailyVideos.day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {


        int n =3;
 // 1

        boolean has28days= n==2;
        boolean has30Days= n==4 || n==6||n==9 ||n==11 ;
        boolean has31Days= !has30Days && !has28days;



        if(has30Days){
            System.out.println("30 days");
        }

        if(has28days ){
            System.out.println("28 days");
        }

        if(has31Days){
            System.out.println("31 days");
        }

        System.out.println("....................................................");

//2

        String result ="";


        if(has30Days){
            result="30 days";
        }

        if(has28days ){
            result="28 days";
        }

        if(has31Days){
            result="31 days";
        }


        System.out.println(result);




    }
}
