package practices.day12_practices;

public class monthName {
    public static void main(String[] args) {


       monthName(15);

    }


    public static void monthName(int num){

        String month= (num==1)? "January"
                : (num==2)? "February"
                : (num==3)? "March"
                : (num==4)? "April"
                : (num==5)? "May"
                : (num==6)? "June"
                : (num==7)? "July"
                : (num==8)? "August"
                : (num==9)? "September"
                : (num==10)? "October"
                : (num==11)? "November"
                : (num==12)? "December"
                :  "Invalid Number";


        System.out.println(month);




    }

}
/*
3. Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */