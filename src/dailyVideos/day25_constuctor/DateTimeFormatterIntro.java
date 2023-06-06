package dailyVideos.day25_constuctor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        //localDate
        DateTimeFormatter df= DateTimeFormatter.ofPattern( "y") ;   //df-->is usually used
        System.out.println(df);//Value(YearOfEra)

        DateTimeFormatter df2= DateTimeFormatter.ofPattern( "yy") ;

        DateTimeFormatter df3= DateTimeFormatter.ofPattern( "M") ;

        LocalDate today = LocalDate.now();
        System.out.println(today );//2023-04-05

        System.out.println(today.format(df) );//2023 -->after formatting we see only year(y) on output
        System.out.println(today.format(df2) );//23
        System.out.println(today.format(df3) );//4 -->months number


        //all format
        DateTimeFormatter df4= DateTimeFormatter.ofPattern( "y MMMM dd") ;
        System.out.println(today.format(df4));//2023 April 05

        DateTimeFormatter df5= DateTimeFormatter.ofPattern( "y/MM/dd, E") ;
        System.out.println(today.format(df5));//2023/04/05

        LocalDate date1=LocalDate.of(2023,02,24); //we can change the format thanks to format() method
        System.out.println(date1.format(df5));//2023/02/24 , Fr


        System.out.println("--------------------------------------------------------------");

        //LocalTime

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm a");//usually like that--->"HH:mm"

        LocalTime time1 = LocalTime.of(17,30);
        System.out.println(tf.format(time1));//05:30 nachm.(PM)

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/y hh:mm a");//04/05/1995 10:03

        LocalDateTime dateTime1 = LocalDateTime.of(1992,4,2 ,10,03);
        System.out.println(dtf.format(dateTime1)); //04/02/1992 10:03 vorm.

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now)); //04/05/2023 04:05 vorm.

    }
}
