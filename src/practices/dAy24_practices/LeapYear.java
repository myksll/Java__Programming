package practices.dAy24_practices;

import dailyVideos.day24_dateAndTime.LocalDateIntro;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear =scan.nextInt();

        LocalDate birthYear2 = LocalDate.of(birthYear,11,28);
        System.out.println( birthYear2.isLeapYear());
    }
}
/*
Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
 */