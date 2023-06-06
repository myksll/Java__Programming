package dailyVideos.day24_dateAndTime;


import java.sql.SQLOutput;
import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {


        //now()method
        LocalDate today = LocalDate.now();
        System.out.println(today);//2023-04-04  year-month-day

        //of()method

        LocalDate birthday = LocalDate.of(2000,11,30); //day should be until 31, month 12
        System.out.println(birthday);//2000-11-01

        System.out.println("-----------------------------------------------------------------------------------");

        //getYear()-> what is the year? ---->as a number

        System.out.println(today.getYear()); //2023

        //getMonth()--> name of month

        System.out.println(today.getMonth()); //APRIL

        //getMonthValue()--> month as a number

        System.out.println(today.getMonthValue());//4

        //getDayOfWeek() --> name of day

        System.out.println(today.getDayOfWeek());//TUESDAY

        //getDayOfMonth()--> as number

        System.out.println(today.getDayOfMonth());//4

        //getDayOfYear() -->as number

        System.out.println(today.getDayOfYear());//94

        System.out.println("----------------------------------------------------------------------------------------");

        //correct Local name is changed
        //plusYears()

        today.plusYears(1); //year will be increased by 1
        System.out.println(today);//2023-04-04-->immutable-->it is still previous reference variable

        today = today.plusYears(1); //we need to assign same variable
        System.out.println(today); //2024-04-04

        System.out.println("----------------------------------------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4); //the number should be increased by 2


        //plusYears()
        graduationDate.plusYears(2); //2027-6-4
        System.out.println(graduationDate);//2025-06-04-->you need to assign same variable

        graduationDate= graduationDate.plusYears(2);
        System.out.println(graduationDate);


        //plusMonth()
                                                              //2027-06-04 + 7 months
        graduationDate =graduationDate.plusMonths(7);  //2028-01-04
        System.out.println(graduationDate);

        //plusWeek()
                                                                 //2028-01-04 + 7 week
        graduationDate = graduationDate.plusWeeks(7); //2028-02-22
        System.out.println(graduationDate);

        //plusDay()
                                                                 //2028-02-22 + 100 days
        graduationDate = graduationDate.plusDays(100);  //2028-06-01
        System.out.println(graduationDate);

        System.out.println("--------------------------------------------------------------------------------------------");


        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        // minusYear() ~ minusMonth()

        LocalDate yourBrotherBirthday= yourBirthday.minusYears(2).minusMonths(3);
        System.out.println(yourBrotherBirthday);//2003-01-01


        //minusDays()

        yourBrotherBirthday=yourBirthday.minusDays(100);//2004-12-22
        System.out.println(yourBrotherBirthday);


        System.out.println("--------------------------------------------------------------------------------------------");

        //isEqual()

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1); //false

        System.out.println("--------------------------------------------------------------------------------------------");

        //isBefore()
        LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));//false

        //isAfter()
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));//true

        //isLeapYear()-->if year is a leap year-->that means, february 29 is commonly referred to as leap day

        System.out.println(LocalDate.of(2022,6,16).isLeapYear()); //false



    }

}
