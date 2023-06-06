package dailyVideos.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people ={new Person(), new Person(), new Person(), new Person()}; //Array Person Object

        //all new Person() will be assigned a value
        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Gadir",'M', LocalDate.of(1988,1,24));
        people[2].setInfo("Mary",'F', LocalDate.of(1992,2,25));
        people[3].setInfo("Aisa",'F', LocalDate.of(1954,11,5));


        // create ArrayList
        ArrayList<Person> studentsList =new ArrayList<>();

        //how can I tire Array to ArrayList?--->addAll() method
        studentsList.addAll(Arrays.asList(people));
        System.out.println(studentsList);


        //print name & date of birth of each person object




        //remove the students older than 55 years old

        studentsList.removeIf(p-> p.age > 55);
        System.out.println(studentsList);










    }
}
