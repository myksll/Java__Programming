package dailyVideos.day25_constuctor;

import javax.management.modelmbean.ModelMBeanAttributeInfo;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeObject {

    public static void main(String[] args) {

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEEE,  h:mm a, MMM/d/y ");

        LocalDateTime dateTime1= LocalDateTime.of(2020,11,24,1,0);
        System.out.println(dtf.format(dateTime1));//Dienstag,  1:00 vorm., Nov./24/2020

    }
}
/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */