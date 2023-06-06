package practices.day12_practices;

public class day {

    public static void main(String[] args) {


          day(16);

    }


     public static void day( int num){

        String day=(num==1) ? "Monday"
                : (num==2) ? "Tuesday"
                : (num==3) ? "Wednesday"
                : (num==4) ? "Thursday"
                : (num==5) ? "Friday"
                : (num==6) ? "Saturday"
                : (num==7) ? "Sunday"
                :  "Invalid Number";

         System.out.println(day);

     }













}
/*
4. Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */