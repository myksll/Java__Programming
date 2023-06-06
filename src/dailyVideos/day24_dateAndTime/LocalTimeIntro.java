package dailyVideos.day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        //of()
        LocalTime starting_time= LocalTime.of(10,30);  //10:30
        System.out.println(starting_time);

        //now()
        LocalTime right_now = LocalTime.now();
        System.out.println(right_now); //02:44:40.753063900-->hours:minutes:seconds:nanoseconds

        System.out.println("------------------------------------------------------------------------------------");

        LocalTime time1 = LocalTime.of(12,55);   //  max number-->  23:59:59 , otherwise it will give error(DateTimeException)
        System.out.println(time1); //12:55

        //plusHours(),plusMinutes(),plusSeconds(),plusNanos() ~~ //minusHours(), minusMinutes(), minusSeconds(), minusNanos(),

        time1 = time1.plusHours(1); //
        System.out.println(time1); //13:55

        time1 = time1.plusMinutes(45); //
        System.out.println(time1); //14:40


    }
}
