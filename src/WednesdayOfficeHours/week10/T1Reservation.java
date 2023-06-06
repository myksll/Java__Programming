package WednesdayOfficeHours.week10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1Reservation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Do you want to create a reservation?\nEnter the year to create reservation.");
        int year=scanner.nextInt();

        System.out.println("Enter the month to create reservation.");
        int month=scanner.nextInt();

        System.out.println("Enter the day to create reservation.");
        int day=scanner.nextInt();

        System.out.println("Enter the hour to create reservation.");
        int hour=scanner.nextInt();

        scanner.close();

        LocalDateTime dateTime= LocalDateTime.of(year,month,day,hour,0);

        if(dateTime.getYear() != 2023){
            System.out.println(" Sorry we cannot make a reservation for the year" +  year);
            System.exit(0);
        }

        if(dateTime.isBefore(LocalDateTime.now())){
            System.out.println(" Sorry this date has already passed");
            System.exit(0);
        }

        if((dateTime.getMonthValue() ==11 && dateTime.getDayOfMonth()==23)|| (dateTime.getMonthValue() ==12 && dateTime.getDayOfMonth()==24) ){
            System.out.println(" Sorry this date is all booked");
            System.exit(0);
        }

        boolean validTime= dateTime.getHour() >= 14 && dateTime.getHour() <= 20;
        boolean onWeekend = dateTime.getDayOfMonth() >=5;


        if(validTime &&  onWeekend){
            System.out.println("Your booking: "+dateTime.format(DateTimeFormatter.ofPattern("MMM/d/yy | h:mm a")));
        }else{


            if(!validTime){
                System.out.println(" Sorry we close at  "+hour+"Sorry we only have time from 2pm to 8pm");
            }

            if(!onWeekend){
                System.out.println(" Sorry we only have availability on weekends");
            }
        }



    }
}