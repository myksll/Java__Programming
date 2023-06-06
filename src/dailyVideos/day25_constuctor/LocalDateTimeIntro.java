package dailyVideos.day25_constuctor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        //now()
        LocalDateTime starts= LocalDateTime.now();
        System.out.println(starts);//2023-04-05  T02:42:35.150686700

        //of()
        LocalDateTime ends= LocalDateTime.of( 2023,5,18,11,0);
        System.out.println(ends); //2023-05-18 T11:00

        //getDayOfWeek()
        System.out.println(starts.getDayOfWeek());//WEDNESDAY

        //getHour()
        System.out.println(starts.getHour());//2













    }
}
