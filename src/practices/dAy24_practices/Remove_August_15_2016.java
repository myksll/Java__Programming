package practices.dAy24_practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_August_15_2016 {
    public static void main(String[] args) {


        ArrayList<LocalDate> dates= new ArrayList<>(Arrays.asList(LocalDate.of(2014,2,5),LocalDate.of(2025,5,7),LocalDate.of(2012,7,9)));

        LocalDate currentDate= LocalDate.of(2015,8,15);

        dates.removeIf(p-> p.isBefore(currentDate));
        System.out.println(dates);//[2025-05-07]





    }
}
/*
9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016

 */